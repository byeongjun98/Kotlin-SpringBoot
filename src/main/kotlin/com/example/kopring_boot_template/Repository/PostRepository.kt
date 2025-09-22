package com.example.kopring_boot_template.Repository

import com.example.kopring_boot_template.Entity.PostEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository: JpaRepository<PostEntity, Long>{}