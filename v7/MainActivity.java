package com.tky.viewalpha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{
  
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ImageView img = (ImageView) findViewById(R.id.img);

    Animation anim = animationUtils.loadAnimation(this, R.anim.anim);

    img.startAnimation(anim);
  }
}


