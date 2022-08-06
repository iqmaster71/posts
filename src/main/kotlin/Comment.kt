package ru.netology

import java.util.*

data class Comment(
    var id: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val donut: Objects?,
    val replyToUser: Int,
    val replyToComment: Int,
    val attachments: Objects?,
    val parentsStack: Array<Any>,
    val thread: Objects?
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Comment

        if (!parentsStack.contentEquals(other.parentsStack)) return false

        return true
    }

    override fun hashCode(): Int {
        return parentsStack.contentHashCode()
    }
}