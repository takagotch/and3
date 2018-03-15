package com.tky.filebasic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity{
  EditText txtMemo;

  @Override
  protected void onCreate(Bundle saveInstanceState){
    BufferedReader reader = null;

    super.onCreate(saveInstanceState);
    setContentView(R.layout.activity_main);

    StringBuilder str = new StringBuilder();

    try{
      reader = new BufferedReader(
	new InputStreamReader(
	  openFileInput("memo.dat")));
      String line;
      while((line = reader.readLine()) != null){
        str.append(line);
	str.append(System.getProperty("line.separator"));
      }
    } catch(IOException e){
      e.printStackTrace();
    } finally{
      try{
	if(reader != null){
	  reader.close();
	}
      } catch(IOException e){
        e.printStackTrace();
      }
    }
    txtMemo = (EditText) findViewById(R.id.txtMemo);
    txtMemo.setText(str.toString());
  }
}


