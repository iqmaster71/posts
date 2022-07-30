package ru.netology

import java.time.LocalDate

data class Photo(
    val id: Int,
    val ownerId: Int,
    val date: LocalDate,
    val title: String,
    val length: Int,
    val width: Int,
    val description: String,
) : Attachment {
    override val type: String
        get() = "Photo"
    val photo: Photo = Photo(
        id = id,
        ownerId = ownerId,
        date = date,
        title = title,
        length = length,
        width = width,
        description = description
    )
}