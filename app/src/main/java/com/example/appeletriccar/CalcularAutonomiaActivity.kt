package com.example.appeletriccar

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalcularAutonomiaActivity : AppCompatActivity() {

    lateinit var preco : EditText
    lateinit var km_percorrido : EditText
    lateinit var resultado : TextView
    lateinit var btnCalcular : Button
    lateinit var btnClose : ImageView

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_calcular_autonomia)
        setupView()
        setupListeners()
    }

    fun setupView(){
        preco = findViewById(R.id.et_preco_kwh)
        km_percorrido = findViewById(R.id.et_km_percorrido)
        resultado = findViewById(R.id.tv_resultado)
        btnCalcular = findViewById(R.id.btn_calcular)
        btnClose = findViewById(R.id.iv_close)
    }
    fun setupListeners(){
        btnCalcular.setOnClickListener(){
            calcAutonomia()
        }
        btnClose.setOnClickListener(){
//            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    fun calcAutonomia(){
        val preco = preco.text.toString().toFloat()
        val km = km_percorrido.text.toString().toFloat()

        val result = preco / km
        resultado.text = result.toString()
    }
}