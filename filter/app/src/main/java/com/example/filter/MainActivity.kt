package com.example.filter

import android.graphics.Color
import android.graphics.PorterDuff
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Tiger.setOnClickListener {
            Blue.setOnClickListener {Tiger.setColorFilter(Color.BLUE,PorterDuff.Mode.DARKEN)  }
            Red.setOnClickListener { Tiger.setColorFilter(Color.RED,PorterDuff.Mode.DARKEN) }
            Gray.setOnClickListener{Tiger.setColorFilter(Color.DKGRAY,PorterDuff.Mode.DARKEN)}
        }
    }
}