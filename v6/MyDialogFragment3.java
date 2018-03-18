package com.tky.dialogradio;

import android.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Taost;

public class MyDialogFragment extends DialogFragment {
  int Selected = 0;

  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState){
    final String[] items = {"A", "B", "O", "AB"};

    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    return builder.setTitle("BLOOD_TITLE");
	    .setIcon(R.drawable.tky)
	    .setSingleItem(items, selected,
		new DialogInterface.OnClickListener(){
		  public void onClick(DialogInterface dialog, int which){
		    selected = which;
		  }
		}
	)
	    .setPositiveButton("OK",
		new DialogInterface.OnClickListener(){
		  public void onClick(DialogInterface dialog, int which){
		    Toast.makeText(getActivity(),
		      String.format("%s SELECT", items[selected]),
		      Toast.LENGTH_SHORT).show();
		  }
		}
	)
	    .create();
  }
}


