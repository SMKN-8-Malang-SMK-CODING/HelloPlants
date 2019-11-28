package com.zaidan.helloplants.Bagian_Tanaman

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zaidan.helloplants.Merawat_Tanaman.MerawatDeskripsi
import com.zaidan.helloplants.R
import kotlinx.android.synthetic.main.item_bagian.view.*

class BagianAdapter(val context: Context, val listBagian: ArrayList<Bagian>) :
    RecyclerView.Adapter<BagianAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_bagian, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBagian.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tv_item_namabagian.text = listBagian[position].BagianBunga
        holder.itemView.tv_item_bagian1.text = listBagian[position].bag1
        holder.itemView.tv_item_bagian2.text = listBagian[position].bag2
        holder.itemView.tv_item_bagian3.text = listBagian[position].bag3
        holder.itemView.tv_item_bagian4.text = listBagian[position].bag4
        holder.itemView.tv_item_bagian5.text = listBagian[position].bag5

        holder.itemView.setOnClickListener {
            val set4_intent = Intent(context, BagianTanaman2::class.java)

            set4_intent.putExtra("Bagian_Extra", listBagian[position])


            context.startActivity(set4_intent)

        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}