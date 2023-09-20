package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class CountActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val tvNumber: TextView = findViewById(R.id.TvNumber)
        val Button: Button = findViewById(R.id.Button)

        val ButtonDua: Button = findViewById(R.id.ButtonDua)
        val ButtonTiga: Button = findViewById(R.id.ButtonTiga)

        //setText=merubah mengisi text

        Log.d("Number", "onCreate: ${tvNumber.text}")
        Button.setOnClickListener {
            var countInteger: Int = tvNumber.text.toString().toInt()
            countInteger++

            tvNumber.text = countInteger.toString()

            Log.d("Number", "onCreate: ${tvNumber.text}")
            ButtonDua.setOnClickListener {
                var minInteger: Int = tvNumber.text.toString().toInt()
                minInteger--

                tvNumber.text = minInteger.toString()

                Log.d("Number", "onCreate: ${tvNumber.text}")
                ButtonTiga.setOnClickListener {
                    var resetInteger: Int = tvNumber.text.toString().toInt()
                    resetInteger=0

                    tvNumber.text = resetInteger.toString()
                }
            }
        }
    }
}
