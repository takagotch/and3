package com.tky.servicetimer;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

public class SimpleService extends Service {
  private final String TAG = "SimpleService";
  private Timer timer;

  @Override
  public int onStartCommand(intent intent, int flags, int startId){
    timer = new Timer();
    timer.schedule(new TimerTask(){
      @Override
      public void run(){
        Log.i(TAG, "onStartCommand");
      }
    }, 0, 1000);
    return START_STICKY;
  }

  @Override
  public void onDestroy(){
    super.onDestroy();
    Log.i(TAG, "onDestroy");
    timer.cancel();
  }
}

