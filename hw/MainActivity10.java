package com.tky.vibratorbasic;

import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{
  @Override
  protected void onCreate(Bundle bundle){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Vibrator v = (Vibrator) getSystemServie(VIBRATOR_SERVICE);
    v.vibrate(100);
  }
}


