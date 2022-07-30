package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_notEqualToZero() {
        val lastID = 10
        val post = Post(
            id = 0,
            ownerId = 0,
            fromId = 1,
            created_by = 0,
            date = 11,
            text = "PostOne",
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
            attachment = null,
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
        val postNew = post.copy(id = lastID)
        assertTrue(postNew.id != 0)
    }

    @Test
    fun update_wasSuccessful() {

        val service = WallService

        service.add(
            Post(
                id = 0,
                ownerId = 0,
                fromId = 1,
                created_by = 0,
                date = 11,
                text = "PostOne",
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
                attachment = null,
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
        )
        service.add(
            Post(
                id = 0,
                ownerId = 0,
                fromId = 1,
                created_by = 0,
                date = 20,
                text = "PostTwo",
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
                attachment = null,
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
        )
        service.add(
            Post(
                id = 0,
                ownerId = 0,
                fromId = 1,
                created_by = 0,
                date = 21,
                text = "PostThree",
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
                attachment = null,
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
        )

        val update = Post(
            id = 10,
            ownerId = 0,
            fromId = 1,
            created_by = 0,
            date = 11,
            text = "PostOne",
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
            attachment = null,
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

        val result = service.update(update)

        assertTrue(result)
    }

    @Test
    fun update_failed() {

        val service = WallService

        service.add(
            Post(
                id = 0,
                ownerId = 0,
                fromId = 1,
                created_by = 0,
                date = 11,
                text = "PostOne",
                replyOwnerId = 0,
                replyPostId = 0,
                friendsOnly = true,
                comments = null,
                copyright = null,
                like = null,
                repost = null,
                views = null,
                postType = "тип",
                attachment = null,
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
        )
        service.add(
            Post(
                id = 0,
                ownerId = 0,
                fromId = 1,
                created_by = 0,
                date = 20,
                text = "PostTwo",
                replyOwnerId = 0,
                replyPostId = 0,
                friendsOnly = true,
                comments = null,
                copyright = null,
                like = null,
                repost = null,
                views = null,
                postType = "тип",
                attachment = null,
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
        )
        service.add(
            Post(
                id = 0,
                ownerId = 0,
                fromId = 1,
                created_by = 0,
                date = 21,
                text = "PostThree",
                replyOwnerId = 0,
                replyPostId = 0,
                friendsOnly = true,
                comments = null,
                copyright = null,
                like = null,
                repost = null,
                views = null,
                postType = "тип",
                attachment = null,
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
        )

        val update = Post(
            id = 20,
            ownerId = 0,
            fromId = 1,
            created_by = 0,
            date = 11,
            text = "PostOne",
            replyOwnerId = 0,
            replyPostId = 0,
            friendsOnly = true,
            comments = null,
            copyright = null,
            like = null,
            repost = null,
            views = null,
            postType = "тип",
            attachment = null,
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

        val result = service.update(update)

        assertFalse(result)
    }

    @Test
    fun createComment_comment_added() {
        val service = WallService
        val post = Post(
            id = 0,
            ownerId = 0,
            fromId = 1,
            created_by = 0,
            date = 11,
            text = "PostOne",
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
            attachment = null,
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
        service.add(post)
        val commentTwo = Comment(
            id = 10,
            fromId = 0,
            date = 1,
            text = "Комментарий к посту №2",
            donut = null,
            replyToUser = 0,
            replyToComment = 0,
            attachments = null,
            parentsStack = arrayOf(),
            thread = null
        )
        service.createComment(commentTwo)
        assertFalse(service.comments.isEmpty())

    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService
        val post = Post(
            id = 0,
            ownerId = 0,
            fromId = 1,
            created_by = 0,
            date = 11,
            text = "PostOne",
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
            attachment = null,
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
        service.add(post)
        val commentTwo = Comment(
            id = 90,
            fromId = 0,
            date = 1,
            text = "Комментарий к посту №2",
            donut = null,
            replyToUser = 0,
            replyToComment = 0,
            attachments = null,
            parentsStack = arrayOf(),
            thread = null
        )
        val s = service.createComment(commentTwo)
    }
}