package ru.netology

import java.time.LocalDate

data class Graffiti(
    val id: Int,
    val ownerId: Int,
    val date: LocalDate,
    val title: String,
    val length: Int,
    val width: Int,
    val artist: String,
) : Attachment {
    override val type: String
        get() = "Graffiti"
    val graffiti: Graffiti = Graffiti(
        id = id,
        ownerId = ownerId,
        date = date,
        title = title,
        length = length,
        width = width,
        artist = artist
    )
}