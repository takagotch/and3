pacakge tky.com.networkasync;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class AsyncNetworkTask extends AsyncTask<String, Integer, String> {
  private TextView txtResult;

  public AsyncNetworkTask(Context context){
    super();
    MainActivity activity = (MainActivity)context;
    txtResult = (TextView)activity.findViewById(R.id.txtResult);
  }

  @Override
  protected String doInBackground(String... params){
    publishProgress(30);

    SystemClock.sleep(3000);
    publishProgress(60);
    StringBuilder builder = new StringBuilder();
    try{
      URL url = new URL(params[0]);
      HttpURLConnection con = (HttpURLConnection)url.openConnection();
      con.setRequestMethod("GET");
      BufferedReader reader = new BufferedReader(new InputStreamReader(
	con.gtInputStream(), "Shift-JIS"));
      String line;
      while((line = reader.readLine()) != null){
        builder.append(line);
      }
      content = builder.toString();
    } catch(IOException e){
      e.printStackTrace();
    }
    publishProgress(100);
    return builder.toString();
  }

  @Override
  protected void onProgressUpdate(Integer... values){
    Log.d("url", values[0].toString());
  }

  @Override
  protected void onPostExecute(String result){
    txtResult.setText(result);
  }

  @Override
  protected void onCancelde(){
    txtReslult.setText("CANCEL");
  }
}


