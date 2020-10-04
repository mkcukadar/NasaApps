package com.nasa.eeos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import java.util.*
import kotlin.concurrent.thread
import kotlin.concurrent.timer

class MainActivity2 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        imageView2.alpha = 0f
        imageView2.animate().setDuration(1500).alpha(1f).withEndAction{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()

        }
    }





}







