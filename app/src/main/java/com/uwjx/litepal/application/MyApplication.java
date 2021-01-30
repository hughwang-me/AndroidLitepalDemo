package com.uwjx.litepal.application;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.uwjx.litepal.sqlite.MySQLiteHelper;
import com.uwjx.litepal.util.L;

import org.litepal.LitePal;
import org.litepal.LitePalApplication;

public class MyApplication extends LitePalApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        L.d("MyApplication onCreate() begin");
        SQLiteOpenHelper sqLiteOpenHelper = new MySQLiteHelper(this , "wanghuan.db" , null , 2);
        SQLiteDatabase database = sqLiteOpenHelper.getWritableDatabase();


        LitePal.initialize(this);
        L.d("MyApplication onCreate() over");
    }
}
