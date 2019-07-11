package com.example.patrondelegado.vista.listaPeliculas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.patrondelegado.R
import com.example.patrondelegado.modelo.Pelicula
import com.example.patrondelegado.vista.agregarPelicula.DialogoAgregarPelicula
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var listaPeliculas: ArrayList<Pelicula>
    lateinit var mAdapter: ListaPeliculasAdapter
    lateinit var fragmentoDialogo: DialogoAgregarPelicula

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        obtenerListaDePeliculas()
        configurarRecyclerView()
        button_agregar_peliculas.setOnClickListener { irAgregarPelicula() }
    }

    private fun configurarRecyclerView() {

        this.mAdapter = ListaPeliculasAdapter(listaPeliculas)
        lista_peliculas.apply {
            layoutManager = LinearLayoutManager(this.context)
            adapter = mAdapter
        }
    }

    fun obtenerListaDePeliculas(){
        this.listaPeliculas = ArrayList()
        this.listaPeliculas.add(Pelicula("El cliub de la pelea", 1999))
        this.listaPeliculas.add(Pelicula("La Sociedad de los Poetas Muertos", 1989))
        this.listaPeliculas.add(Pelicula("Memento", 2000))
        this.listaPeliculas.add(Pelicula("Trainspotting", 1996))
        this.listaPeliculas.add(Pelicula("Inception", 2010))
    }

    fun irAgregarPelicula() = mostrarDialogoAgregarPersona()

    private fun mostrarDialogoAgregarPersona() {
        var fragmentManager = supportFragmentManager
        this.fragmentoDialogo = DialogoAgregarPelicula()
        fragmentoDialogo.show(fragmentManager, "")
    }

    fun update(lista: ArrayList<Pelicula>) {
        listaPeliculas = lista
        mAdapter.notifyDataSetChanged()
    }

}
