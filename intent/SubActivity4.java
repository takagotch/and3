package com.tky.intentmyapp;

import android.content.Intent;
import android.os.Bundle;
import android.supportv7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity{
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sub);

    Intent i = this.getIntent();
    Toast.makeText(this, String.format("Hello, %s", txtName),
	Toast.LENGTH_SHORT).show();
  }

}


