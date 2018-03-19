package com.tky.listscroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  ArrayAdapter<String> adapter;

  @Override
  protected void onCreate(Bundle saveInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    finalArrayList<String> data = new ArrayList<>();
    data.add("a");
    data.add("e");
    adapter = new ArrayAdapter<>(
	this, android.R.layout.simple_list_item_1, data);
    ListView list = (ListView) findViewById(R.id.list);
    list.setAdapter(adapter);

    list.setOnScrollListener(
	new AbsListView.OnScrollListener(){
	  public void onScroll(AbsListView av,
		int firstVisibleItem, int visibleItemCount,
		int totalItemCount){
	        if(firstVisibleItem + visibleItemCount + 3 == totalItemCount){
		  adapter.add("a");
		  adapter.add("b");
		  adapter.add("c");
		}
	  }
	  public void onScrollStateChanged(AbsListView arg0, int arg1) {}
	}
    );
  }
}


