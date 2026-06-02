package com.example.miguelmenzel_sqlite_0505.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.miguelmenzel_sqlite_0505.api.AppUtil;
import com.example.miguelmenzel_sqlite_0505.datamodel.ClienteDataModel;

public class AppDataBase extends SQLiteOpenHelper {
    public static final String NAME = "atividade_raulluis.sqlite";
    public static int version = 1;

    SQLiteDatabase db;
    public AppDataBase(Context context) {
        super(context, NAME, null, version);
        db = getWritableDatabase();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(AppUtil.TAG,"Criando  tabela"+ ClienteDataModel.TABELA);
        db.execSQL(ClienteDataModel.criarTabela());
    }
}

