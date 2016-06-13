package com.example.shreyanshsachan.databasedemo;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHelper dbhelper = new DatabaseHelper(this);

        SQLiteDatabase sqLiteDatabase = dbhelper.getWritableDatabase();

        //insert query

        //method 1
        /*String sql = "insert into record (source,path) values ('aa', 'xyz');";
        Log.v("TAG", sql);
        sqLiteDatabase.execSQL(sql);

        try{
            sqLiteDatabase.execSQL(sql);
            Log.v("TAG","query inserted");
        }
        catch (Exception e){
            Log.v("TAG",""+e);
        }*/

        //method 2a

        /*ContentValues contentValues = new ContentValues();
        contentValues.put("source","so");
        contentValues.put("path", "pa");

       Long id =  sqLiteDatabase.insert("record",null,contentValues);
        if(id!=-1){
            Log.v("TAG","Values added");
            Log.v("TAG","ID"+id);
        }

        else{
            Log.v("TAG","Values not added");
        }*/





    }
}
