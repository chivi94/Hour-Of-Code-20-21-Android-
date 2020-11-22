package org.example.hoccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity: AppCompatActivity(), View.OnClickListener {

    private lateinit var et_operando1: EditText
    private lateinit var et_operando2: EditText

    private lateinit var btn_suma: Button
    private lateinit var btn_resta: Button
    private lateinit var btn_multiplicacion: Button
    private lateinit var btn_division: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setComponents()
    }

    private fun setComponents(){
        et_operando1 = findViewById(R.id.et_operando1)
        et_operando2 = findViewById(R.id.et_operando2)

        btn_suma = findViewById(R.id.btn_sumar)
        btn_resta = findViewById(R.id.btn_restar)
        btn_multiplicacion = findViewById(R.id.btn_multiplicar)
        btn_division = findViewById(R.id.btn_dividir)

        btn_suma.setOnClickListener(this)
        btn_resta.setOnClickListener(this)
        btn_multiplicacion.setOnClickListener(this)
        btn_division.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val toast: Toast = Toast.makeText(this, "", Toast.LENGTH_SHORT);
        val id = v?.id
        val operando1 = et_operando1.text.toString().toDouble()
        val operando2 = et_operando2.text.toString().toDouble()

        val resultado = "El resultado de la operación es: "
        when(id) {
            R.id.btn_sumar -> toast.setText(resultado + (operando1 + operando2))
            R.id.btn_restar -> toast.setText(resultado + (operando1 - operando2))
            R.id.btn_multiplicar -> toast.setText(resultado + (operando1 * operando2))
            R.id.btn_dividir -> toast.setText(resultado + (operando1 / operando2))
        }
        toast.show()
    }
}