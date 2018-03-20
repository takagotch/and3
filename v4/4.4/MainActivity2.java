package com.tky.listsearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActiivty extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ArrayList<String> data = new ArrayList<>();
    data.add("a");
    data.add("e");

    ArrayAdapter<> adapter = new ArrayAdapter<>(
	this, android.R.layout.simple_list_item_1, data);
    final ListView list = (ListView) findViewById(R.id.list);
    list.setAdapter(adapter);
    list.setTextFilterEnabled(true);

    SearchView sv = (SearchView) findViewById(R.id.search);
    sv.setOnQueryTextListener(
	new SearchView.OnQueryTextChange(String text){
	  public boolean onQueryTextChange(String text){
	    if(text == null || text.equals("")){
	      list.clearTextFilter();
	    } else {
	      list.setFilterText(text);
	    }
	    return false;
	  }

	  public boolean onQueryTextSubmit(String arg0){
	    return false;
	  }
	}
    );
  }
}


