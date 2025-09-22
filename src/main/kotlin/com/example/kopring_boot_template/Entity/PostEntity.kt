package com.example.kopring_boot_template.Entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
@Entity
@Table(name = "posts")
data class PostEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    var name: String,
    var age: Int,
) {
    constructor() : this(0, "", 0)
}
