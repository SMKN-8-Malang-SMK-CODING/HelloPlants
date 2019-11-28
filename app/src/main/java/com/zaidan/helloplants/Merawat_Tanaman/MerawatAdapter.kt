package com.zaidan.helloplants.Merawat_Tanaman

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.firebase.storage.FirebaseStorage
import com.zaidan.helloplants.Nama_Tanaman.Set2_Name
import com.zaidan.helloplants.R
import kotlinx.android.synthetic.main.item_merawat.view .*

class MerawatAdapter(val context: Context, val listMerawat: ArrayList<Merawat>) :
    RecyclerView.Adapter<MerawatAdapter.ViewHolder>() {
    val storage = FirebaseStorage.getInstance().reference.child("gambar_tanaman")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_merawat, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMerawat.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tv_item_dirawat.text = listMerawat[position].dirawat
        holder.itemView.tv_item_merawat1.text = listMerawat[position].cara1


        storage.child(listMerawat[position].gambar!!).downloadUrl.addOnSuccessListener {
            Glide.with(context).load(it).into(holder.itemView.iv_item_merawat1)
        }

        holder.itemView.setOnClickListener {
            val set3_intent = Intent(context, MerawatDeskripsi::class.java)

            set3_intent.putExtra("Merawat_Extra", listMerawat[position])


            context.startActivity(set3_intent)

        }


    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

}