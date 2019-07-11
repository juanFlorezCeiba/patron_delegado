package com.example.patrondelegado.vista.listaPeliculas

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.patrondelegado.modelo.Pelicula

class ListaPeliculasAdapter(private var listaPeliculas: ArrayList<Pelicula>): RecyclerView.Adapter<PeliculaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculaViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return PeliculaViewHolder(inflater, parent)
    }

    override fun getItemCount(): Int {
        return listaPeliculas.size
    }

    override fun onBindViewHolder(holder: PeliculaViewHolder, position: Int) {
        val pelicula: Pelicula = listaPeliculas.get(position)
        holder.bind(pelicula)
    }


}