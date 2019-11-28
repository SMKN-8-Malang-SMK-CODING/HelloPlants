package com.zaidan.helloplants.Nama_Tanaman

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.item_tanaman.view.*
import com.zaidan.helloplants.R

class RecyclerAdapter(val context: Context, val listTanaman: ArrayList<Tanaman>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    val storage = FirebaseStorage.getInstance().reference.child("gambar_tanaman")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_tanaman, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listTanaman.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tv_item_tanaman.text = listTanaman[position].nama
        holder.itemView.tv_item_latin.text = listTanaman[position].namalatin

        storage.child(listTanaman[position].namaGambar!!).downloadUrl.addOnSuccessListener {
            Glide.with(context).load(it).into(holder.itemView.iv_item_tanaman)
        }

        holder.itemView.setOnClickListener {
            val set2_intent = Intent(context, Set2_Name::class.java)

            set2_intent.putExtra("extra_tanaman", listTanaman[position])


            context.startActivity(set2_intent)
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

}