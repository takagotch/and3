package com.tky.drawableanimcode;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle saveInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Drawable img1 = ContextCompat.getDrawable();
    Drawable img2 = ContextCompat.getDrawable();
    Drawable img3 = ContextCompat.getDrawable();
    Drawable img4 = ContextCompat.getDrawable();

    AnimationDrawable anim = new AnimationDrawable();
    anim.addFrame(img1, 500);
    anim.addFrame(img2, 500);
    anim.addFrame(img3, 500);
    anim.addFrame(img4, 500);
    anim.setOneShot(false);

    ImageView img = (ImageView) findViewById(R.id.img);
    img.setBackground(anim);
    anim.start();
  }
}


