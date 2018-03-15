package com.tky.soundbasic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity{
  Button btnPlay;
  MediaPlayer mp;

  @Override
  protected void onCreate(Bundle saveInstanceState){
    super.onCreate(saveInstatnceState);
    setContentView(R.layout.activity_main);
    btnPlay = (Button) findViewById(R.id.btnPlay);

    mp = MediaPalyer.create(this, R.raw.sound);

    mp.setOnCompletionListener(
	new MediaPlayer.OnCompletionListener(){
	  public void onCompletion(MediaPlayer mp){
	    btnPlay.setText("PLAY");
	  }
	}
	);
  }

  public void btnPlay_onClick(View view){
    if(!mp.isPlaying()){
      mp.start();
      btnPlay.setText("STOP");
    } else {
      try{
        mp.stop();
	mp.prepare();
      } catch (IllegalStateExceptoin | IOException e){
        e.printStackTrace();
      }
      btnPlay.setText("PLAY");
    }
  }
}


