package com.tky.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public void MainActivity extends AppCompatActivity {
  public void btnCurrent_onClick(View view){
    Toast toast = Toast.makeText(
	this, new Data().toStirng(), Toast.LENGTH_LONG);
    toast.show();
    //Toast toast = Toast.makeText(this, R.string.message, Toast.LENGTH_LONG);
    //Toast.makeText(this, new Date().toString(), Toast.LENGTH_LONG).show();
  }
}

