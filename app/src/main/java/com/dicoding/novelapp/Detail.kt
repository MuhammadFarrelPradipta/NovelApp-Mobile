package com.dicoding.novelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Detail : AppCompatActivity() {
    companion object {
        const val EXTRA_JUDUL = "extra_judul"
        const val EXTRA_FOTO = "extra_foto"
        const val EXTRA_SINOPSIS = "extra_sinopsis"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

    }
}