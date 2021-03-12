package com.a11y.a11ywatch

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login(view: View) {
        setContentView(R.layout.activity_dashboard)
    }
    fun register(view: View) {
        setContentView(R.layout.activity_dashboard)
    }
}