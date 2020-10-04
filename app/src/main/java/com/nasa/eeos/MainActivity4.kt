package com.nasa.eeos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.AbsListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main4.*
import java.time.LocalDate

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val intent = intent
        val alinanveri = intent.getStringExtra("yolananveri")
        Toast.makeText(this, "Welcome ${alinanveri}", Toast.LENGTH_SHORT).show()


    }

    fun Next(view: View){
        var intent = Intent(this,MainActivity6::class.java)
        startActivity(intent)
    }

    fun profile(view: View){
        var intent = Intent(this,MainActivity7::class.java)
        startActivity(intent)
    }

    fun setter(view: View){
        val namik = editTextTextPersonName3.text.toString()
        textView9.text = "${namik}"
    }












}