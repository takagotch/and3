package com.tky.gesturedetector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import andorid.view.MotionEvent;

public class MainActivity extends AppCompatActiivty{
  GestureDetector gd;

  @Override
  protected void onCrate(Bundle saveInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
}


