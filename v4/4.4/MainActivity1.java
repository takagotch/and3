package com.tky.listviewexpandable;

import android.support.v7.app.AppCompatActiivty;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceStae){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    String[] g_titles = {"", "", ""};
    String[][][] c_titles = {
    {
      {"", ""},
      {"", ""},
      {"", ""}
    },
    {
      {"", ""},
      {"", ""},
      {"", ""}
    },
    {
      {"", ""},
      {"", ""},
      {"", ""}
    },
    };
    ExpandableListView elv = (ExpandableListView) findViewById(R.id.elv);

    ArrayList<Map<String, String>> g_list = new ArrayList<>();
    ArrayList<List<Map<String, String>>> c_list = new ArrayList<>();

    for(int i = 0; i < g_titles.length; i++){
      HashMap<String, String> group = new HashMap<>();
      group.put("group_title", g_titles[i]);

      g_list.add(group);
      ArrayList<Map<String, String>> childs = new ArrayList<>();
      for(int j = 0; j < c_titles.length; j++){
        HashMap<String, String> child = new HashMap<>();
	child.put("child_title", c_titles[i][j][0]);
	child.put("child_text", c_titles[i][j][1]);
	childs.add(child);
      }
      c_list.add(childs);
    }

    SimpleExpandableListAdapter adapter = new SimpleExpandableListAdapter(
	this,
	g_list, android.R.layout.simple_expandable_list_item_1,
	new String[]{"group_title"}, new int[]{android.R.id.text1},
	c_list, R.layout.list_sub, new String[]{
	"child_title", "child_text"}, new int[]{R.id.text1,
	R.id.text2}
    );

    elv.setAdapter(adapter);

    elv.setOnChildClickListener(
	new ExpandableListView.OnChildClickListener(){
	  public boolean onChildClick(ExpandableListView parent, View v,
	    int groupPosition, int childPosition, long id){
	    TextView txt = (TextView) v.findViewById(R.id.text1);
	    Toast.makeText(MainActivity.this, txt.getText(),
		Toast.LENGTH_LONG).show();
	    return false;
	  }
	}
    );
  }
}


