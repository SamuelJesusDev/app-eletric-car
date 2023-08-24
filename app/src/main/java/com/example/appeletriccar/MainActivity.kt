package com.example.appeletriccar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var preco : EditText
    lateinit var km_percorrido : EditText
    lateinit var resultado : TextView
    lateinit var btnCalcular : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
    }


    fun setupView(){
        preco = findViewById(R.id.et_preco_kwh)
        km_percorrido = findViewById(R.id.et_km_percorrido)
        btnCalcular = findViewById(R.id.btn_calcular)
        resultado = findViewById(R.id.tv_resultado)
    }

    fun setupListeners(){
        btnCalcular.setOnClickListener(){
            calcAutonomia()
        }
    }
    fun calcAutonomia(){
            val preco = preco.text.toString().toFloat()
            val km = km_percorrido.text.toString().toFloat()

            val result = preco / km
            resultado.text = result.toString()
    }
//    fun calcAutonomia(){
//        val textoDigitado = preco.text
//        val textoDigitado = km_percorrido.text
//    }
}