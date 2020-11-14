package com.example.listjajanankekiniansby

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_jajanan.view.*

class Adapter (
    val listjajan : List<DataJajanan>,
    val clickListener : (DataJajanan) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val infater = LayoutInflater.from(parent.context)
        val view = infater.inflate(R.layout.list_jajanan, parent, false)
        return PViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PViewHolder).bind(listjajan[position], clickListener)
    }

    override fun getItemCount() = listjajan.size

    class PViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(data : DataJajanan, clickListener: (DataJajanan) -> Unit) {
            itemView.GambarJajan.setImageResource(data.gmbrjajan)
            itemView.NamaJajan.text = data.namajajan
            itemView.setOnClickListener { clickListener(data) }
        }
    }
}