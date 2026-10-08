package com.example.food.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Dish")
data class DishEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val dishId: Int,
    val authorId: Int,
    val name: String,
    val cookingTime: Int,
    val imagePath: String,
    val difficulty: Float,
    val postDate: Int,
    val description: String,
    val kitchen: String,
    val kitchenTime: Int,
    val rating: Float,
    val spicyDish: Float,
)