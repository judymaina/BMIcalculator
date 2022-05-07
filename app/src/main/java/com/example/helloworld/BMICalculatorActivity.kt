package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BMICalculatorActivity : AppCompatActivity() {
    lateinit var btnSendmoney: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmicalculator)
        btnSendmoney =findViewById(R.id.btnSendmoney)
        btnSendmoney.setOnClickListener {
            val intent = Intent(this,SendMoney::class.java)
            startActivity(intent)
        }
    }
}