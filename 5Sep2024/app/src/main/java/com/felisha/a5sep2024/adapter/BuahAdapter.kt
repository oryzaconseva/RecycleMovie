package com.felisha.a5sep2024.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.felisha.a5sep2024.R
import com.felisha.a5sep2024.model.ModelBuah

data class BuahAdapter(val itemList: ArrayList<ModelBuah>) :
        RecyclerView.Adapter<BuahAdapter.MyViewHolder>() {
        class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
                //deklarasi widget dari item layout
                var itemImage: ImageView
                var itemText: TextView

                init {
                        itemImage = itemView.findViewById(R.id.gambar)
                        itemText = itemView.findViewById(R.id.nama)
                }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
                //kita deklare layout
                val nView = LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_costum_buah, parent, false)
                return MyViewHolder(nView)
        }

        override fun getItemCount(): Int {
                return itemList.size
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
                //set data ke widget
                holder.itemImage.setImageResource(itemList[position].image)
                holder.itemText.setText(itemList[position].judul)
        }

        }