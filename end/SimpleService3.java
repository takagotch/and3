import java.util.Date;

public class SimpleService extends Service {
  private final String TAG = "SimpleService";
  private Timer timer;

  public static final String ACTION = "SimpleService Action";

  @Override
  public int onStartCommand(Intent intent, int flags, int startId){
    timer = new Timer();
    timer.schedule(new TimerTask(){
      @Override
      public void run(){
        Intent i = new Intent(ACTION);
	i.putExtra("message", (new Date()).toString());
	sendBroadcast(i);
      }
    }, 0, 5000);
    return START_STICKY;
  }
}

