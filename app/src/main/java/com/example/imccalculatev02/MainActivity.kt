package com.example.imccalculatev02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btc_ncd = findViewById<Button>(R.id.btc_ncd)
        val btc_imc = findViewById<Button>(R.id.btc_imc)

        btc_imc.setOnClickListener{
                val abriImc = Intent(this,IMCActivity::class.java)
                startActivity(abriImc)
    }

        btc_ncd.setOnClickListener{
            val abrirNcd = Intent(this, NecessidadeCaloricaActivity::class.java)

            startActivity(abrirNcd)
        }
    }
}