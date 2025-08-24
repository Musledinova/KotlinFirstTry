package org.example.lesson_11

import java.util.*

class Forum {
    val member: MutableList<ForumMember> = arrayListOf()
    val message: MutableList<ForumMessage> = arrayListOf()

    fun createNewUser(userName: String): ForumMember {
        val newMember = ForumMember(Random().nextInt(), userName)
        member.add(newMember)
        return newMember
    }

    fun createNewMessage(
        userId: Int,
        text: String = "",
    ) {
        val member = member.firstOrNull { it.userId == userId }
        if (member != null) {
            val newMessage = ForumMessage(userId, text)

            message.add(newMessage)
        } else {
            println("Пользователь с id=$userId не найден!")
        }
    }

    fun printThread() {
        message.forEach { msg ->
            val author = member.firstOrNull { it.userId == msg.authorId }
            println("${author?.userName}: ${msg.message}")
        }
    }
}

data class ForumMember(
    var userId: Int,
    var userName: String,
)

data class ForumMessage(
    val authorId: Int,
    val message: String,
)

fun main() {
    val newForum = Forum()

    val member1 = newForum.createNewUser("user1")
    val member2 = newForum.createNewUser("user2")

    val message = newForum.createNewMessage(member1.userId, "....")
    val messageMember1 = newForum.createNewMessage(member1.userId, "Hello, world!")

    val message2 = newForum.createNewMessage(member2.userId, "ghbdtn dctv!")
    val messageMember2 = newForum.createNewMessage(member2.userId, "Я родился!")

    newForum.printThread()
}
