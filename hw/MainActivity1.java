package com.tky.networkasync;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity{
  AsyncNetworkTask task;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    task = new AsyncNetworkTask(this);
    task.execute("http://tky.com/");
  }

  public void btn_onClick(View view){
    task.cancel(true);
  }
}


