package ru.netology

import java.time.LocalDate

data class Audio(
    val id: Int,
    val ownerId: Int,
    val date: LocalDate,
    val title: String,
    val audioTime: Int,
    val artist: String,

    ) :Attachment {
    override val type: String
        get() = "Audio"
    val audio: Audio =
        Audio(id = id, ownerId = ownerId, date = date, title = title, audioTime = audioTime, artist = artist)
}