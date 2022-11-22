package com.dicoding.novelapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlin.contracts.Returns

class ListNovelAdapter(private val listNovel : ArrayList<Novel>) : RecyclerView.Adapter<ListNovelAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName : TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail :TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto : ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_novel, parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val novel = listNovel[position]

        Glide.with(holder.itemView.context)
            .load(novel.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvName.text = novel.name
        holder.tvDetail.text = novel.detail
    }

    override fun getItemCount(): Int {
        return listNovel.size
    }
}