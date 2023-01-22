package com.example.user_list

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class MyDatabase1(
    context: Context?

) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {

        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "UserListDB"
        const val TABLE_NAME = "userList"
        const val KEY_NAME = "name"
        const val KEY_PRICE = "price"
    }

    override fun onCreate(db: SQLiteDatabase?) {

        db?.execSQL("CREATE TABLE $TABLE_NAME ($KEY_NAME TEXT , $KEY_PRICE TEXT )")



    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {

        db?.execSQL("drop table if exists $TABLE_NAME")

        onCreate(db)

    }

    fun addUser(name:String , price : String)
    {
        val db : SQLiteDatabase = this.writableDatabase

        val values : ContentValues = ContentValues()

        values.put("KEY_NAME" , name)
        values.put("KEY_PRICE" , price)

        db.insert(TABLE_NAME , null , values)

    }
}
