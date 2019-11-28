package com.zaidan.helloplants.Manfaat_Tanaman

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zaidan.helloplants.R
import kotlinx.android.synthetic.main.item_manfaat.view.*


class AdapterManfaat(val context: Context, val listManfaat: ArrayList<Manfaat>) :
    RecyclerView.Adapter<AdapterManfaat.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_manfaat, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listManfaat.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tv_item_namabunga.text = listManfaat[position].NamaBunga
        holder.itemView.tv_item_manfaat1.text = listManfaat[position].manfaat1
        holder.itemView.tv_item_manfaat2.text = listManfaat[position].manfaat2
        holder.itemView.tv_item_manfaat3.text = listManfaat[position].manfaat3
        holder.itemView.tv_item_manfaat4.text = listManfaat[position].manfaat4
        holder.itemView.tv_item_manfaat5.text = listManfaat[position].manfaat5

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)


}