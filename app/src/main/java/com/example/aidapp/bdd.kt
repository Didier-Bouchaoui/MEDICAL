package com.example.aidapp

import android.content.Context
import android.database.sqlite.SQLiteOpenHelper
import androidx.room.*
import java.security.AccessControlContext

const val DATABASE_NAME= "Bdd"
@Database(entities = [User::class], version=1)
abstract class Bdd: RoomDatabase(){
    abstract fun userDao(): UserDao

}

private lateinit var databaseInstance: Bdd

fun getDatabase(context: Context): Bdd{
    if(!::databaseInstance.isInitialized){
        databaseInstance = Room.databaseBuilder(context,Bdd::class.java, DATABASE_NAME).build()
    }
    return databaseInstance
}