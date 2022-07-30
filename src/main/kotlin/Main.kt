package ru.netology

class PostNotFoundException(message: String) : RuntimeException(message)

fun main() {
    val wallService = WallService
    var postOne = Post(
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
    postOne = wallService.add(postOne)
    var postTwo = Post(
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
    postTwo = wallService.add(postTwo)
    var postThree = Post(
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
    postThree = wallService.add(postThree)


    if (wallService.update(postTwo)) {
        println("Пост откорректирован")
    } else {
        println("Такого поста нет")
    }

    val postFour = Post(
        id = 99,
        ownerId = 0,
        fromId = 1,
        created_by = 0,
        date = 1,
        text = "PostFour",
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
    if (wallService.update(postFour)) {
        println("Пост откорректирован")
    } else {
        println("Такого поста нет")
    }

    val commentOne = Comment(
        id = 11,
        fromId = 0,
        date = 1,
        text = "Комментарий к посту №1",
        donut = null,
        replyToUser = 0,
        replyToComment = 0,
        attachments = null,
        parentsStack = arrayOf(),
        thread = null
    )
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
    val commentThree = Comment(
        id = 87,
        fromId = 0,
        date = 1,
        text = "Комментарий к посту №3",
        donut = null,
        replyToUser = 0,
        replyToComment = 0,
        attachments = null,
        parentsStack = arrayOf(),
        thread = null
    )

    wallService.createComment(commentOne)
    wallService.createComment(commentTwo)
    wallService.createComment(commentThree)

}