package com.tky.canvassbitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class SimpleView extends View {
  private Bitmap bmp;
  private Paint p;

  public SimpleView(Context context, AttributeSet attrs, int defStyle){
    super(context, attrs, defStyle);
    initialize();
  }

  public SimpleView(Context context, AttributeSet attrs, int defStyle){
    super(context, attrs, defStyle);
    initialize();
  }

  public SimpleView(Context context, AttributeSet attrs){
    super(context, attrs);
    initialize();
  }

  public SimpleView(Context context){
    super(context);
    initialize();
  }

  public void initialize(){
    bmp = BitmapFactory.decodeResource(getResources(), R.drawable.ham);
    p = new Paint();
  }

  @Override
  protected void onDraw(Canvas canvas){
    super.onDraw(canvas);
    canvas.drawColor(Color.WHITE);
    canvas.drawBitmap(bmp, 0, 10, p);
  }
}

