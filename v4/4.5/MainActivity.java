package com.tky.recyclercard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    String titles[] = {"", "",
      "", "", "" };
    String tags[] = {"", "", "", "", "" };
    String descs[] {"",
      "",
      "",
      "", 
      ""
    };

    ArrayList<> data = new ArrayList<>();
    for(int i = 0; i < titles.length; i++){
      ListItem item = new ListItem();
      item.setId((new Random()).nextLong());
      item.setTitle(titles[i]);
      item.setTag(tags[i]);
      item.setDecs(descs[i]);
      data.add(item);
    }

    RecyclerView rv = (RecyclerView) findViewById(R.id.rv);

    rv.setHasFixedSize(true);

    LinearLayoutManager manager = new LinearLayoutManager(this);
    manager.setOrientation(LinearLayoutManager.VERTICAL);
    rv.setLayoutManager(manager);

    RecyclerView.Adapter adapter = new MyListAdapter(data);
    rv.setAdapter(adapter);
  }
}


