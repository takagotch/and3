package com.tky.widgetsrating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layou.activity_main);

    RatingBar rate = (RatingBar) findViewById(R.id.rating);

    rate.setOnRatingBarChangeListener(
	new RatingBar.OnRatingBarChangeListener(){
	  public void onRatingChanged(RatingBar ratingBar,
	    float rating, boolean fromUser){
	    Toast.makeText(MainActivity.this,
		String.format("%f", rating),
		Toast.LENGTH_SHORT).show();
	  }
	}
    );
  }
}

