package com.example.miguelmenzel_sqlite_0505.datamodel;

public class UsuarioDataModel {

    public static final String TABELA = "usuario";

    public static final String id = "id";
    public static final String login = "login";
    public static final String senha = "senha";

    public static String queryCriarTabela = "";

    public static String criarTabela() {

        queryCriarTabela += "CREATE TABLE " + TABELA + " (";

        queryCriarTabela += id + " INTEGER PRIMARY KEY AUTOINCREMENT, ";
        queryCriarTabela += login + " TEXT, ";
        queryCriarTabela += senha + " TEXT ";

        queryCriarTabela += ")";

        return queryCriarTabela;
    }
}