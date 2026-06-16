package com.example.miguelmenzel_sqlite_0505.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.miguelmenzel_sqlite_0505.R;

public class MenuClienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_cliente);

        Button btnInserir = findViewById(R.id.btnInserir);
        Button btnAlterar = findViewById(R.id.btnAlterar);
        Button btnApagar = findViewById(R.id.btnApagar);

        btnInserir.setOnClickListener(v ->
                startActivity(new Intent(this, InserirClienteActivity.class)));

        btnAlterar.setOnClickListener(v ->
                startActivity(new Intent(this, AlterarClienteActivity.class)));

        btnApagar.setOnClickListener(v ->
                startActivity(new Intent(this, ApagarClienteActivity.class)));
    }
}