package com.tky.filebasic;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditTex;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity{
  EditText = txtMemo;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(saveInstanceState);
    setContentView(R.layout.activity_main);

    txtMemo = (EditText) findViewById(R.id.txtMemo);
  }

  public void btnSave_onClick(View view){
    BufferedWriter writer = null;

    try{
      writer = new BufferedWriter(
        new OutputStreamWriter(
	  openFileOutput("momo.dat", Contenxt.MODE_PRIVATE)));
    } catch(IOException e){
    
    }
    finally {
      try{
        if(writer != null){
	  writer.close();
	}
      } catch (IOException e){
        e.printStackTrace();
      }
    }
  }
}


