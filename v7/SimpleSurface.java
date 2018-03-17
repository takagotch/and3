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
}

