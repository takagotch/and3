package com.tky.surfaceanimation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class SimpleSurface extends SurfaceView {
  Paint p;

  private void draw(SurfaceHolder holder){
    final SurfaceHolder h = holder;
    Thread thread = new Thread(new Runnable(){
      public void run(){
        for(int i = 0; i < 1000; i++){
	  Canvas canvas = h.lockCanvas();
	  canvas.drawColor(Color.WHITE);
	  canvas.drawCircle(100 + i, 100 + i,
	    50, p);
	  h.unlockCanvasAndPost(canvas);
	  try{
	    Thread.sleep(50);
	  } catch (InterruptedException e){
	    e.printStackTrace();
	  }
	}
      }
    });
    thread.start();
  }
}


