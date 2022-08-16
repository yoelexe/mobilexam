package com.example.exam_karen_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ExistingCustomerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_existing_customer)

        val back_menu = findViewById<ImageView>(R.id.back_menu)
        back_menu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        val text_forget_password = findViewById<TextView>(R.id.text_forget_password)
        text_forget_password.setOnClickListener {
            val intent = Intent(this, ResetPasswordActivity::class.java)
            startActivity(intent)
        }

        val text_signup = findViewById<TextView>(R.id.text_signup)
        text_signup.setOnClickListener {
            val intent = Intent(this, NewCustomerActivity::class.java)
            startActivity(intent)
        }

        val button_login = findViewById<Button>(R.id.button_login)
        button_login.setOnClickListener {
            val intent = Intent(this, NavigationActivity::class.java)
            startActivity(intent)
        }
    }
}