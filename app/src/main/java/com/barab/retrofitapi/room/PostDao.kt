package com.barab.retrofitapi.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.OnConflictStrategy.REPLACE
import com.barab.retrofitapi.api.PostResponse

@Dao
interface PostDao {

    @Query("Select * from Post")
    fun getAll(): List<PostEntity>

    @Insert(onConflict = REPLACE)
    fun insert(post: PostEntity)

    @Delete
    fun delete(post: PostEntity)
}
