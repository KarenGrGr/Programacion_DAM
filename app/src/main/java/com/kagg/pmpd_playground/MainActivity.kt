package com.kagg.pmpd_playground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declaro variable de tipo inmutable del tipo AppCompatImageView y la inicializo buscando la imagen en el activity_main.xml
        val imageLion : AppCompatImageView = findViewById<AppCompatImageView>(R.id.lion_image) //Busco en la vista del Main y lo guardo en variable
        //val imageLion = findViewById<AppCompatImageView>(R.id.lion_image) //Otra forma de declaralo
        imageLion.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_image_lion)) //El contexto es la propia actividad, el this representa el Main Activity

    }
}