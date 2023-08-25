package com.example.appeletriccar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appeletriccar.adapter.CarAdapter

class MainActivity : AppCompatActivity() {

    lateinit var btnNext : Button
    lateinit var listaCarros : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
        setupList()
    }


    fun setupView(){
        btnNext = findViewById(R.id.btn_next)
        listaCarros = findViewById(R.id.rv_lista_carros)
    }
    fun setupList(){
        var dados = arrayOf(
            "Cupcake", "Donut", "Froyo", "Gingerbread"
        )
        val adapter = CarAdapter(dados)
        listaCarros.adapter = adapter

    }

    fun setupListeners(){
        btnNext.setOnClickListener(){
            startActivity(Intent(this, CalcularAutonomiaActivity::class.java))
        }
    }
}