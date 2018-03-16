package com.tky.intentforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
  public void btnSend_onClick(View v){
    Intent i = new Intent(this, com.tky.intentforresult.SubActivity.class);
    this.startActivityForResult(1, i);
  }
}


