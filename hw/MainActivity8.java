package com.tky.sensorshake;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvnet;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class MainAcitity extends AppCompatActivity{
  private SensorManager manager;
  private SensorEventListener listener;
  private List<Sensor> list;
  private long b_time;
  private float b_value;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    listener = new SensorEventListener(){
      public void onSensorChanged(SensorEvent event){
        float c_value = event.values[0] + event.values[1];
	long c_time = System.currentTimeMillis();

	long diff = c_time - b_time;

	if(diff > 1000){
	  float speed = Math.abs(c_value - b_value) / diff * 10000;

	  if(speed > 30){
	    Toast.makeText(MainActivity.this,
		"SHACK", Toast.LENGTH_LONG).show();
	  }
	  b_value = c_value;
	  b_time = c_time;
	}
      }

    };
  }

}


