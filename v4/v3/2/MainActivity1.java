package com.tky.widgetsradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RaioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    RadioGroup rgroup = (RadioGroup) findViewById(R.id.rgroup);

    rgroup.setOnCheckedChangedListener(new RadioGroup.OnCheckedChangeListener(){
      public void onCheckedChanged(RadioGroup group, int checkedId){
        RadioButton radio = (RadioButton)group.findViewById(checkedId);
	String.makeText(MainActivity.this,
	  String.format("%s", radio.getText()),
	  Toast.LENGTH_SHORT).show();
      }
    });
  }
}
//
//switch (checkedId){
//  case R.id.rb1 :
//  case R.id.rb2 :
//  case R.id.rb3 :
//}

