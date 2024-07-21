package com.example.splash_screen

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class main_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.signup_button)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //val btn = findViewById<Button>(R.id.button)

        //btn.setOnClickListener {
        //    Toast.makeText(this, "Entered successfully", Toast.LENGTH_SHORT).show()
        //}
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            val intent=Intent(this, vehicle_page::class.java)
            startActivity(intent)
        }

        val btn1 = findViewById<Button>(R.id.button2)
        btn1.setOnClickListener {
            val intent=Intent(this, eng_hlth::class.java)
            startActivity(intent)
        }

        val btn2 = findViewById<Button>(R.id.button3)
        btn2.setOnClickListener {
            val intent=Intent(this, about_us::class.java)
            startActivity(intent)
        }

        val btn3 = findViewById<Button>(R.id.button4)
        btn3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://dignifiedassassin.me/enginestatus.html?username=ejrliwejr&password=wefweew")
            startActivity(intent)
        }

        val btn4 = findViewById<Button>(R.id.button5)
        btn4.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
