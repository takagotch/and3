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
  protected void onCreate(Bundle saveInstanceState){
    super.onCreate(saveInstanceState);
    setContentView(R.layout.activity_main);

    manager = () getSystemService();
    list = manager.getSensorList();

    listener = new SensorEvnetListener(){
      public void onSensorChanged(SensorEvent event){
        Toast.makeText(MainActivity.this,
		Taost.makeText(MainActivity.this,
			"ACC" + event.values[0], Toast.LENGTH_LONG).show());
      }
      public void onAccuracyChanged(Sensor sensor, int accuracy) { }
    };
  }
  
  @Override
  protected void onResume(){
    super.onResume();
    if(list.size() > 0){
      manager.registerListener(listener, list.get(0)
	SensorManager.SENSOR_DELAY_NORMAL);
    }
  }

  @Override
  protected void onPause(){
    super.onPause();
    manager.unregisterListener(listener, list.get(0));
  }
}


