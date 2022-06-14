package com.viktadzy.bbcwebview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signupbtn = findViewById<Button>(R.id.loginbutton)
        signupbtn.setOnClickListener{
            val n = Intent(this,SignUpActivity::class.java)
            startActivity(n)
        }
    }
}