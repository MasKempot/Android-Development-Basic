package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class LatihanListActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_list)

        val arrayAdapter:ArrayAdapter<*>
        val language= arrayOf(
            "Phyton","C++","Java","Go Lang","Javascript","Ruby",
            "C#","SQL","Server","MongoDB","PostgreSQL"
        )

        var mListView:ListView=findViewById(R.id.lvBahasaPemograman)
        arrayAdapter= ArrayAdapter(this,
            android.R.layout.simple_list_item_1,language)


        mListView.adapter=arrayAdapter
    }
}