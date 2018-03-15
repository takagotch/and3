package com.tky.database;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import andorid.os.Bundle;

public class MainActivity extends AppCompatActivity{
  private SimpleDatabaseHelper helper = null;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    helper = new SimpleDatabaseHelper(this);

    SQLiteDatabase db = helper.getWritableDatabase();
    try{
      Toast.makeText(this, "CONNECT",
	Toast.LENGTH_SHORT).show();
    } finally{
      db.close();
    }
  }
}


