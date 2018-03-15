package com.tky.networkloader;

import android.app.Loader.LoaderManager;
import android.content.Loader;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity
  implements LoaderManager.LoaderCallbacks<String>{
  MyAsyncLoader loader;
  TextView txtResult;
  ProgressBar spinner;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    txtResult = (TextView)findById(R.id.txtResult);
    spinner = (ProgressBar)findViewById(R.id.spinner);

    Bundle b = new Bundle();
    b.putString("url", "http://tky.com/");
    getLoaderManager().intLoader(1, b, this);
  }

  @Override
  public Loader<String> onCreateLoader(int id, Bundle args){
    if(id == 1){
      spinner.setVisibility(ProgressBar.VISIBLE);
      MyAsyncLoader loader = new MyAsyncLoader(this, args.getString("url"));
      loader.forceLoad();
      return loader;
    }
    return null;
  }

  @Override
  public void onLoaderFinished(Loader<String> loader, String data){
    txtResult.setText(data);
    spinner.setVisibility(ProgressBar.GONE);
  }

  @Override
  public void onLoaderReset(Loader<String> loader){
  }
}


