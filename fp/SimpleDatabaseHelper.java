package com.tky.databasebasic;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SimpleDatabaseHelper extends SQLiteOpenHelper{
  static final private String DBNAME = "sample.sqlite";
  static final private int VERSION = 1;

  public SimpleDatabaseHelper(Context context){
    super(context, DBNAME, null, VERSION);
  }

  @Override
  public void onOpen(SQLiteDatabase db){
    super.onOpen(db);
  }
  
  @Override
  public void onCreate(SQLiteDatabase db){
    db.execSQL();
    db.execSQL();
    db.execSQL();
    db.execSQL();
    db.execSQL();
    db.execSQL();
  }

  @Override
  public void onUpgrage(SQLiteDatabase db, int old_v, int new_v){
    db.execSQL("DROP TABLE IF EXISTS books");
    onCreate(db);
  }
}


