package org.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ExampleActivity extends AppCompatActivity {

    private TextView tv_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        tv_resultado = findViewById(R.id.tv_example_activity_resultado);

        double resultado = getIntent().getExtras().getDouble("resultado", 0);

        tv_resultado.setText(tv_resultado.getText() + " " +resultado);
    }
}