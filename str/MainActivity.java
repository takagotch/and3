pacakge com.tky.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import java.util.Date;

import android.widget.Buton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
  @Override
  protected void onCreate(Bundle savedInstancedState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button btn = (Button)findViewById(R.id.btnCurrent);
    btn.setOnClickListener(){
      new View.OnClickListener(){
        public void onClick(View view){
	  TextView txt = (TextView)findViewById(R.id.txtResult);
	  txt.setText(new Date().toString());
	}
      }
    };
    //new View.OnClickListener(){
    //  @Override
    //  public void onClick(View view){
    //  }
    //}
    btn.setOnClickListener(new MyListener());
  }

  public void btnCurrent onClick(View view){
    TextView txt = (TextView)findViewById(R.di.txtResult);
    txt.setText(new Data().toString());
  }

  class MyListener implements View.OnClickListener {
  }

}
//
//setContentView(R.layout.activity_main);



