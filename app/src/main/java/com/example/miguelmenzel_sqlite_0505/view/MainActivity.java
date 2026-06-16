package com.example.miguelmenzel_sqlite_0505.view;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.miguelmenzel_sqlite_0505.R;
import com.example.miguelmenzel_sqlite_0505.controller.Clientecontroller;

import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Clientecontroller clienteController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        clienteController = new Clientecontroller(this);

        Button btnEntrar = findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MenuClienteActivity.class);
            startActivity(intent);
        });



    }
}

