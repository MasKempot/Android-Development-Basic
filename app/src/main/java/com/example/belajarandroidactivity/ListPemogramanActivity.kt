package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.LanguageAdapter
import com.example.belajarandroidactivity.model.Language

class ListPemogramanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pemograman)
        val rvBahasaPemograman:RecyclerView=findViewById(R.id.rvBahasaPemograman)
        val data= arrayListOf<Language>(
            Language("Sutra",R.drawable.img_18),
            Language("C++",R.drawable.img_19),
            Language("Pyhton",R.drawable.img_21),
            Language("Sutra",R.drawable.img_18),
            Language("C++",R.drawable.img_19),
            Language("Pyhton",R.drawable.img_21)

        )

//        val adapter=LanguageAdapter(data)
//        //gunakan adapter kita pada recycle view
//        rvBahasaPemograman.adapter=adapter
//        //atur layout agar vertical
//        rvBahasaPemograman.layoutManager=
//            LinearLayoutManager(this,
//            LinearLayoutManager.VERTICAL,false)
    }
}