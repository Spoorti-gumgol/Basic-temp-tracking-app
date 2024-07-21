package com.example.splash_screen

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class eng_hlth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_eng_hlth)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.signup_button)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val myWeb = findViewById<WebView>(R.id.MyWebview)

        myWeb.webViewClient = WebViewClient()

        myWeb.apply {
            loadUrl("https://thingspeak.com/channels/2503823/charts/1?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&title=Engine+temperature+graph&type=column&xaxis=Time&yaxis=Over+Heat+Level&yaxismax=4&yaxismin=0")
            settings.javaScriptEnabled = true
        }

        val img1 = findViewById<ImageButton>(R.id.guback)

        img1.setOnClickListener {
            startActivity((Intent(this, main_screen::class.java)))
        }


    }
}