package org.example.lesson_11

import java.util.*

class Forum {
    val member: MutableList<ForumMember> = arrayListOf()
    val message: MutableList<ForumMessage> = arrayListOf()

    fun createNewUser(userName: String): ForumMember {
        val newMember =
            ForumMember
                .Builder()
                .userId(Random().nextInt())
                .userName(userName)
                .build()

        member.add(newMember)

        return newMember
    }

    fun createNewMessage(
        userId: Int,
        text: String = "",
    ) {
        val member = member.firstOrNull { it.userId == userId }
        if (member != null) {
            val newMessage =
                ForumMessage
                    .Builder()
                    .authorId(userId)
                    .message(text)
                    .build()

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
) {
    data class Builder(
        var userId: Int = 0,
        var userName: String = "",
    ) {
        fun userId(userId: Int) = apply { this.userId = userId }

        fun userName(userName: String) = apply { this.userName = userName }

        fun build() = ForumMember(userId, userName)
    }
}

data class ForumMessage(
    val authorId: Int,
    val message: String,
) {
    data class Builder(
        var authorId: Int = 0,
        var message: String = "",
    ) {
        fun authorId(authorId: Int) = apply { this.authorId = authorId }

        fun message(message: String) = apply { this.message = message }

        fun build() = ForumMessage(authorId, message)
    }
}

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
