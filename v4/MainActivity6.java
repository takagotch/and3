package com.tky.listmyadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity{
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
      ""};

    ArrayList<ListItem> data = new ArrayList<>();
    for(int i = 0; i < titles.length; i++){
      ListItem item = new ListItem();
      item.setId((new Random()).nextLong());
      item.setTitle(titles[i]);
      item.setTag(tags[i]);
      item.setDesc(descs[i]);
      data.add(item);
    }

    MyListAdapter adapter = new MyListAdapter(this, data, R.layout.list_item)
    ListView list = (ListView) findViewById(R.id.list);
    list.setAdapter(adapter);
  }
}

