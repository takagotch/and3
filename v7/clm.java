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

//anim.xml
<?xml version="1.0" encoding="utf-8" ?>
<set xmlns:android="http://schemas.android.com/apk/res/android"
  android:fillAfter="true">
  <translate
    android:duration="1000"
    android:fromXDelta="30%p"
    android:fromYDelta="0%p"
    android:repeatCount="2"
    android:repeatMode="reverse"
    android:toXDelta="70%p"
    android:toYDelta="0%p">
  </translate>
  <scale
    android:duration="1000"
    android:fromXScale="1.0"
    android:fromYScale="1.0"
    android:pivotX="50%"
    android:pivotY="50%"
    android:startOffset="3000"
    android:toXScale="2.0"
    android:toYScale="2.0">
  </scale>
</set>


//addListener
public void addListener(Animator.AnimatorListener listener)
//onAnimationCancel(Animator a)
//onAnimationEnd(Animator a)
//onAnimationRepeat(Animator a)
//onAnimationStart(Animatior a)





