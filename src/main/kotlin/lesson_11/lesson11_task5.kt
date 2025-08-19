package org.example.lesson_11

import java.util.*

class Forum {
    val member: MutableList<ForumMember> = arrayListOf()
    val message: MutableList<ForumMessages> = arrayListOf()

    fun createNewUser(userName: String): ForumMember {
        val newMember =
            ForumMemberBuilder()
                .apply {
                    userId = UUID.randomUUID()
                    this.userName = userName
                }.build()

        member.add(newMember)

        return newMember
    }

    fun createNewMessage(
        userId: UUID,
        text: String = "",
    ) {
        val member = member.firstOrNull { it.userId == userId }
        if (member != null) {
            val newMessage =
                ForumMessagesBuilder()
                    .apply {
                        authorId = userId
                        message = text
                    }.build()
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
    var userId: UUID,
    var userName: String,
)

class ForumMemberBuilder {
    var userId = UUID(0L, 0L)
    var userName = ""

    fun build(): ForumMember = ForumMember(userId, userName)
}

data class ForumMessages(
    val authorId: UUID,
    val message: String,
)

class ForumMessagesBuilder {
    var authorId = UUID(0L, 0L)
    var message = ""

    fun build(): ForumMessages = ForumMessages(authorId, message)
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
