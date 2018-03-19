package com.tky.listselect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  ArrayAdapter<String> adapter;
  ListView list;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstaceState);
    setContentView(R.layout.activity_main);

    final ArrayList<String> data = new ArrayList<>();
    data.add("a");
    data.add("d");
    adapter = new ArrayAdapter<>(
	this, android.R.layout.simple_list_item_single_choice, data);
    list = (ListView) findViewById(R.id.list);
    list.setAdapter(adapter);

    list.setOnItemClickListener(
	new AdapterView.OnItemClickListener(){
	  public void onItemClick(AdapterView<?> av,
		View view, int position, long id){
	        CharSequence msg = ((TextView) view).getText();
		Toast.makeText(MainActivity.this,
		  String.format("%s", msg.toString()),
		  Toast.LENGTH_SHORT).show();
	  }
	}
	);
  }
}


