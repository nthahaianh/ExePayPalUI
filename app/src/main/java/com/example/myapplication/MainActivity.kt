package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager?.beginTransaction()?.replace(R.id.container,DashboardFragment() as Fragment)
            ?.addToBackStack("fragment")?.commit()
        dashboard_bottomNavigationView.background = null
        dashboard_fab.setOnClickListener{
            val intent = Intent(this@MainActivity, PayActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        finish()
    }
}