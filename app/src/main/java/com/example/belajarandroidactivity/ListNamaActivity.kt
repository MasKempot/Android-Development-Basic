package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListNamaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)
        val arrayAdapter:ArrayAdapter<*>
        val users= arrayOf(
            "Steve Smith", "Ross Taylor", "Rohit Sharma"
        )
//        deklrasikan variabel

        var mListView:ListView=findViewById(R.id.lvName)
//        panggil object ArrayAdapter
        arrayAdapter= ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            users)

//        isi daftar
        mListView.adapter=arrayAdapter
    }
}