package com.example.shreyanshsachan.databasedemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Shreyansh Sachan on 13-Jun-16.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "ImageData";
    private static final String TABLE_NAME = "record";
    private static final int DATABASE_VERSION = 1;
    private static final String UID = "_uid";
    private static final String SOURCE = "source";
    private static final String PATH = "path";
    private static final String CREATE_TABLE = "create table "+TABLE_NAME+" ( "+UID+" integer primary key autoincrement, "+SOURCE+" varchar(255), "+PATH+" varchar(255) );";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        Log.v("TAG", CREATE_TABLE);


        try{
            db.execSQL(CREATE_TABLE);
            Log.v("TAG","table created");
        }
        catch (Exception e){
            Log.v("TAG",""+e);
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
