package com.zaidan.helloplants

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash_Main : AppCompatActivity() {
    var SPLASH_TIME_OUT = 4000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
                val homeIntent = Intent(this, MainActivity::class.java)
                homeIntent.flags = (Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(homeIntent)
            },
            SPLASH_TIME_OUT
        )
    }
}
