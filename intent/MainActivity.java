package com.tky.intentbasic;

import android.content.Intent;
import android.support.v7.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity{
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
}

public void btnSend_onClick(View v){
  Intent i = new Intent(this, com.tky.intentbasic.SubActivity.class);
  startActivity(i);
}

