package com.example.appeletriccar

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.appeletriccar.adapter.CarAdapter
import com.example.appeletriccar.data.CarFactory
import com.google.android.material.floatingactionbutton.FloatingActionButton

class CarFragment : Fragment() {
    lateinit var fabCalcular : FloatingActionButton
    lateinit var listaCarros : RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.car_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView(view)
        setupList()
        setupListeners()
    }

    fun setupView(view: View){
        view.apply {
            fabCalcular = findViewById(R.id.fab_calcular)
            listaCarros = findViewById(R.id.rv_lista_carros)
        }

    }
    fun setupList(){
//        var dados = CarFactory.list
        val adapter = CarAdapter(CarFactory.list)
        listaCarros.adapter = adapter

    }
    fun setupListeners() {
        fabCalcular.setOnClickListener() {
            startActivity(Intent(context, CalcularAutonomiaActivity::class.java))
        }
    }
}