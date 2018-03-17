package com.tky.surfacetouch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvnet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class SimpleSurface extends SurfaceView {
  Path path;
  Paint p;

  private void init(){
    p = new Paint();
    p.setColor(Color.BLUE);
    p.setStrokeWidth(3);
    p.setStyle(Paint.Style.STROKE);
    p.setStrokeJoin(Paint.Join.ROUND);
    path = new Path();
    getHolder().addCallback(
	new SurfaceHolder.Callback(){
	}
    );
  }

  private void draw(SurfaceHolder holder){
    Canvas canvas = holder.lockCanvas();
    canvas.drawColor(Color.WHITE);
    canvas.drawPath(path, p);
    holder.unlockCanvasAndPost(canvas);
  }

  @Override
  public boolean onTouchEvent(MotionEvent event){
    switch(event.getAction()){
      case MotionEvent.ACTION_DOWN:
	      path.moveTo(event.getX(), event.getY());
	      break;
      case MotionEvent.ACTION_MOVE:
	      path.lineTo(event.getX(), event.getY());
	      break;
      case MotionEvent.ACTION_UP:
	      path.lineTo(event.getX(), event.getY());
	      break;
    }
    draw(getHolder());
    return true;
  }
}


