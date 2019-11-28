package com.zaidan.helloplants.Bagian_Tanaman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.google.firebase.storage.FirebaseStorage
import com.zaidan.helloplants.R
import kotlinx.android.synthetic.main.activity_bagian_tanaman2.*

class BagianTanaman2 : AppCompatActivity() {

    val storage3 = FirebaseStorage.getInstance().reference.child("gambar_bagian")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bagian_tanaman2)

        val bagianplants = intent.getParcelableExtra<Bagian>("Bagian_Extra")!!

        storage3.child(bagianplants.gambar1!!).downloadUrl.addOnSuccessListener {
            Glide.with(this).load(it).into(bagian01)
        }
        storage3.child(bagianplants.gambar2!!).downloadUrl.addOnSuccessListener {
            Glide.with(this).load(it).into(bagian02)
        }

        textViewBagian1.text = bagianplants.bag1
        textViewBagian2.text = bagianplants.bag2
        textViewBagian3.text = bagianplants.bag3
        textViewBagian4.text = bagianplants.bag4
        textViewBagian5.text = bagianplants.bag5
    }
}
