package com.tky.servicebroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class SimpleReceiver extends BroascastReceiver {
  @Override
  public void onReceiver(Context context, Intent intent){
    String msg = intent.getStringExtra("message");
    Toast.makeText(context, "NOW: " + msg,
	Toast.LENGTH_SHORT).show();
  }
}

