package com.example.belajarandroidactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TravelActivity : AppCompatActivity() {
    var ibPhone:ImageButton?=null
    var ibNavigasi:ImageButton?=null
    var ibShare:ImageButton?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)
        ibPhone=findViewById(R.id.Phone)
        ibNavigasi=findViewById(R.id.Navigasi)
        ibShare=findViewById(R.id.Share)

        ibPhone!!.setOnClickListener{
            val phoneNumber="1234"
            val phoneint=Intent(Intent.ACTION_DIAL,
                Uri.parse("tel: $phoneNumber"))
            // jalankan intent
            startActivity(phoneint)
        }
            ibNavigasi!!.setOnClickListener{
                val mapIntent=Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:-6.559565080046454, 106.7131928508801")
                )
                mapIntent.setPackage("com.google.android.apps.maps")
                startActivity(mapIntent)
            }

    }
}