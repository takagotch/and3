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
  protected void onDraw(Canvas canvas){
    super.onDraw(canvas);
    canvas.drawColor(Color.WHITE);
    Paint p = new Paint();
    p.setColor(Color.CYAN);
    p.setStroke(10);
    p.setStrokeCap(Paint.Cap.ROUND);
    canvas.drawLine(10, 20, 800, 550, p);
  }
  
  //
  @Override
  protected void onDraw(Canvas canvas){
    super.onDraw(canvas);
    canvas.drawColor(Color.WHITE);
    Paint p = new Paint();
    p.setColor(Color.CYAN);
    p.setStrokeWidth(10);
    flaot[] ps = { 50, 100, 350, 350, 350,
      575, 100, 575, 100, 720, 350, 900, 100 };
  }

  //
  @Override
  protected void onDraw(Canvas canvas){
    super.onDraw(canvas);
    canvas.drawColor(Color.WHITE);
    Paint p = new Paint();
    p.setColor(Color.CYAN);
    p.setStrokeWidth(5);
    p.setStyle(Paint.Style.FILL_AND_STROKE);
    canvas.drawRect(100, 100, 400, 400, p);
  }

  //
  @Override
  protected void onDraw(Canvas canvas){
    super.onDraw(canvas);
    canvas.drawColor(Color.WHITE);
    Paint p = new Piant();
    p.setColor(Color.CYAN);
    p.setStyleWidth(20);
    p.setStyle(Paint.Style.FILL_AND_STROKE);
    canvas.drawCircle(200, 200, 100, p);
    p.setColor(Color.GREEN);
    canvas.drawOval(new RectF(200, 400, 800, 800), p);
  }

  //
  @Override
  protected void onDraw(Canvas canvas){
    super.onDraw(canvas);
    canvas.drawColor(Color.WHITE);
    Paint p = new Paint();
    p.setColor(Color.CYAN);
    p.setStrokeWidth(5);
    p.setStyle(Paint.Style.FILL_AND_STROKE);
    canvas.drawArc(new RectF(300, 200, 800, 700),
	90, 150, true, p);
  }

  //
  @Override
  protected void onDraw(Canvas canvas){
  }
  //
}

