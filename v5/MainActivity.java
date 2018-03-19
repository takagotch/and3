package com.tky.tablecolllapsed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
  private boolean flag = false;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    String[] data = {"1", "2", "3", "4", "5", "6", "7",
      "8", "9", "10", "11", "12" };
    GridLayout grid = (GridLayout) findViewById(R.id.grid);
    for(String sData : data){
      Button btn = new Button(this);
      btn.setText(sData);
      grid.addView(btn);

    RelativeLayout layout = new RelativeLayout(this);

    layout.setLayoutParams(new ViewGroup.LayoutParams(
	ViewGroup.LayoutParams.MATCH_PARENT,
	ViewGroup.LayoutParams.MATCH_PARENT));
    TextView txt = new TextView(this);
    RelativeLayout.Layout.LayoutParams(
	new  RelativeLayout.LayoutParams(
	ViewGroup.LayoutParams.WRAP_CONTENT,
	ViewGroup.LayoutParams.WRAP_CONTENT);
    txtLayout.addRule(RelativeLayout.CENTER_HORIZONTAL);
    txtLayout.addRule(RelativeLayout.CENTER_VERTICAL);
    txt.setLayoutParams(txtLayout);
    txt.setText("Hello"));
    layout.addView(txt);
    setContentView(layout);
    }
  }

  public void btnflag_onClick(View view){
    TableLayout tbl = (TableLayout)findViewById(R.id.tbl);
    tbl.setColumnCollapsed(1, flag);
    flag = !flag;
  }
}


