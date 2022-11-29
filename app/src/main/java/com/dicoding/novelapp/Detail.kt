package com.dicoding.novelapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Detail : AppCompatActivity() {
    companion object {
        const val EXTRA_JUDUL = "extra_judul"
        const val EXTRA_FOTO = "extra_foto"
        const val EXTRA_SINOPSIS = "extra_sinopsis"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val Tv_Judul : TextView = findViewById(R.id.tv_judul)
        val Tv_sinopsis : TextView = findViewById(R.id.tv_sinopsis)
        val Image_View : ImageView = findViewById(R.id.imageView)


        val judul = intent.getStringExtra(EXTRA_JUDUL)
        val sinopsis = intent.getStringExtra(EXTRA_SINOPSIS)
        val Image = intent.getIntExtra(EXTRA_FOTO,0)

        Tv_Judul.text = judul
        Tv_sinopsis.text = sinopsis
        Image_View.setImageResource(Image)

    }
}