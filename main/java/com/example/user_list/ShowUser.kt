package com.example.user_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ShowUser : AppCompatActivity() {

    private val arrayUser : ArrayList<Model1> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_user)

        var recyclerView : RecyclerView = findViewById(R.id.Recycler1)

        recyclerView.layoutManager = LinearLayoutManager(this)

      //  val model1 = Model1(R.drawable.ic_launcher_background , "Product1" , "500000")

        arrayUser.add(Model1(R.drawable.ic_launcher_background,"Product 1" , "500000"))
        arrayUser.add(Model1(R.drawable.ic_launcher_background,"Product 2" , "500000"))
        arrayUser.add(Model1(R.drawable.ic_launcher_background,"Product 3" , "500000"))
        arrayUser.add(Model1(R.drawable.ic_launcher_background,"Product 4" , "500000"))
        arrayUser.add(Model1(R.drawable.ic_launcher_background,"Product 5" , "500000"))
        arrayUser.add(Model1(R.drawable.ic_launcher_background,"Product 6" , "500000"))
        arrayUser.add(Model1(R.drawable.ic_launcher_background,"Product 7" , "500000"))
        arrayUser.add(Model1(R.drawable.ic_launcher_background,"Product 8" , "500000"))
        arrayUser.add(Model1(R.drawable.ic_launcher_background,"Product 9" , "500000"))

        val customAdapter : CustomAdapter = CustomAdapter(arrayUser)

        recyclerView.adapter = customAdapter




    }
}