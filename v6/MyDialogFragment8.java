package com.tky.dialogprogressup;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.os.Bundle;

public class MyDialogFragment extends DialogFragment {
  private ProgressDialog prog;

  public int getProgress(){
    return prog.getProgress();
  }

  public void setProgress(int value){
    prog.setProgress(value);
  }
}


