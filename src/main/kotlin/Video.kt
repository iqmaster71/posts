package ru.netology

import java.time.LocalDate

data class Video(
    val id: Int,
    val ownerId: Int,
    val date: LocalDate,
    val title: String,
    val videoTime: Int,
    val description: String,
) : Attachment {
    override val type: String
        get() = "Video"
    val video: Video =
        Video(id = id, ownerId = ownerId, date = date, title = title, videoTime = videoTime, description = description)
}