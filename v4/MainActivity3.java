package com.tky.listmultichicemodal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ActivityMode;
import android.view.Menu;
import android.view.MenuItem;
import andriod.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.CheckTextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    adapter = new ArrayAdapter<>(
	this, android.R.layout.simple_list_item_checked, data);
    list = (ListView) findViewById(R.id.list);
    list.setAdapter(adapter);
    list.setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener(){
      @Override
      public boolean onCreateActionMode(ActionMode mode, Menu menu){
        return true;
      }

      @Override
      public boolean onPrepareActionMode(ActionMode mode, Menu menu){
        return true;
      }

      @Override
      public void onItemCheckedStateChanged(ActionMode mode, int position, long id, boolean checked){ }

      @Override
      public boolean onActionItemClicked(ActionMode mode, MenuItem item){
        return true;
      }

      @Override
      public void onDestroyActionMode(ActionMode mode){
        String msg = "SELECT";
	for(int i = 0; i < list.getChildCount(); i++){
	  CheckedTextView check = (CheckedTextView) list.getChildAt(i);
	  if(check.isChecked()){
	    msg += check.getText() + ",";
	  }
	}
	msg = msg.substring(0, msg.length() - 1);
	Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
      }
    });
  }
}


