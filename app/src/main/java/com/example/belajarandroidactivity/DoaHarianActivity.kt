package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaHarianAdapter
import com.example.belajarandroidactivity.model.DoaHarian

class DoaHarianActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)
        val rvDoaHarian:RecyclerView=findViewById(R.id.rvDoaHarian)


        val data= arrayListOf<DoaHarian>(
            DoaHarian("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّار","Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar"),
            DoaHarian("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّار","Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar"),
            DoaHarian("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّار","Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar"),
            DoaHarian("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّار","Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar"),
            DoaHarian("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّار","Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar"),
            DoaHarian("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّار","Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar")

        )

        val adapter=DoaHarianAdapter(data)
        //gunakan adapter kita pada recycle view
        rvDoaHarian.adapter=adapter
        //atur layout agar vertical
        rvDoaHarian.layoutManager=
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false)
    }
}