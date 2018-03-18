package com.tky.dialogprogress;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.os.Bundle;

public class MyDialogFragment extends DialogFragment {
  private ProgressDialog prog;

  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState){
    prog = new ProgressDialog(getActivity());
    prog.setTitle("ProgressDialog");
    prog.setMessage("On ...");
    prog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
    prog.setMax(100);
    prog.setProgress(0);
    prog.setCancelable(true);
    return prog;
  }
}


