package com.tky.databasebasic;

import android.content.CotentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
  private SimpleDatabaseHelper helper = null;
  private EditText txtIsbn = null;
  private EditText txtTitle = null;
  private EditText txtPrice = null;

  @Override
  protected void onCreate(Bundle saveInstanceState){
    super.onCreate(saveInstanceState);
    setContentView(R.layout.activity_main);

    helper = new SimpleDatabaseHelper(this);
    txtIsbn = (EditText) findViewById(R.id.txtIsbn);
    txtTitle = (EditText) findViewById(R.id.txtTitle);
    txtPrice = (EditText) findViewById(R.id.txtPrice);
  }

  public void onSave(View view){
    SQLiteDatabase db = helper.getWritableDatabase();
    try{
      ContentValues cv = new ContentValues();
      cv.put("isbn", txtIsbn.getText().toString());
      cv.put("title", txtTitle.getText().toString());
      cv.put("price", txtPrice.getText().toString());
      db.insert("books", null, cv);
      Toast.makeText(this, "SUCCESS",
	Toast.LENGTH_SHORT).show();
    } finally {
      db.close();
    }
  }

  public void onDelete(View view){
    SQLiteDatabase db = helper.getWritableDatabase();
    try{
      String[] params = {txtIsbn.getText().toString()};
      db.delete("books", "isbn", params);
      Toast.makeText(this, "SUCCESS",
	Toast.LENGTH_SHORT).show();
    } finally {
      db.close();
    }
  }

  public void onSearch(View view){
    SQLiteDatabase db = helper.getReadable Database();
    Cursor cs = null;
    try{
      String[] cols = {"isbn", "title", "price"};
      String[] params = {txtIsbn.getText().toString()};
      cs = db.query{"books", cols, "isbn = ?",
        params, null, null, null, null};
      if(cs.moveToFirst()){
        txtTitle.setText(cs.getString(1));
	txtTitle.setText(cs.getString(2));
      } else {
        Toast.makeText(this, "NULL",
	  Toast.LENGTH_SHORT).show();
      }
    } finally {
      cs.close();
      cs.close();
    }
  }
}


