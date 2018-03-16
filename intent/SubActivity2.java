package com.tky.intentdata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle saveInstanceState){
    super.onCreate(saveInstanceState);
    setContentView(R.layout.activity_sub);

    Intent i = this.getIntent();
    String txtName = i .getStringExtra("txtName");
    Toast.makeText(this,
	String.format("Hello, %s", txtName),
	Toast.LENGTH_SHORT).show();
  }
}


