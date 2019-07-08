package com.example.patrondelegado.vista.agregarPelicula

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.patrondelegado.R
import com.example.patrondelegado.modelo.Pelicula
import kotlinx.android.synthetic.main.activity_dialogo_agregar_pelicula.*

class DialogoAgregarPelicula : DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_dialogo_agregar_pelicula,container)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        boton_agregar_persona_dialogo.setOnClickListener { accionBotonAgregarPersona(crearPelicula()) }
    }

    private fun crearPelicula(): Pelicula = Pelicula(txt_titulo_agregar_pelicula.text.toString(), txt_anio_agregar_pelicula.text.toString().toInt())


    private fun accionBotonAgregarPersona(pelicula: Pelicula) {
        Toast.makeText(this.context, "Titulo: " + pelicula.titulo + ", Año: " + pelicula.anio.toString(),Toast.LENGTH_SHORT).show()
    }

}
