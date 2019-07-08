package com.example.patrondelegado.vista.listaPeliculas

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.example.patrondelegado.R
import com.example.patrondelegado.modelo.Pelicula

class PeliculaViewHolder(inflater: LayoutInflater, parent: ViewGroup): RecyclerView.ViewHolder(inflater.inflate(R.layout.pelicula_item, parent, false)){

    private var mTituloView: TextView? = null
    private var mAnioView: TextView? = null

    init {
        mTituloView = itemView.findViewById(R.id.titulo_pelicula)
        mAnioView = itemView.findViewById(R.id.anio_pelicula)
    }

    fun bind(pelicula: Pelicula) {
        mTituloView?.text = pelicula.titulo
        mAnioView?.text = pelicula.anio.toString()
    }
}