package com.tky.surfacebasic;

import android.context.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class SimpleSurface extends SurfaceView {
  Paint p;

  public SimpleSurface(Context context, AttributeSet attrs, int defStyle){
    super(context, attrs, defStyle);
    init();
  }

  public SimpleSurface(Context context, AttributeSet attrs){
    super(context, attrs);
    init();
  }

  public SimpleSurface(Context context){
    super(context);
    init();
  }

  private void init(){
    p = new Paint();
    p.setColor(Color.CYAN);
    getHolder().addCallback(
	new SurfaceHolder.Callback(){
	  public void surfaceChanged(SurfaceHolder holder,
		int format, int width, int height){
	  }

	  public void surfaceCreate(SurfaceHolder holder){
	    draw(holder);
	  }

	  public void surfaceDestroyed(SurfaceHolder holder){
	  }
	}
    );
  }

  private void draw(SurfaceHolder holder){
    Canvas canvas = holder.lockCanvas();
    canvas.drawColor(Color.WHITE);
    canvas.drawRect(100, 100, 400, 400, p);
    holder.unlockCanvasAndPost(canvas);
  }
}

