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
}

