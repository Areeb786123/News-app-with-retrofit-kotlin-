package com.areeb.newsappwithretro.Retrofit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.areeb.newsappwithretro.MainActivity
import com.areeb.newsappwithretro.R

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val splash= Intent(this, MainActivity::class.java)
            startActivity(splash)
        },3000)


    }
}