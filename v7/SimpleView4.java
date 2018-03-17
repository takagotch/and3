public void initialize(){
  bmp = BitmapFactory.decodeResource(getResources(), R.drawable.sea);
  p = new Paint();
  path = new Path();
  rect = new RectF(100, 100, 1000, 900);
}

@Override
protected void onDraw(Canvas canvas){
  super.onDraw(canvas);
  canvas.drawColor(Color.WHITE);
  p.setStrokeWidth(5);
  path.addOval(rect, Path.Direction.CW);
  canvas.clipPath(path);
  canvas.drawBitmap(bmp, 0, 0, p);
}


