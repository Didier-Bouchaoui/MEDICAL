package com.example.aidapp

import androidx.room.*

@Dao
interface UserDao{
    @Query(value="SELECT * FROM User")
    fun getUsers(): List<User>

    @Query(value = "Select * FROM User Where id=:id")
    fun getUserById(id: Int):User

    @Insert
    fun insertUsers(vararg user: User)

    @Update
    fun updateUser(vararg user:User)
    @Delete
    fun deleteUser(user: User)
}