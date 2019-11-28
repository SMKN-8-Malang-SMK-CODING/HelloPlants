package com.zaidan.helloplants.Merawat_Tanaman

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager
import com.zaidan.helloplants.R

import kotlinx.android.synthetic.main.activity_merawat.*

class MerawatTanaman : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_merawat)

        val merawat = arrayListOf(
            Merawat(
                "kebun_anggrek.jpg",
                "penyiraman_anggrek.jpg",
                "Cara Merawat Anggrek :",
                "- Sebagaimana tanaman lain, bunga anggrek juga perlu disiram agar tidak mati karena mengalami kekurangan air, disiram paling tidak dua kali dalam sehari.",
                "- Tanaman anggrek memerlukan sinar matahari untuk mendukung pertumbuhannya. Anda bisa menempatkan bunga anggrek pada area yang tidak terkena sinar mathaari langsung.",
                "- Bunga anggrek termasuk tanaman tropis yang bisa bertahan pada lingkungan yang cukup lembab. Tingkat kelembaban tanaman ini harus selalu dijaga agar bisa tumbuh dengan baik.",
                "- Pemberian pupuk anggrek tidak boleh sembarangan, takaran dan jenis pupuk yang diberikan haruslah sesuai dengan kondisi tanaman."

            ),
            Merawat(
                "perkebunan_brokoli.jpg",
                "penyiraman_brokoli.jpg",
                "Cara Merawat Brokoli :",
                "- Menyirami 2 sampai 4 kali dalam seminggu",
                "- Penyiangan rumput dilakukan 3 kali Hari ke 7-10, Hari ke 20, Hari ke 30-35.",
                "- Untuk mengendalikan serangan hama dan penyakit dilakukan penyemprotan pestisida  setiap 2 minggu sekali.",
                "- Pada umur 55-100 hari setelah tanam brokoli sudah bisa dipanen."

            ),
            Merawat(
                "kbn_ldhbuaya.jpg",
                "perawatan_lidahbuaya.jpg",
                "Cara Merawat Lidah Buaya :",
                "- Gunakan tanah kering untuk menanam lidah buaya. Akan lebih baik jika Anda mencampur tanah dengan pasir, batu apung atau perlit.",
                "- Jangan terlalu banyak menyiram tanaman lidah buaya. Sebab, tanaman ini memiliki daun berdaging yang mampu menyimpan air.",
                "- Lidah buaya merupakan tanaman yang bisa tumbuh di area indoor ataupun outdoor selama mendapatkan cahaya matahari yang cukup.",
                "- Pilih pot yang lebar dan dalam untuk mengakomodasi pertumbuhan daun dan tunas lidah buaya. Lidah buaya yang sehat memiliki banyak tunas."

            ),
            Merawat(
                "kbn_kayupth.jpg",
                "kayuputih.jpg",
                "Cara Merawat Kayu Putih :",
                "- Tanaman kayu putih adalah jenis tanaman Yang tidak memerlukan pemeliharaan Yang intensif. Namun umur 1-2 tahun harus lebih diperhatikan dan dipelihara.",
                "- Penyiraman dilakukan 2-4 kali seminggu.",
                "- Pemberian pupuk lanjutan di lapangan cukup menggunakan pupuk kandang secukupnya atau pupuk organik (NPK atau Urea) dengan dosis 100gr/pohon.",
                "- kegiatan pemangkasan ini bertujuan untuk permudaan cabang dan memudahkan dalam pemungutan daun. Untuk yang telah berumur lebih dari 5 tahun sebaiknya dilakukan pemangkasan setinggi 1m."

            ),
            Merawat(
                "kbn_seledri.jpg",
                "seledri_merawat.jpg",
                "Cara Merawat Seledri :",
                "- Frekuensi penyiraman cukup dikerjakan 2-3 kali dalam 1 minggu. Bergantung pada keadaan cuaca, upayakan media tak terlampau becek atau kering.",
                "- Pemberian pupuk organik cair sangatlah efisien, Frekuensi pemupukan dikerjakan tiap-tiap 1-2 minggu sekali.",
                "- Panen budidaya seledri dapat dikerjakan berulang-kali. Panen pertama umumnya berlangsung sesudah tanaman berusia 1-3 bulan."
            ),
            Merawat(
                "kbn_bayam.jpg",
                "bayem.jpg",
                "Cara Merawat Bayam :",
                "- Pengairan pada tanaman bayam dilakukan secara rutin. Jangan biarkan bayam kekeringan karena kekurangan asupan air.",
                "- Berikan pupuk dengan dosis kurang lebih 0,5 kg per tanaman.",
                "- Lakukan juga penyulaman pada tanaman-tanaman yang setelah 7 hari penanaman tidak menunjukkan pertumbuhan yang bagus.",
                "- Segera ganti dengan yang baru untuk mencegah penyebaran hama dan penyakit, jika bibit yang rusak tersebut diakibatkan oleh hama atau penyakit.",
                "- Pemangkasan tumbuhan pengganggu secara rutin dapat membantu mempercepat pertumbuhan tanaman bayam."
            ),
            Merawat(
                "kbn_pckmerah.jpg",
                "pucukmerah.jpg",
                "Cara Merawat Pucuk Merah :",
                "- Mengingat pucuk merah dapat tumbuh cukup besar, sebaiknya tanaman ini tidak ditanam di dalam pot agar bisa tumbuh secara maksimal.",
                "- Agar pucuk merah dapat tumbuh maksimal dan indah, tanam atau tempatkanlah pucuk merah di tempat yang banyak terkena sinar matahari.",
                "- Agar pucuk merah tetap indah perlu dilakukan pemangkasan secara berkala terhadap daun-daun yang sudah tua minimal 2 minggu sekali.",
                "- Lakukanlah penyiraman setiap hari untuk menjaga pertumbuhan dan kesuburan pucuk merah.",
                "- Selain itu berilah pupuk secara berkala, yakni minimal 2 bulan sekali agar tanaman tetap dapat tumbuh sehat dan baik."
            )

        )
        rv_merawat.apply {
            layoutManager = LinearLayoutManager(this@MerawatTanaman)
            adapter = MerawatAdapter(this@MerawatTanaman, merawat)
        }

    }

}
