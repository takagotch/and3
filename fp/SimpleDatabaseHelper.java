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
    db.execSQL("CREATE TABLE books (" +
	"isbn TEXT PRRMARY KEY, title TEXT, price INTEGER)");
    db.execSQL("INSERT INTO books(isbn, title, price)" +
	" VALUES('978-4-7980-4179-2',
	'TITLE', 3000)");
    db.execSQL("INSERT INTO books(isbn, title, price)" +
	" VALUES('978-4-7741-8030-4',
	'TITLE', 2680)");
    db.execSQL("INSERT INTO books(isbn, title, price)" +
	"VALUES('111-1-1111-1111-1', 'TITLE', 2680)");
    db.execSQL("INSERT INTO books(isbn, title, price)" +
	"VALUES('222-2-2222-2222-2', 'TITLE', 2780)");
    db.execSQL("INSERT INTO books(isbn, title, price)" +
	"VALUES('222-2-2222-2222-3', 'TITLE', 3200)");
  }

  @Override
  public void onUpgrage(SQLiteDatabase db, int old_v, int new_v){
    db.execSQL("DROP TABLE IF EXISTS books");
    onCreate(db);
  }
}


