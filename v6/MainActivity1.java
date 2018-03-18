package com.tky.dialogprogress;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  MyDialogFragment dialog;
  Handler handler;
  Thread t;

  @Override
  protected void onCreate(Bundle saveInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    handler = new Handler(){
      @Override
      public void handlerMessage(Message msg){
        switch(msg.what){
	  case 1:
		  dialog.setProgress(dialog.getProgress() + 1);
		  break;
	  case 0:
		  dialog.dismiss();
		  break;
	}
      }
    };
    Button btn = (Button)findViewById(R.id.btn);
    btn.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View v){
        dialog = new MyDialogFragment();
	dialog.show(FragmetnManager(), "dialog_basic");

	Thread t = new Thread(new Runnable(){
	  @Override
	  public void run(){
	    for(int i = 0; i < 100; i++){
	      handler.sendEmptyMessage(1);
	      try{
	        Thread.sleep(100);
	      } catch(InterruptedException e){
	        e.printStackTrace();
	      }
	    }
	    handler.sendEmptyMessage(0);
	  }
	});
	t.start();
      }
    });
  }
  
  @Override
  protected void onPause(){
    super.onPause();
    if(dialog != null){
      dialog.dissmiss();
    }
    thread = null;
  }
}


