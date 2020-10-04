package com.nasa.eeos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        main()
    }


    fun main(){
        var namesname = editTextTextPersonName4.text.toString()
        var e_mail = editTextTextEmailAddress.text.toString()
        var u_name = editTextTextPersonName5.text.toString()
        var pass = editTextTextPassword2.text.toString()
        var re_pass = editTextTextPassword.text.toString()
        var age = editTextNumber.text.toString()
        var height = editTextNumber2.text.toString()
        var weight = editTextNumber3.text.toString()
        //-------------------------------------input-----------------------------------------

        fun namesur(){
            val intent = Intent(applicationContext,MainActivity7::class.java)
            intent.putExtra("isimSisim",namesname)
            startActivity(intent)

        }

        fun email(){
            val intent1 = Intent(applicationContext,MainActivity7::class.java)
            intent1.putExtra("isimSisim",e_mail)
            startActivity(intent1)

        }

        fun uname(){
            val intent2 = Intent(applicationContext,MainActivity7::class.java)
            intent2.putExtra("isimSisim",u_name)
            startActivity(intent2)

        }
        fun pass(){
            val intent3 = Intent(applicationContext,MainActivity7::class.java)
            intent3.putExtra("isimSisim",pass)
            startActivity(intent3)

        }

        fun passw(){
            val intent4 = Intent(applicationContext,MainActivity7::class.java)
            intent4.putExtra("isimSisim",re_pass)
            startActivity(intent4)

        }
        fun ages(){
            val intent5 = Intent(applicationContext,MainActivity7::class.java)
            intent5.putExtra("isimSisim",age)
            startActivity(intent5)

        }
        fun weight(){
            val intent6 = Intent(applicationContext,MainActivity7::class.java)
            intent6.putExtra("isimSisim",weight)
            startActivity(intent6)

        }

        fun height(){
            val intent7 = Intent(applicationContext,MainActivity7::class.java)
            intent7.putExtra("isimSisim",height)
            startActivity(intent7)

        }
    }
    //-------------------------------------input-----------------------------------------

    fun submited(view: View){
        val intent8 = Intent(this,MainActivity5::class.java)
        startActivity(intent8)

    }

}

