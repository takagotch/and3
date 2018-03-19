package com.tky.listcustom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    String titles[] = {"", "",
      "", "", "" };
    String tags[] = {"", "", "", "", "" };
    String descs[] = {"",
      "",
      "", 
      "",
      "" };

    ArrayList<HashMap<String, String>> data = new ArrayList<>();
    for(int i = 0; i < titles.length; i++){
      item.put("title", title[i]);
      item.put("tags", tags[i]);
      item.put("descs", descs[i]);
      data.add(item);
    }

    SimpleAdapter adapter = new SimpleAdapter(
	this, data, R.layout.list_item,
	new String[] { "title", "tags", "desc" },
	new int[] {R.id.title, R.id.tag, R.id.desc }
    );

    ListView list = (ListView) findViewById(R.id.list);
    list.setAdapter(adapter);
  }
}


