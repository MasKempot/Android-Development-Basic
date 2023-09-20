package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.adapter.LanguageAdapter
import com.example.belajarandroidactivity.model.Doa

class DoaAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_app)
        val rvDoa:RecyclerView=findViewById(R.id.rvDoa)

        val cvSelengkpnya: Button =
            findViewById(R.id.TombolDoa)
        cvSelengkpnya.setOnClickListener{
            val intent=
                Intent(this,DoaHarianActivity::class.java)
            startActivity(intent)

        }

        val data= arrayListOf<Doa>(
            Doa("Dzikir dan Doa Sunnah Harian",R.drawable.img_31),
            Doa("Dzikir Nabi dan Rasul",R.drawable.img_31),
            Doa("Niat Solat Fardhu",R.drawable.img_31),
            Doa("Kisah Nabi",R.drawable.img_31),
            Doa("Amalan Rasul",R.drawable.img_31),
            Doa("Tata Cara Berwudhu",R.drawable.img_31)

        )

        val adapter=DoaAdapter(data)
        //gunakan adapter kita pada recycle view
        rvDoa.adapter=adapter
        //atur layout agar vertical
        rvDoa.layoutManager=
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)
    }
}