package com.example.miguelmenzel_sqlite_0505.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.miguelmenzel_sqlite_0505.R;

public class UsuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        Button btnEntrar = findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(v -> {
            Intent intent = new Intent(UsuarioActivity.this, MenuClienteActivity.class);
            startActivity(intent);
        });
    }
}