package com.amalip.cocktailapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.Query
import androidx.room.Update
import com.amalip.cocktailapp.domain.model.User


@Dao
interface UserDao {
    @Query("SELECT * FROM User WHERE nameUser LIKE :filter")
    fun getUsersByName(filter: String): List<User>

    @Insert(onConflict = IGNORE)
    fun saveUsers(users: List<User>): List<Long>

    @Update
    fun updateUsers(user: User): Int
}