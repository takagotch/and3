package com.tky.mynetwork;

import android.widget.ProgressBar;

public class AsyncNetworkTask extends AsyncTask<String, Integer, String>{
  private TextView txtResult;
  private ProgressBar progress;

  public AsyncNetworkTask(Activity activity){
    super();
    MainActivity activity = (MainActivity)context;
    txtResult = (TextView)activity.findViewById(R.id.txtResult);
    progress = (ProgressBar)activity.findViewById(R.id.progress);
  }

  @Override
  protected String doInBackground(String... strings){
    publishProgress(30);
    SystemClock.sleep(3000);
    publishProgress(60);

    publishProgress(100);
    return builder.toString();
  }

  @Override
  protected void onPreExecute(){
    progress.setVisibility(ProgressBar.VISIBLE);
  }

  @Override
  protected void onProgressUpdate(Integer... values){
    progress.setProgress(values[0]);
  }

  @Override
  protected void onPostExecute(String result){
    txtResult.setText(result);
    progress.setVisibility(ProgressBar.GONE);
  }

  @Override
  protected void onCancelled(){
    txtResult.setText("CANCEL");
    progress.setVisibility(ProgressBar.GONE);
  }
}


