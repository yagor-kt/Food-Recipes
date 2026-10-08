package com.example.food.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.food.data.local.entity.ArticleEntity
import com.example.food.data.local.entity.CategoryEntity
import com.example.food.data.local.entity.DishEntity
import com.example.food.data.local.entity.LoverDishEntity
import com.example.food.data.local.entity.ProductEntity
import com.example.food.data.local.entity.UserEntity

@Database(
    entities = [
        CategoryEntity::class,
        DishEntity::class,
        UserEntity::class,
        ProductEntity::class,
        LoverDishEntity::class,
        ArticleEntity::class,
   ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase: RoomDatabase(){
    abstract fun getDao(): Nothing

    companion object{
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase =
            INSTANCE ?: buildDatabase(context).also{
                INSTANCE = it
            }

        private fun buildDatabase(context: Context): AppDatabase =
            Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "food_recipes_database"
            ).build()
    }
}