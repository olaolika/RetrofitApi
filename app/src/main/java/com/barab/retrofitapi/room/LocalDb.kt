package com.barab.retrofitapi.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [PostEntity::class], version = 1)
abstract class LocalDb : RoomDatabase() {
    abstract fun PostDao(): PostDao
}