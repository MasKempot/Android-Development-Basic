package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val JudulForm:TextView=findViewById(R.id.judulForm)
        val Nama:TextView=findViewById(R.id.LabelNama)
        val SebutNama:EditText=findViewById(R.id.InputNama)
        val Kelas:TextView=findViewById(R.id.LabelKelas)
        val SebutKelas:EditText=findViewById(R.id.InputNama)
        val KodeBuku:TextView=findViewById(R.id.LabelKode)
        var SebutKode:EditText=findViewById(R.id.InputKode)
        val Submit:Button=findViewById(R.id.btnSubmit)
        var TampilinNama:TextView=findViewById(R.id.TampilinNama)
        var TampilinKelas:TextView=findViewById(R.id.TampilinKelas)
        var TampilinKodeBuku:TextView=findViewById(R.id.TampilinBuku)


        Submit.setOnClickListener {
            Toast.makeText(this, "Hello ${SebutNama.text} Meminjam Buku ${TampilinKodeBuku.text}", Toast.LENGTH_SHORT)
                .show();
            TampilinNama.text=SebutNama.text
            TampilinKelas.text=SebutKelas.text
            TampilinKodeBuku.text=SebutKode.text

            var KodeBuku=SebutKode.text.toString()
            when(KodeBuku){
                    "1"-> TampilinKodeBuku.text="Brooklyn"
                    "456"->TampilinKodeBuku.text="Alice In Wonderland"
                    "789"->TampilinKodeBuku.text="Vindland"
                    else->TampilinKodeBuku.text="Error"
            }

        }

    }
}