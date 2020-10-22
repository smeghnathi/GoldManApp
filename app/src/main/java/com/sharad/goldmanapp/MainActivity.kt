package com.sharad.goldmanapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btManageParty.setOnClickListener {
            Toast.makeText(this, "What the hell!", Toast.LENGTH_LONG).show()
            val intent = Intent(applicationContext, MainParty::class.java)
            startActivity(intent)
        }
    }
}