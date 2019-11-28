package com.zaidan.helloplants.Nama_Tanaman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zaidan.helloplants.R
import kotlinx.android.synthetic.main.activity_name.*

class ActivityName : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        val tanaman = arrayListOf(
            Tanaman(
                "Anggrek",
                "Orchidaceae",
                "Orchid.jpg",
                "Suku anggrek-anggrekan (bahasa Latin: Orchidaceae) merupakan satu suku tumbuhan berbunga dengan anggota jenis terbanyak. Jenis-jenisnya tersebar luas dari daerah tropika basah hingga wilayah sirkumpolar, meskipun sebagian besar anggotanya ditemukan di daerah tropika. Kebanyakan anggota suku ini hidup sebagai epifit, terutama yang berasal dari daerah tropika. Anggrek di daerah beriklim sedang biasanya hidup di tanah dan membentuk umbi sebagai cara beradaptasi terhadap musim dingin. Organ-organnya yang cenderung tebal dan \"berdaging\" (sukulen) membuatnya tahan menghadapi tekanan ketersediaan air. Anggrek epifit dapat hidup dari embun dan udara lembap.",
                "kebun_anggrek.jpg"),
            Tanaman(
                "Brokoli",
                "Brasecca Oleracea",
                "Brokoli.jpg",
                "Brokoli (Brassica oleracea L. Kelompok Italica) adalah tanaman sayuran yang termasuk dalam suku kubis-kubisan atau Brassicaceae. Brokoli berasal dari daerah Laut Tengah dan sudah sejak masa Yunani Kuno dibudidayakan. Sayuran ini masuk ke Indonesia belum lama (sekitar 1970-an) dan kini cukup populer sebagai bahan pangan.",
                "perkebunan_brokoli.jpg"),
            Tanaman(
                "Lidah buaya ",
                "Aloe Vera",
                "Lidah_buaya.jpg",
                "Lidah buaya (Aloe vera) adalah sejenis tumbuhan yang sudah dikenal sejak ribuan tahun silam dan digunakan sebagai penyubur rambut, penyembuh luka, dan untuk perawatan kulit. Tumbuhan ini dapat ditemukan dengan mudah di kawasan kering di Afrika.\n" +
                        "\n" +
                        "Seiring dengan kemajuan ilmu pengetahuan dan teknologi, manfaat tanaman lidah buaya berkembang sebagai bahan baku industri farmasi dan kosmetika, serta sebagai bahan makanan dan minuman kesehatan. ",
                "kbn_ldhbuaya.jpg"),
            Tanaman(
                "Kayu Putih",
                "Melaleuca leucadendra",
                "Kayu_putih.jpg",
                "Gelam atau Kayu putih (Melaleuca leucadendra syn. M. leucadendron) merupakan pohon anggota suku jambu-jambuan (Myrtaceae) yang dimanfaatkan sebagai sumber minyak kayu putih (cajuput oil). Minyak diekstrak (biasanya disuling dengan uap) terutama dari daun dan rantingnya. Namanya diambil dari warna batangnya yang memang putih.\n" +
                        "\n" +
                        "Tumbuhan ini terutama tumbuh baik di Indonesia bagian timur dan Australia bagian utara, namun demikian dapat pula diusahakan di daerah-daerah lain yang memiliki musim kemarau yang jelas. ",
                "kbn_kayupth.jpg"),
            Tanaman(
                "Seledri",
                "Apium graveolens",
                "Seledri.jpg",
                "Seledri (Apium graveolens L.) adalah sayuran daun dan tumbuhan obat yang biasa digunakan sebagai bumbu masakan. Beberapa negara termasuk Jepang, Cina dan Korea mempergunakan bagian tangkai daun sebagai bahan makanan. Di Indonesia tumbuhan ini diperkenalkan oleh penjajah Belanda dan digunakan daunnya untuk menyedapkan sup atau sebagai lalap. Penggunaan seledri paling lengkap adalah di Eropa: daun, tangkai daun, buah, dan umbinya semua dimanfaatkan.",
                "kbn_seledri.jpg"),
            Tanaman(
                "Bayam",
                "Amaranthus",
                "bayam.jpg",
                "Bayam (Amaranthus spp.) merupakan tumbuhan yang biasa ditanam untuk dikonsumsi daunnya sebagai sayuran hijau. Tumbuhan ini berasal dari Amerika tropik namun sekarang tersebar ke seluruh dunia. Tumbuhan ini dikenal sebagai sayuran sumber zat besi yang penting bagi tubuh. ",
                "kbn_bayam.jpg"),
            Tanaman(
                "Pucuk Merah",
                "Syzygium oleina",
                "Pucuk_Merah.jpeg",
                "Syzygium oleina (Syzygium paniculatum) adalah spesies tumbuhan yang dikenal sebagai tanaman hias. Warna tunas daun yang baru muncul memiliki warna merah menyala sehingga tumbuhan ini memiliki sebutan Pucuk Merah. Warna daun akan berubah perlahan menjadi hijau seiring berjalannya waktu",
                "kbn_pckmerah.jpg")
        )

        rv_tanaman.apply {
            layoutManager = LinearLayoutManager(this@ActivityName)
            adapter = RecyclerAdapter(this@ActivityName, tanaman)
        }
    }
}