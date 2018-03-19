package com.tky.listactivity;

import android.app.ListActivity;
import andorid.os.Bundle;
import android.view.View;
import andoird.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends ListActivity{
  ArrayAdapter<String> adapter;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final ArrayList<String> data = new ArrayList<>();
    data.add("a");
    data.add("b");
    data.add("c");
    data.add("e");
    data.add("f");

    adapter = new ArrayAdapter<>(
	this, android.R.layout.simple_list_item_1, data);
    this.setListAdapter(adapter);
  }

  @Override
  protected void onListItemClick(ListView l, View v, int positon, long id){
    super.onListItemClick(l, v, position, id);
    adapter.remove((String) ((TextView) v).getText());
  }
}

