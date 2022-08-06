package ru.netology

object WallService {
    private var posts = emptyArray<Post>()
    private var lastID = 10
    var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        val postNew = post.copy(id = lastID)
        posts += postNew
        lastID++
        println("Пост добавлен")
        return posts.last()
    }

    fun update(posti: Post): Boolean {
        posts.forEachIndexed { index, post ->
            if (posts[index].id == posti.id) {
                posts[index] = posti.copy(id = posts[index].id, date = posts[index].date)
                return true
            }
        }
        return false
    }


    fun createComment(comment: Comment) {

        posts.forEachIndexed { index, com ->
            if (posts[index].id == comment.id) {
                comments += comment
                println()
                println("Комментарий добавлен")
                return
            }
        }
        println()
        throw PostNotFoundException("Комментарий не добавлен!")
    }
}