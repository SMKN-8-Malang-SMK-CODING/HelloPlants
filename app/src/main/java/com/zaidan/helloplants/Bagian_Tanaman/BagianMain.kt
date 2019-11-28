package com.zaidan.helloplants.Bagian_Tanaman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zaidan.helloplants.R
import kotlinx.android.synthetic.main.activity_bagian.*

class BagianMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bagian)

        val bagiantanaman = arrayListOf(
            Bagian(
                "Bagian - bagian Bunga Anggrek",
                "1. Bunga",
                "2. Batang",
                "3. Daun",
                "4. Buah",
                "5. Akar",
                "bgn_anggrek1.png",
                "bgn_anggrek2.jpg"
            ),
            Bagian(
                "Bagian - bagian Brokoli",
                "1. Akar",
                "2. Batang",
                "3. Daun",
                "4. Bunga",
                "",
                "bgn_brokoli1.png",
                "bgn_brokoli2.png"
            ),
            Bagian(
                "Bagian - bagian Lidah Buaya",
                "1. Akar",
                "2. Batang",
                "3. Daun",
                "",
                "",
                "bgn_lidahbuaya1.jpg",
                "bgn_lidahbuaya2.jpg"
            ),
            Bagian(
                "Bagian - bagian Kayu Putih",
                "1. Akar",
                "2. Daun",
                "3. Batang",
                "4. Bunga",
                "5. Buah",
                "bgn_kayuputih1.jpg",
                "bgn_kayuputih2.jpeg"
            ),
            Bagian(
                "Bagian - bagian Seledri",
                "1. Akar",
                "2. Batang",
                "3. Daun",
                "4. Bunga",
                "5. Buah",
                "bgn_seledri1.jpg",
                "bgn_seledri2.jpg"
            ),
            Bagian(
                "Bagian - bagian Bayam",
                "1. Akar",
                "2. Batang",
                "3. Daun",
                "4. Bunga",
                "5. Biji",
                "bgn_bayam1.jpg",
                "bgn_bayam2.JPG"
            ),
            Bagian(
                "Bagian - bagian Pucuk Merah",
                "1. Akar",
                "2. Batang",
                "3. Daun",
                "4. Bunga",
                "5. Buah",
                "bgn_pckmerah1.jpg",
                "bgn_pckmerah2.jpg"
            )
        )

        rv_bagian.apply {
            layoutManager = LinearLayoutManager(this@BagianMain)
            adapter = BagianAdapter(this@BagianMain, bagiantanaman)
        }
    }
}
