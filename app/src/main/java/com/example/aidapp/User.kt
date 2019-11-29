package com.example.aidapp

import androidx.room.*
import java.util.*


@Entity

data class User(

    @PrimaryKey (autoGenerate=true)
    val id: Int=0,
    val name: String,
    val desc: String,
    val quantity:Int,
    val date:String)
