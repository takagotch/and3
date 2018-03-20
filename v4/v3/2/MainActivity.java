package com.tky.widgetscheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    CheckBox chk = (CheckBox)findViewById(R.id.chk);

    chk.setOnCheckedChangeListener(
	new CompundButton.OnCheckedChangeListener(){
	public void onCheckedChanged(CompundButton buttonView,
	  boolean isChecked){
	  Toast.makeText(MainActivity.this,
		isChecked ? "" : "",
		Toast.LENGTH_SHORT).show();
	}
    });
  }
}


