package com.a11y.a11ywatch

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun login(view: View) {
        startActivity(Intent(this, DashboardActivity::class.java))
    }
    fun register(view: View) {
        startActivity(Intent(this, DashboardActivity::class.java))
    }
}