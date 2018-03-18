package com.tky.menudynamic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
d.view.Menu;
import android.view.View;
import android.view.SubMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContextView(R.layout.activity_main);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu){
    menu.add(0, 0, 0, "HOME").setIcon(R.drawable.menu1);

    SubMenu sm1 = menu.addSubMenu(0, 1, 1, "HELP")
	    .setIcon(R.drawable.menu2);
    sm1.add(0, 2, 0, "SEARCH").setIcon(R.drawable.menu3);
    sm1.add(0, 3, 1, "INPORT").setIcon(R.drawable.menu4);
    sm1.add(0, 4, 2, "EXPORT").setIcon(R.drawable.menu5);
    sm1.add(0, 5, 3, "VERSION").setIcon(R.drawable.menu6);

    SubMenu sm2 = menu.addSubMenu(0, 6, 2, "SETTINGS")
	    .setIcon(R.drawable.menu7);
    sm2.add(0, 2, 0, "LIGHT").setIcon(R.drawable.menu8);
    sm2.add(0, 8, 1, "VOLUME").setIcon(R.drawable.menu9);
    sm2.add(0, 9, 2, "NUMBER").setIcon(R.drawable.menu10);
    sm2.add(0, 10, 3, "TRUSH").setIcon(R.drawable.menu11);
    //menu.add(0, 0, 0, R.id.str);
    //removeItem
    //public abstract void removeItem(int id)
    //menu.removeItem(0);
    //
    return true;
  }
}


