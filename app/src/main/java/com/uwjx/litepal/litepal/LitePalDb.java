package com.uwjx.litepal.litepal;

import android.database.sqlite.SQLiteDatabase;

import org.litepal.LitePal;

public class LitePalDb {

    public SQLiteDatabase getDB(){
        return LitePal.getDatabase();
    }
}
