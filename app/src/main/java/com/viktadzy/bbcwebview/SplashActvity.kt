package com.viktadzy.bbcwebview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActvity : AppCompatActivity() {
    private val splash_time_out =4000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_actvity)
        Handler().postDelayed({
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        },splash_time_out
        )
    }
}