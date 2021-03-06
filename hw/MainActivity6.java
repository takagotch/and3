package com.tky.soucndrecord;

import android.Manifest;
import android.content.pm.PackageManager;
import android.media.MediaRecorder;
import android.os.Environmant;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity{
  private MediaRecorder rec;
  boolean isRec = false;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    rec = new MediaRecorder();
    public void btnRecord_onClick(View view){
      if(ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSOIN_GRANTED || ActivityCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED){
        String[] permission = {Manifest.permission.WRITE_EXTERNAL_STRORAGE,
	  Manifest.permission.RECORD_AUDIO};
	ActivityCompat.requestPermission();
	return;
      }
      Button btnRecord = (Button)findViewById(R.id.btn.Record);
      if(!isRec){
        rec.setAudioSource(MediaRecorder.AudioSource.MIC);
	rec.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
	rec.setAudioEncoder(MediaRecorder.AudioEncoder.DEFAULT);
	rec.setOutputFile(Environment.getExternalStoragePublishDirectory(
		Environment.DIRECTOY_MUSIC).getPath() + "/sound.mp3");
	try{
	   rec.prepare();
	} catch (IllegalStateException | IOException e){
	  e.printStackTrace();
	}
	rec.start();
	isRec = true;
	btnRecord.setText("STOP");
      } else {
        rec.stop();
	rec.reset();
	isRec = false;
	btnRecord.setText("RECORD");
      }
    }
  }

  @Override
  protected void onDestroy(){
    super.onDestroy();
    rec.release();
  }
}


