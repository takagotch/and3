package com.tky.canvasbasic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paintl
import android.util.AttributeSet;
import android.view.View;

public class SimpleView extends View {
  public SimpleView(Context context, AttributeSet attrs, int defStyle){
    super(context, attrs, defStyle);
  }

  public SimpleView(Context context, AttributeSet attrs){
    super(context , attrs);
  }

  public SimpleView(Context context){
    super(context);
  }

  @Override
  protected void onDraw(Canvas canvas){
    super.onDraw(canvas);

    Paint p = new Paint();
    p.setColor(Color.CYAN);
    p.setStrokeWidth(100);

    canvas.drawColor(Color.WHITE);
    canvas.drawPaint(100, 100, p);
  }

  //
  @Override
  protected void onDraw(Canvas canvas){
    super.onDraw(canvas);
    canvas.drawColor(Color.WHITE);
    Paint p = new Paint();
    p.setColor(Color.CYAN);
    p.setStrokeWidth(30);
    float[] ps = { 50, 100, 80, 130, 110, 160, 140, 190 };
    canvas.drawPoints(ps, p);
  }

  //
  @Override
  protected void onDraw(){
    super.onDraw();
    canvas.drawColor();
    Paint p = new Paint();
    p.setColor();
    p.setStroke();
    p.setStrokeCap();
    canvas.drawLine();
  }
}

