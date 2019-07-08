package com.example.patrondelegado.vista

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.patrondelegado.R
import com.example.patrondelegado.modelo.Pelicula
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lista_peliculas.apply {
            layoutManager = LinearLayoutManager(this.context)
            adapter = ListaPeliculasAdapter(obtenerListaDePeliculas())

        }
    }

    fun obtenerListaDePeliculas(): ArrayList<Pelicula> {
        var listaPeliculas: ArrayList<Pelicula> = ArrayList()
            listaPeliculas.add(Pelicula("El cliub de la pelea", 1999))
            listaPeliculas.add(Pelicula("La Sociedad de los Poetas Muertos", 1989))
            listaPeliculas.add(Pelicula("Memento", 2000))
            listaPeliculas.add(Pelicula("Trainspotting", 1996))
            listaPeliculas.add(Pelicula("Inception", 2010))

        return listaPeliculas
    }
}
