package com.example.luckyticketkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ticketText(view: android.view.View) {
        val editText = findViewById<View>(R.id.ticketNumber) as EditText
        val ticketInput = editText.text.toString();
        val item = ticketInput.toCharArray()
        val bulbId = findViewById<ImageView>(R.id.bulbId)
        when (item.size) {
            6 -> if (item[0].code + item[1].code + item[2].code == item[3].code + item[4].code
                + item[5].code
            ) {
                bulbId.setImageResource(R.drawable.green)
            } else {
                bulbId.setImageResource(R.drawable.red)
            }
            else -> Toast.makeText(this, "Потрібно ввести 6 символів!", Toast.LENGTH_LONG).show()
        }
    }
}