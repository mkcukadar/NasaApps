package com.nasa.eeos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RemoteViewsService
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Welcome To EEOS",Toast.LENGTH_SHORT).show()
    }

    fun logIn(view: View){
        val name = editTextTextPersonName.text.toString()
        val pass = editTextNumberPassword.text.toString()


        if (name == "" || pass == "") {
            Toast.makeText(this, "You forgot to enter pass or name.", Toast.LENGTH_SHORT).show()
        }
        else{
            val intent = Intent(this,MainActivity4::class.java)
            intent.putExtra("yolananveri",name)
            startActivity(intent)
            finish()
        }

    }



    fun sıgnUp(view: View){
        val intent = Intent(applicationContext,MainActivity5::class.java)
        startActivity(intent)
        finish()
    }

}