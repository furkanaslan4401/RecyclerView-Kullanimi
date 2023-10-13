package com.example.recyclerviewkotlin
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdepter(val list : ArrayList<Model>) : RecyclerView.Adapter<ListAdepter.ListHolder>() {
    class ListHolder(val view : View) : RecyclerView.ViewHolder(view) {
        var name : TextView = view.findViewById(R.id.name)
        var surname : TextView = view.findViewById(R.id.surname)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
            return ListHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ListHolder, position: Int) {
        val item = list[position]
        holder.name.text = item.name
        holder.surname.text = item.surname

    }
}