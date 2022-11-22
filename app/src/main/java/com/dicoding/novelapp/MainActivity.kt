package com.dicoding.novelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private  lateinit var rvNovel : RecyclerView
    private var list : ArrayList<Novel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvNovel = findViewById(R.id.rv_Novel)
        rvNovel.setHasFixedSize(true)

        list.addAll(NovelData.listNovel)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvNovel.layoutManager = LinearLayoutManager(this)
        val listNovelAdapter = ListNovelAdapter(list)
        rvNovel.adapter = listNovelAdapter
    }
}