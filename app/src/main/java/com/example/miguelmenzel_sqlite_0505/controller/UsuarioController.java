package com.example.miguelmenzel_sqlite_0505.controller;

import com.example.miguelmenzel_sqlite_0505.model.Usuario;

public class UsuarioController implements iCRUD<Usuario> {

    @Override
    public boolean incluir(Usuario obj) {

        return true;
    }

    @Override
    public boolean alterar(Usuario obj) {

        return true;
    }

    @Override
    public boolean deletar(Usuario obj) {

        return true;
    }

    @Override
    public void listar(Usuario obj) {

    }
}