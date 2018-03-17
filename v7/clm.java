canvas.save();
canvas.translate(400, 400);
canvas.drawRect(0, 0, 300, 300, p);
canvas.restore();
canvas.drawRect(0, 0, 300, 300, p);

//CanvasView.java CanvasMultiTouch
public boolean onTouchEvent(MotionEvent event){
  for(int i = 0; i < event.getPointerCont(); i++){
    Log.d("MultiTouch",
	String.format("ID %s > [%s, %s]", event
	  .getPinterId(i),
	event.getX(i),
	event.getY(i)
	)
	);
  }
  return true;
}

