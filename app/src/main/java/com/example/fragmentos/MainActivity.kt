package com.example.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculadora =  findViewById<Button>(R.id.calculadora)
        val IMC = findViewById<Button>(R.id.imc)

        calculadora.setOnClickListener {
            cambiarFragmento(Calculadora())
        }

        IMC.setOnClickListener {
            cambiarFragmento(IndiceMC())
        }

        cambiarFragmento(inicio())
    }
     fun cambiarFragmento(fragmento: Fragment){
        val manager = supportFragmentManager
        val transaccion = manager.beginTransaction()
        transaccion.replace(R.id.fragmentContainerView, fragmento)
        transaccion.commit()
    }
}