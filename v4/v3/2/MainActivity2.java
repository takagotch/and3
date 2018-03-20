package com.tky.widgetsseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    SeekBar seek = (SeekBar)findViewById(R.id.seek);

    seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
      public void onProgressChanged(
	SeekBar seekBar, int progress, boolean fromUser){
      Toast.makeText(MainActivity.this,
	String.format("%d", progress),
	Toast.LENGTH_SHORT).show();
      }
      public void onStartTrackingTouch(SeekBar seekBar){ }
      public void onStopTrackingTouch(SeekBar seekBar){ }
    });
  }
}

