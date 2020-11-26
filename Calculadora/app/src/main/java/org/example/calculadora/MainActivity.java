package org.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText et_operando1, et_operando2;
    private Button btn_sumar, btn_restar, btn_launchExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_operando1 = findViewById(R.id.et_main_activity_operando1);
        et_operando2 = findViewById(R.id.et_main_activity_operando2);
        btn_sumar = findViewById(R.id.btn_main_activity_sumar);
        btn_restar = findViewById(R.id.btn_main_activity_restar);

        btn_launchExample = findViewById(R.id.btn_main_activity_lanzar);

        btn_sumar.setOnClickListener(this);
        btn_restar.setOnClickListener(this);
        btn_launchExample.setOnClickListener(this);



        /*btn_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suma(v);
            }
        });*/
    }


    public void suma(View view) {
        double operando1 = Double.parseDouble(et_operando1.getText().toString());
        double operando2 = Double.parseDouble(et_operando2.getText().toString());
        double resultado = operando1 + operando2;
        Toast.makeText(MainActivity.this, "Resultado = " + resultado, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        double operando1 = Double.parseDouble(et_operando1.getText().toString());
        double operando2 = Double.parseDouble(et_operando2.getText().toString());
        double resultado = 0;
        String mostrarResultado = "Resultado = ";
        //Toast toast = new Toast(MainActivity.this);
        switch (id){
            case R.id.btn_main_activity_sumar:
                //suma(v);
                //resultado = operando1 + operando2;
                break;
            case R.id.btn_main_activity_restar:
                //resultado = operando1 - operando2;
                break;
            case R.id.btn_main_activity_lanzar:
                Intent i = new Intent();
                i.setClass(MainActivity.this, ExampleActivity.class);
                resultado = operando1 + operando2;
                i.putExtra("resultado", resultado);
                startActivity(i);
                break;
        }
        //Toast.makeText(MainActivity.this, mostrarResultado + resultado, Toast.LENGTH_SHORT).show();
    }
}