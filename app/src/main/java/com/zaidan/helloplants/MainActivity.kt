package com.zaidan.helloplants

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zaidan.helloplants.Bagian_Tanaman.BagianMain
import com.zaidan.helloplants.Manfaat_Tanaman.ManfaatMain
import com.zaidan.helloplants.Merawat_Tanaman.MerawatTanaman
import com.zaidan.helloplants.Nama_Tanaman.ActivityName
import kotlinx.android.synthetic.main.activity_main.*
import android.R.string.cancel
import android.content.DialogInterface
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btntanaman.setOnClickListener {
            val intent = Intent(this, ActivityName::class.java)
            startActivity(intent)
        }
        btnmanfaat.setOnClickListener {
            val manfaat_intent = Intent(this, ManfaatMain::class.java)
            startActivity(manfaat_intent)
        }
        btnperawatan.setOnClickListener {
            val perawatan_inten = Intent(this, MerawatTanaman::class.java)
            startActivity(perawatan_inten)
        }
        btnbagian.setOnClickListener {
            val bagian_intent = Intent(this, BagianMain::class.java)
            startActivity(bagian_intent)
        }
        btnexit.setOnClickListener {
                val builder = AlertDialog.Builder(this)
                builder.setCancelable(false)
                builder.setMessage("Do you want to Exit?")
                builder.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                    //if user pressed "yes", then he is allowed to exit from application
                    finish()
                })
                builder.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->
                    //if user select "No", just cancel this dialog and continue with app
                    dialog.cancel()
                })
                val alert = builder.create()
                alert.show()
        }
    }
    override fun onBackPressed(){
        val builder = AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setMessage("Do you want to Exit?")
        builder.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
            //if user pressed "yes", then he is allowed to exit from application
            finish()
        })
        builder.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->
            //if user select "No", just cancel this dialog and continue with app
            dialog.cancel()
        })
        val alert = builder.create()
        alert.show()
    }
}