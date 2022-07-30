package ru.netology

import java.util.*

data class Post(
    var id: Int,
    val ownerId: Int,
    val fromId: Int,
    val created_by: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Objects?,
    val copyright: Objects?,
    val like: Objects?,
    val repost: Objects?,
    val views: Objects?,
    val postType: String,
    val postSource: Objects?,
    val geo: Objects?,
    val signerId: Int,
    val copyHistory: Objects?,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Objects?,
    val postponedId: Int
) {

    fun toCreatePost() {
        val postNull = Post(
            id = 0,
            ownerId = 0,
            fromId = 1,
            created_by = 0,
            date = 0,
            text = "PostNull",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = true,
            comments = null,
            copyright = null,
            like = null,
            repost = null,
            views = null,
            postType = "тип",
            postSource = null,
            geo = null,
            signerId = 0,
            copyHistory = null,
            canPin = true,
            canDelete = true,
            canEdit = false,
            isPinned = true,
            markedAsAds = false,
            isFavorite = true,
            donut = null,
            postponedId = 0
        )
    }
}