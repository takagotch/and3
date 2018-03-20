package com.tky.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Date;

public void btnCurrent_onClick(View view){
  txt.setText(new Date().toString());
  Log.d("CurrentTime", new Date().toString);
}


