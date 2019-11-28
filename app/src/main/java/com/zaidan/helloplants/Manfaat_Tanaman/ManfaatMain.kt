package com.zaidan.helloplants.Manfaat_Tanaman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zaidan.helloplants.R
import kotlinx.android.synthetic.main.activity_manfaat.*

class ManfaatMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manfaat)

        val manfaattumbuhan = arrayListOf(
            Manfaat(
                "Manfaat Anggrek : ",
                "1. Sebagai penghilang stress",
                "2. Dapat digunakan sebagai bahan makanan",
                "3. Mencegah terjadi penuaan dini",
                "4. Dapat menghilangkan racun diudara",
                "5. Dapat digunakan sebagai obat-obatan"
            ),
            Manfaat(
                "Manfaat Brokoli : ",
                "1. Meningkatkan daya tahan tubuh",
                "2. Menyehatkan kulit",
                "3. Membantu proses penurunan berat badan",
                "4. Meningkatkan kesehatan jantung",
                "5. Menjaga kesehatan tulang"
            ),
            Manfaat(
                "Manfaat Lidah Buaya : ",
                "1. Membantu menjaga kesehatan rambut",
                "2. Membantu mengatasi jerawat",
                "3. Mempercepat penyembuhan luka",
                "4. Meningkatkan kekebalan tubuh",
                "5. Menjaga kesehatan gigi dan mulut"
            ),
            Manfaat(
                "Manfaat Kayu Putih : ",
                "1. Meredakan masalah pernapasan",
                "2. Sebagai aromaterapi",
                "3. Mengurangi gejala demam",
                "4. Menghilangkan rasa nyeri",
                "5. Mencegah infeksi pada luka"
            ),
            Manfaat(
                "Manfaat Seledri : ",
                "1. Menurunkan kadar kolesterol",
                "2. Meringankan nyeri sendi",
                "3. Menurunkan tekanan darah",
                "4. Meningkatkan sistem pencernaan",
                "5. Mencegah infeksi dan meningkatkan sistem imun"
            ),
            Manfaat(
                "Manfaat Bayam : ",
                "1. Menjaga sistem kekebalan tubuh",
                "2. Menjaga kesehatan mata",
                "3. Menyehatkan tulang",
                "4. Menjaga kesehatan kulit",
                "5. Menguatkan otot"
            ),
            Manfaat(
                "Manfaat Pucuk Merah : ",
                "1. Sebagai pewarna makanan",
                "2. Sebagai antioksidan alami dan obat diabetes",
                "3. Sebagai pengharum ruangan",
                "4. Sebagai penyerap karbon",
                "5. Sebagai pencegah longsor"
            )

        )
        rv_manfaat.apply {
            layoutManager = LinearLayoutManager(this@ManfaatMain)
            adapter = AdapterManfaat(this@ManfaatMain, manfaattumbuhan)
        }
    }
}
