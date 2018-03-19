package com.tky.listdynamic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final ArrayList<String> data = new ArrayList<>();
    data.add("a");
    data.add("b");
    data.add("c");
    data.add("d");
    data.add("e");

    ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
	android.R.layout.simple_list_item_1, data);
    ListView list = (ListView) findViewById(R.id.list);
    list.setAdapter(adapter);
  }
}


