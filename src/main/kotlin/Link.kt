package ru.netology

import java.time.LocalDate

data class Link(
    val id: Int,
    val ownerId: Int,
    val date: LocalDate,
    val title: String,
    val url: String,
    val description: String,
) : Attachment {
    override val type: String
        get() = "Link"
    val link: Link = Link(id = id, ownerId = ownerId, date = date, title = title, url = url, description = description)
}