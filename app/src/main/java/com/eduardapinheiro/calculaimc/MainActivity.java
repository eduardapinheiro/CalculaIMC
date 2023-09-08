package com.eduardapinheiro.calculaimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private EditText etPeso;
    private EditText etAltura;
    private TextView tvResultado;
    private Button btCalcular;
    private Button btLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPeso = findViewById( R.id.etPeso );
        etAltura = findViewById( R.id.etAltura );

        tvResultado = findViewById( R.id.tvResultado );

        btCalcular = findViewById( R.id.btCalcular );
        btLimpar = findViewById( R.id.btLimpar );

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //entrada
                double peso = Double.parseDouble( etPeso.getText().toString() );
                double altura = Double.parseDouble( etAltura.getText().toString() );

                //processamento
                double imc = peso / Math.pow( altura, 2 );

                //saída
                tvResultado.setText( String.valueOf( imc ) );
            }
        });
    }
}