package org.example.lesson_14

import kotlin.random.Random

class Chat {
    val messages = mutableListOf<BaseMessage>()

    fun addMessage(
        text: String,
        author: String,
    ): Int {
        val newMessage = Message(Random.nextInt(1, 100), text, author)
        messages.add(newMessage)
        return newMessage.messageId
    }

    fun addThreadMessage(
        text: String,
        author: String,
        parentMessageId: Int,
    ): Int {
        val newThreadMessage = ChildMessage(Random.nextInt(1, 100), text, author, parentMessageId)
        messages.add(newThreadMessage)
        return newThreadMessage.messageId
    }

    fun printChat() {
        val childMessages: Map<Int, List<ChildMessage>> =
            messages.filterIsInstance<ChildMessage>().groupBy { it.parentMessageId }

        messages.forEach { message ->
            if (message is Message) {
                println(
                    "Сообщение под номером: ${message.messageId} от автора: ${message.author} " +
                        "с текстом: ${message.text}",
                )
                childMessages[message.messageId]?.forEach { child ->
                    println(
                        "\t Сообщение из треда номер: ${child.messageId} от автора: ${child.author} " +
                            "с текстом: ${child.text}",
                    )
                }
            }
        }
    }
}

open class BaseMessage(
    open val messageId: Int,
    open val text: String,
    open val author: String,
)

class Message(
    messageId: Int,
    text: String,
    author: String,
) : BaseMessage(messageId, text, author)

class ChildMessage(
    messageId: Int,
    text: String,
    author: String,
    val parentMessageId: Int,
) : BaseMessage(messageId, text, author)

fun main() {
    val newChat = Chat()

    val message1 = newChat.addMessage("Hello there!", "@alex")
    newChat.addThreadMessage("Hi, Alex", "@ella", message1)
    newChat.addThreadMessage("Hello, Alex", "@kate", message1)

    val message2 = newChat.addMessage("I'm new in this chat", "@alex")
    newChat.addThreadMessage("How can we help you?", "@ella", message2)

    newChat.printChat()
}
