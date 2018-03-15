package com.tky.networkjson;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

publish class AsyncNetworkTask extends AsyncTask<String, Interger, String>{
  
  @Override
  protected String doInBackground(String... params){
  StringBuilder list = new StringBuilder();
  try{
    try{
      JSONObject json = new JSONObject(builder.toString());
      JSONArray books = json.getJSONArray("books");
      for(int i = 0; i < books.length(); i++){
        JSONObject book = books.getJSONObject(1);
	list.append(book.getString("title")).append("/");
	list.append(book.getStrign("price")).append("YEN\n");
      }
    } catch(JSONExce[topm e){
      e.printStackTrace();
    }
  } catch(Exception e){
    e.printProgress(100);
  }
  publishProgress(100);
  return list.toString();
  }
}

