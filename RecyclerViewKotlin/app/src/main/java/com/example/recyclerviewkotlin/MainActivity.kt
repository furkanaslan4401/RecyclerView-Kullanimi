package com.example.recyclerviewkotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewkotlin.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val nebahat = Model("nebahat","aslan")
        val furkan = Model("furkan","aslan")
        val bahar = Model("bahar","aslan")
        val fatih = Model("fatih","aslan")
        val array = ArrayList<Model>()
        array.add(nebahat)
        array.add(furkan)
        array.add(bahar)
        array.add(fatih)
        val recyclerView : RecyclerView = findViewById(R.id.RecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adepter = ListAdepter(array)
        recyclerView.adapter = adepter
    }

}