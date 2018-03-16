package com.tky.intentdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActiviy;
import android.os.Bundle;
import andorid.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  public void btnSend_onClick(View v){
    Intent i = new Intent(this, com.tky.intentdata.SubActivity.class);
    EditText txtName = (EditText) findViewById(R.id.txtName);
    i.putExtra("txtName", txtName.getText().toString());
    startActivity(i);
  }
}


