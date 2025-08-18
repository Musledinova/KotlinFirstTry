package org.example.lesson_11

class ChatRoom(
    val label: String,
    val roomName: String,
    val roomMembers: MutableList<RoomMember> = arrayListOf(),
) {
    fun addMember(member: RoomMember) {
        roomMembers.add(member)
    }

    fun refreshMemberStatus(
        memberNickName: String,
        newStatus: Status,
    ) {
        val member = roomMembers.firstOrNull { it.nickName == memberNickName }
        if (member != null) {
            member.status = newStatus
        }
    }
}

enum class Status(
    status: String,
) {
    TALKING("разговаривает"),
    MIC_OFF("микрофон выключен"),
    MUTED("пользователь заглушен"),
}

class RoomMember(
    val nickName: String,
    val avatar: String,
    var status: Status = Status.MIC_OFF,
)

fun main() {
    val member1 = RoomMember("Мама прекрасного ангелочка", "Картинка_с_ребенком_и_собакой.png", Status.TALKING)
    val member2 = RoomMember("Мама двух ангелочков", "Картинка_с_котиками.png", Status.MIC_OFF)

    val room = ChatRoom("Картинка_школы.png", "Родительское собрание", arrayListOf(member1, member2))
}
