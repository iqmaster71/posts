package ru.netology

object WallService {
    private var posts = emptyArray<Post>()
    private var lastID = 10


    fun add(post: Post): Post {
        val postNew = post.copy(id = lastID)
        posts += postNew
        lastID++
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
}