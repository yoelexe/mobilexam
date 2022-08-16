package com.example.exam_karen_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class NewCustomerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_customer)


        val back_menu = findViewById<ImageView>(R.id.back_menu)
        back_menu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        val button_login = findViewById<Button>(R.id.button_login)
        button_login.setOnClickListener {
            val intent = Intent(this, ExistingCustomerActivity::class.java)
            startActivity(intent)
        }
    }
}