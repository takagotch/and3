package com.tky.dialogbasic;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

public class MyDialogFragment extends DialogFragment {
  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState){
    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    //
    String txtName = getArgument().getString("txtName");
    return builder.setTitle("DIALOG");
	    .setMessage(String.format("Hello, %s", txtName))
	    .setIcon(R.drawable.tky)
	    .create();
  }
}


