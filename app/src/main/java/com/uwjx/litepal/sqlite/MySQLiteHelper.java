package com.uwjx.litepal.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.uwjx.litepal.util.L;

public class MySQLiteHelper extends SQLiteOpenHelper {


    public static final String CREATE_NEWS = "create table news ("
            + "id integer primary key autoincrement, "
            + "title text, "
            + "content text, "
            + "date integer,"
            + "comment text)";

    public MySQLiteHelper(@Nullable Context context,
                          @Nullable String name,
                          @Nullable SQLiteDatabase.CursorFactory factory,
                          int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        L.d("MySQLiteHelper -> onCreate 创建数据库");
        db.execSQL(CREATE_NEWS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        L.d("MySQLiteHelper -> onUpgrade 更新数据库 -> oldVersion : " + oldVersion + " newVersion : " + newVersion);
    }
}
