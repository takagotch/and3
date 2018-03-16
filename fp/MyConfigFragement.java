package com.tky.preferencebasic;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class MyConfigFragment extends PreferenceFragment{
  @Override
  public void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    addPreferemcesFromResources(R.xml.pref);
  }
}


