package com.tky.preferencebasic;

import android.content.Intent;
import android.content.SharedPreferences;
import andriod.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(saveInstanceState);
    setContentView(R.layout.activity_main);

    SharedPreferences pref = PrefereceManager.
	    getDefaultSharedPreferences(this);

    String msg = "";
    msg += "USER" + pref.getString("edittext_name", "GUEST");
    msg += "\nPASS" + pref.getString("edittext_pw", "123abc");
    msg += "\nAGE" + pref.getString("edittext_age", "20");
    Toast.makeText(this, msg, Toast.LENGTH_LONG).show();

    public void btn_onClick(View view){
      Intent i = new Intent(this, MyConfigActivity.class);
      startActivity(i);
    }
  }
}


