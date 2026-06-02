package com.example.miguelmenzel_sqlite_0505.controller;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.miguelmenzel_sqlite_0505.R;
import com.example.miguelmenzel_sqlite_0505.controller.ClienteController;


public class Clientecontroller extends AppDataBase implements iCRUD<Cliente>{
        public Clientecontroller(Context context){
            super(context);
        }
}

public ClienteController(Context context) {
    super(context);
}
public boolean inserir(Cliente obj){
    dados = new ContentValues();
    dados.put(ClienteDataModel.NOME, obj.getNome());
    dados.put(ClienteDataModel.EMAIL, obj.getEmail());

    String tabela = ClienteDataModel.TABELA;
    return insert(tabela, dados);
}

