package com.zaidan.helloplants.Nama_Tanaman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.google.firebase.storage.FirebaseStorage
import com.zaidan.helloplants.R
import kotlinx.android.synthetic.main.activity_set2name.*

class Set2_Name : AppCompatActivity() {
    val storage1 = FirebaseStorage.getInstance().reference.child("gambar_tanaman")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set2name)

        val tanaman = intent.getParcelableExtra<Tanaman>("extra_tanaman")!!

        storage1.child(tanaman.namaGambar!!).downloadUrl.addOnSuccessListener {
            Glide.with(this).load(it).into(imageName01)
        }
        storage1.child(tanaman.GambarBG!!).downloadUrl.addOnSuccessListener {
            Glide.with(this).load(it).into(imageName02)
        }


        textName01.text = tanaman.nama
        textName02.text = tanaman.namalatin
        textName03.text = tanaman.deskripsi

    }
}
