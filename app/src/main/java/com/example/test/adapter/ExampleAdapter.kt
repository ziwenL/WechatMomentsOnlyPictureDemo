package com.example.test.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.dto.ExampleDto
import com.example.test.utils.GlideUtil
import com.example.test.utils.NetImageUtil

class ExampleAdapter(private var context: Context, private var data: List<ExampleDto>) :
    RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val itemView: View =
            LayoutInflater.from(context).inflate(R.layout.item_example, parent, false)
        val viewHolder = ExampleViewHolder(itemView)
        return viewHolder
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        holder.tvName.setText(String.format("姓名%s",position))
        holder.tvContent.setText(String.format("%s内容",position))
        GlideUtil.loadAvatarPicture(NetImageUtil.getPicUrl(position), holder.ivAvatar)
        GlideUtil.loadPicture(NetImageUtil.getPicUrl(position), holder.ivPicture)


    }

    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tv_name)
        val tvContent: TextView = itemView.findViewById(R.id.tv_content)
        val ivAvatar: ImageView = itemView.findViewById(R.id.iv_avatar)
        val ivPicture: ImageView = itemView.findViewById(R.id.iv_picture)
    }
}