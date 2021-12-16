package com.example.imccalculatev02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import com.google.android.material.textfield.TextInputLayout

class IMCActivity : AppCompatActivity() {

    private lateinit var editTextPeso: EditText
    private lateinit var editTextAltura: EditText
    private lateinit var button_imc: Button
    private lateinit var textInputLayoutPeso: TextInputLayout
    private lateinit var textInputLayoutAltura: TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imcactivity)

        val spinnerSexo = findViewById<Spinner>(R.id.spinner_sexo)
        val options = arrayOf("Masculino", "Feminino")

        spinnerSexo.adapter = ArrayAdapter<String>(this, R.layout.spinner_item, options)

        editTextPeso = findViewById(R.id.edit_peso)
        editTextAltura = findViewById(R.id.edit_altura)
        button_imc = findViewById(R.id.botao_calcular)
        textInputLayoutPeso = findViewById(R.id.input_peso)
        textInputLayoutAltura = findViewById(R.id.input_altura)

        button_imc.setOnClickListener{
            validaForm()
        }


    }

    private fun validaForm() : Boolean {
        var error = false;

        if(editTextPeso.text.isEmpty()){
            textInputLayoutPeso.error = "Digite seu peso!"
            error = true
        } else  {
            textInputLayoutPeso.error = ""
        }
        if(editTextAltura.text.isEmpty()){
            textInputLayoutAltura.error = "Digite sua altura!"
            error = true
        } else {
            textInputLayoutAltura.error = ""
        }



//        if(editTextPeso.text.isEmpty()){
//            editTextPeso.error = "Digite o seu peso!"
//            error = true
//        }
//        if(editTextAltura.text.isEmpty()){
//            editTextAltura.error = "Digite a sua altura!"
//            error = true
//        }
        return error
    }
}