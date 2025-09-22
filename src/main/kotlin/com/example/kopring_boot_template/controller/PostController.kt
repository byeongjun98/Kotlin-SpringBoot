package com.example.kopring_boot_template.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class PostController {
    @GetMapping("posts")
    fun getPosts(): String {
        return "Hello World!"
    }
}