import android.graphics.Rect;
import android.graphics.RectF;

public class SimpleView extends View {

  private Rect rect;
  private Rect rectf;

  public void initialize(){
    rect = new Rect(400, 150, 800, 550);
    rectf = new Rect(50, 50, 850, 850);
  }

  @Override
  protected void onDraw(Canvas canvas){
    super.onDraw(canvas);
    canvas.drawColor(Color.WHITE);
    canvas.drawBitmap(bmp, rect, rectf, p);
  }

  //
  @Override
  protected void onDraw(Canvas canvas){
    super.onDraw(canvas);
    canvas.drawColor(Color.WHITE);
    p.setColor(Color.CYAN);
    p.setStrokeWidth(5);
    canvas.translate(200, 200);
    canvas.scale(1.5f, 1.5f);
    canvas.rotate(60);
    canvas.drawRect(0, 0, 200, 200, p);
  }
}


