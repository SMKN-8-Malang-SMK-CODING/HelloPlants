package com.zaidan.helloplants.Merawat_Tanaman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.google.firebase.storage.FirebaseStorage
import com.zaidan.helloplants.R
import kotlinx.android.synthetic.main.activity_merawat_deskripsi.*
import kotlinx.android.synthetic.main.item_merawat.*

class MerawatDeskripsi : AppCompatActivity() {

    val storage2 = FirebaseStorage.getInstance().reference.child("gambar_tanaman")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_merawat_deskripsi)

        val merawatplants = intent.getParcelableExtra<Merawat>("Merawat_Extra")!!

        storage2.child(merawatplants.gambarperawatan!!).downloadUrl.addOnSuccessListener {
            Glide.with(this).load(it).into(imageNameMerawat02)
        }

        textViewMerawat.text = merawatplants.dirawat
        textViewMerawat1.text = merawatplants.cara1
        textViewMerawat2.text = merawatplants.cara2
        textViewMerawat3.text = merawatplants.cara3
        textViewMerawat4.text = merawatplants.cara4
        textViewMerawat5.text = merawatplants.cara5


    }
}
