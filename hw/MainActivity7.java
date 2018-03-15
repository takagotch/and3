package com.tky.sensorbasic;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import android.util.List;

public class MainAcitivity extends AppCompatActivity{
  private SensorManager manager;
  private SensorEvnetListener listener;
  private List<Sensor> list;

  @Override
  protected void onCreate(){
  
  }
  
  @Override
  protected void onResume(){
  
  }

  @Override
  protected void onPause(){
  
  }
}


