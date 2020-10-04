package com.nasa.eeos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        imageView2.alpha = 1f
        imageView2.animate().setDuration(2000).alpha(1f).withEndAction{
            var intent = Intent(this,MainActivity4::class.java)
            startActivity(intent)
            finish()

        }
    }
}