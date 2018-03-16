package com.tky.intentmyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
  public void btnSend_onClick(View view){
    EditText txtName = (EditText) findViewById(R.id.txtName);

    Intent i = new Intent(Intent.ACTION_SEND);
    i.setType("text/plain");
    i.putExtra(Intent.EXTRA_TEXT, txtName.getText().toString());
    EstartActivity(i);
  }
}

