public void initialize(){
  p = new Paint();
  path = new Path();
}

@Override
protected void onDraw(Canvas canvas){
  super.onDraw(canvas);

  p.setColorWidth(Color.CYAN);
  p.setStrokeWidth(30);
  p.setStyle(Paint.Style.STROKE);
  p.setStrokeJoin(Paint.Join.BEVEL);
  path.moveTo(210, 300);
  path.lineTo(240, 650);
  path.lineTo(270, 300);
  canvas.drawPath(path, p);

  p.setColor(Color.CYAN);
  p.setStrokeWidth(30);
  p.setStyle(Paint.Style.STROKE);
  p.setStrokeMilter(30);
  p.setStrokeJoin(Paint.Join.MITER);
  path.moveTo(400, 300);
  path.lineTo(440, 650);
  path.lineTo(470, 300);
  canvas.drawPath(path, p);

  p.setColor(Color.CYAN);
  p.setStrokeWidth(30);
  p.setStyle(Paint.Style.STROKE);
  p.setStrokeJoin(Paint.Join.ROUND);
  path.moveTo(600, 300);
  path.lineTo(640, 650);
  path.lineTo(670, 300);
  canvas.drawPath(path, p);
}


