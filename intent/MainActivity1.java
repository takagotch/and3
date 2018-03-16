package com.tky.intentbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity{
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Log.d("LIFE", "onCreate");
  }

  @Override
  protected void onDestroy(){
    Log.d("LIFE", "onPause');
    super.onPause();
  }

  @Override
  protected void onRestart(){
    Log.d("LIFE", "onRestart");
    super.onRestart();
  }

  @Override
  protected void onResume(){
    Log.d("LIFE", "onResume");
    super.onResume();
  }

  @Override
  protected void onStart(){
    Log.d("LIFE", "onStart");
    super.onStart();
  }

  @Override
  protected void onStop(){
    Log.d("LIFE", "onStop");
    super.onStop();
  }
}


