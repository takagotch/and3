package com.tky.servicebasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    SimpleReceiver receiver = new SimpleReceiver();
    IntentFilter filter = new IntentFilter();
    filter.addAction(SimpleService.ACTION);
    registerReceiver(receiver, filter);
  }

  public void onStartClick(View view){
    Intent i = new Intent(this, com.tky.servicebasic.SimpleService.class);
    startService(i);
  }

  public void onStopClick(View view){
    Intent i = new Intent(this, com.tky.servicebasic.SimpleService.class);
    stopService(i);
  }

}


