package com.example.exam_karen_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val new_customer = findViewById<Button>(R.id.new_customer)
        new_customer.setOnClickListener {
            val intent = Intent(this, NewCustomerActivity::class.java)
            startActivity(intent)
        }

        val get_started = findViewById<Button>(R.id.get_started)
        get_started.setOnClickListener {
            val intent = Intent(this, ExistingCustomerActivity::class.java)
            startActivity(intent)
        }

    }
}