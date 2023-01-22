package com.example.user_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class AddUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_user)

        val categories = resources.getStringArray(R.array.categories)

        val spinner: Spinner = findViewById(R.id.Spinner1)

        if (spinner != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, categories
            )
            spinner.adapter = adapter
        }

      // val mydb1 : MyDatabase1 = MyDatabase1(this)          //creating the database

      //  mydb1.addUser("Navkar" , "90000")


    }
}