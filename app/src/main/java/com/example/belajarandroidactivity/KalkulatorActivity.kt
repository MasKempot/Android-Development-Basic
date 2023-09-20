package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class KalkulatorActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)
        val image: ImageView = findViewById(R.id.Gambar)
        val nama: TextView = findViewById(R.id.NamaOrang)
        val Angka1: TextView = findViewById(R.id.AngkaSatu)
        val Masukan1: EditText = findViewById(R.id.InputAngka1)
        val Angka2: TextView = findViewById(R.id.AngkaDua)
        val Masukan2: EditText = findViewById(R.id.InputAngka2)

        var Button: Button = findViewById(R.id.ButtonTambah)
        var Button2: Button = findViewById(R.id.ButtonKurang)
        var Button3: Button = findViewById(R.id.ButtonPersen)
        var Button4: Button = findViewById(R.id.ButtonKali)
        var Button5: Button = findViewById(R.id.ButtonBagi)
        var Button6: Button = findViewById(R.id.ButtonClear)

        val Hasil: TextView = findViewById(R.id.Hasilnya)
        var Button7: Button = findViewById(R.id.ButtonTujuh)

        val Builder: AlertDialog.Builder = AlertDialog.Builder(this@KalkulatorActivity)

        Button.setOnClickListener {
            var number1: Int = Masukan1.text.toString().toInt()
            var number2: Int = Masukan2.text.toString().toInt()
            var hasilTambah: Int = number1 + number2

            Hasil.setText(hasilTambah.toString())
        }
        Button2.setOnClickListener {
            var number1: Int = Masukan1.text.toString().toInt()
            var number2: Int = Masukan2.text.toString().toInt()

            var hasilKurang: Int = number1 - number2

            Hasil.setText(hasilKurang.toString())
        }
        Button3.setOnClickListener {
            var number1: Int = Masukan1.text.toString().toInt()
            var number2: Int = Masukan2.text.toString().toInt()

            var hasilKali: Int = number1 % number2

            Hasil.setText(hasilKali.toString())
        }
        Button4.setOnClickListener {
            var number1: Int = Masukan1.text.toString().toInt()
            var number2: Int = Masukan2.text.toString().toInt()

            var hasilBagi: Int = number1 * number2

            Hasil.setText(hasilBagi.toString())
        }
        Button5.setOnClickListener {
            var number1: Int = Masukan1.text.toString().toInt()
            var number2: Int = Masukan2.text.toString().toInt()

            var hasilPersen: Int = number1 / number2

            Hasil.setText(hasilPersen.toString())
        }
        Button6.setOnClickListener {
            var number1: Int = Masukan1.text.toString().toInt()
            var number2: Int = Masukan2.text.toString().toInt()

            Builder.setTitle("Giani Cantik")
            Builder.setMessage("Do you want to reset")
            Builder.setCancelable(false)
            Builder.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->

                Hasil.setText("0")
                Masukan1.setText("")
                Masukan2.setText("")

            })
            Builder.setIcon(R.drawable.baseline_info_24)
            Builder.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which -> })

            val alertDialog: AlertDialog = Builder.create()
            alertDialog.show()
        }

        }
    }
