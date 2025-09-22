package com.example.kopring_boot_template.Controller

import com.example.kopring_boot_template.Entity.PostEntity
import com.example.kopring_boot_template.Service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/posts")
class PostController {

    @Autowired
    private lateinit var postService: PostService

    @GetMapping
    fun getAllPosts(): ResponseEntity<List<PostEntity>> {
        val posts = postService.getAllPosts()
        return ResponseEntity(posts, HttpStatus.OK)
    }

    @PostMapping
    fun createPost(@RequestParam name: String, @RequestParam age: Int): ResponseEntity<PostEntity> {
        val createdPost = postService.createPost(name, age)
        return ResponseEntity(createdPost, HttpStatus.CREATED)
    }

    @GetMapping("/{id}")
    fun getPost(@PathVariable id: Long): ResponseEntity<PostEntity> {
        val post = postService.getPostById(id)
        return if (post != null){
            ResponseEntity(post, HttpStatus.OK)
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }

    @PutMapping("/{id}")
    fun updatePost(
        @PathVariable id: Long,
        @RequestParam name: String,
        @RequestParam age: Int
    ): ResponseEntity<PostEntity?> {
        val updatedPost = postService.updatePost(id, name, age)
        return if (updatedPost != null){
            ResponseEntity(updatedPost, HttpStatus.OK)
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }

    @DeleteMapping("/{id}")
    fun deletePost(@PathVariable id: Long): ResponseEntity<Unit> {
        val isDeleted = postService.deletePost(id)
        return if(isDeleted){
            ResponseEntity(HttpStatus.NO_CONTENT)
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }
}