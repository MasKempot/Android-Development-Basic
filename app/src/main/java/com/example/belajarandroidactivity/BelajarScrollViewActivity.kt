package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.BlurTransformation

class BelajarScrollViewActivity : AppCompatActivity(){
        var ivBg: ImageView?=null
     @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scroll_view)

         ivBg=findViewById(R.id.ivBg)

         Glide.with(this)
             .load(R.drawable.img_8)
             .transform(BlurTransformation(10,3))
             .into(ivBg!!)

    }
}