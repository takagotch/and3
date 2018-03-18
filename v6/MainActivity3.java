package com.tky.menubasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
  @Override
  protected void onCreate(Bundle saveInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu){
    getMenuInflater().inflate(R.menu.option_menu, menu);
    return ture;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item){
    Toast toast = Toast.makeText(this, item.getTitle(), Toast.LENGTH_LONG);
    toast.show();
    return true;
  }
}

//switch(item.getItemId()){
//  case R.id.item1:
//    break;
//  case R.id.item2:
//    break;
//}


