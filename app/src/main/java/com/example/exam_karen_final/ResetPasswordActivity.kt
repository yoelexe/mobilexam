package com.example.exam_karen_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ResetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        val back_login = findViewById<ImageView>(R.id.back_login)
        back_login.setOnClickListener {
            val intent = Intent(this, ExistingCustomerActivity::class.java)
            startActivity(intent)
        }
    }
}