package com.nasa.eeos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
    }


    fun verialma(){
        var intent = intent
        var isim=intent.getStringExtra("isimSisim")
        startActivity(intent)
        println(isim)
    }









}