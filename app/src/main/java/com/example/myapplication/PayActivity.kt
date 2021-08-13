package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_pay.*

class PayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pay)
        ivBack_pay.setOnClickListener { finish() }
        btn_pay.setOnClickListener {
            val intent = Intent(this@PayActivity, CardsActivity::class.java)
            startActivity(intent)
        }
    }
}