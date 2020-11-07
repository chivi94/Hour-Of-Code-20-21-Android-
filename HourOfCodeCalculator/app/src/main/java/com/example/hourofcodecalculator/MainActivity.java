package com.example.hourofcodecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_operando1, et_operando2;
    private Button btn_sumar, btn_restar, btn_multiplicar, btn_dividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setComponents();


    }

    @Override
    public void onClick(View view) {
        Toast toast = Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT);
        float operando1 = Float.parseFloat(et_operando1.getText().toString());
        float operando2 = Float.parseFloat(et_operando2.getText().toString());
        String resultado = "Resultado de la operacion:";
        int id = view.getId();
        switch (id) {
            case R.id.btn_sumar:
                toast.setText(resultado + (operando1 + operando2));
                break;
            case R.id.btn_restar:
                toast.setText(resultado + (operando1 - operando2));
                break;
            case R.id.btn_multiplicar:
                toast.setText(resultado + (operando1 * operando2));
                break;
            case R.id.btn_dividir:
                toast.setText(resultado + (operando1 / operando2));
                break;
        }
        toast.show();

    }

    private void setComponents() {
        et_operando1 = findViewById(R.id.et_operando1);
        et_operando2 = findViewById(R.id.et_operando2);

        btn_sumar = findViewById(R.id.btn_sumar);
        btn_sumar.setOnClickListener(this);
        btn_restar = findViewById(R.id.btn_restar);
        btn_restar.setOnClickListener(this);
        btn_multiplicar = findViewById(R.id.btn_multiplicar);
        btn_multiplicar.setOnClickListener(this);
        btn_dividir = findViewById(R.id.btn_dividir);
        btn_dividir.setOnClickListener(this);
    }
}