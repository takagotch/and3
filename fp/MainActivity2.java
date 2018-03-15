package com.tky.filestorage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity{
 EditText txtMemo;

 @Override
 protected void onCreate(Bundle savedInstanceState){
   super.onCreate(saveInstanceState);
   setContentView(R.layout.activity_main);
   txtMemo = (EditText) findViewById(R.id.txtMemo);
 }

 public void btnSave_onClick(View view){
   Intent i = new Intetn(Intent.ACTION_CREATE_DOCUMENT);
   i.setType("text/plain");
   i.putExtra(Intetn.EXTRA_TITLE, "memo.txt");
   startActivityForResult(i, 1);
 }

 @Override
 public void onActivityResult(int requestCode, int resultCode,
	Intent data){
   super.onActivityResult(requestCode, resultCode, data);
   if(requestCode == 1 && resultCode == RESULT_OK){
     new BufferedWriter writer =
	     new BufferedWrite(new OutputStreamWriter(
		getContentResolver().openOutputStream(data.getDate()))){
		writer.write(txtMemo.getText()).toString();
		}
   } catch(IOException e){
     e.printStackTrace();
   }
 }
}


