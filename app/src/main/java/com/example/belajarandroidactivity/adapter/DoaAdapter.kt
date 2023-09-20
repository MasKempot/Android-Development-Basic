package com.example.belajarandroidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.Doa
import com.example.belajarandroidactivity.model.Language

class DoaAdapter(val data:ArrayList<Doa>)

    : RecyclerView.Adapter<DoaAdapter.DoaViewHolder>() {
    class DoaViewHolder(view: View): RecyclerView.ViewHolder(view){
        val tvDoa2: TextView = view.findViewById(R.id.tvDoa2)
        val ivDoa2: ImageView = view.findViewById(R.id.ivDoa2)
    }

//    class DoaViewHolder {
//
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_doa_list, parent, false)
        return DoaViewHolder(view)
    }

    override fun onBindViewHolder(holder: DoaViewHolder, position: Int) {
        val item=data.get(position)
        // isi data dari model language ke masing masing view
        holder.tvDoa2.text=item.name
        holder.ivDoa2.setImageResource(item.image)
    }

    override fun getItemCount(): Int = data.size
    // bisa jaga pake syntax dibawah

    //override fun getItemCount(): Int {
    // return data.size

}
