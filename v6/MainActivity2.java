import java.lang.ref.WeakReference;

public class MainActivity extends AppCompatActivity{
  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    handler = new MyHandler(this);
  
  }

  private static class MyHandler extends Handler {
    private final WeekReference<MainActivity> activity;

    MyHandler(MainActivity activity){
      this.activity = new WeakReference<>(activity);
    }

    public void handlerMessage(Message msg){
      MainActivity a = activity.get();
      switch(msg.what){
        case 1:
		a.dialog.setProgress(a.dialog.getProgress() + 1);
		break;
	case 0:
		a.dialog.dismiss();
		break;
      }
    }
  }
}


