package com.tky.intentbasic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SubActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle saveInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sub);
  }

  public void btnBack_onClick(View v){
    finish();
  }
}


