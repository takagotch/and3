package com.tky.dialogcheckbox;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MyDialogFragment extends DialogFragment {
  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState){
    final String[] items = {
      "train", "bus", "walk", "car", "bycle", "other"};
    final boolean[] selected = {true, true, true, false, false, false};

    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    return builder.setTitle("tools")
	    .setIcon(R.drawable.tky)
	    .setMultiChoiceItems(items, selected,
		new DialogInterface.OnMultiChoiceClickListener(){
		  public void onClick(DialogInterface dialog,
			int which, boolean isChecked){
		        selected[which] = isChecked;
		  }
		}
	)

	    .setPositiveButton("OK",
		new DialogInterface.OnClickListener(){
		  public void onClick(DialogInterface dialog, int which){
		    String msg = "";
		    for(int i = 0; i < selected.length; i++){
		      if(selected[i]){
		        msg += items[i] + ",";
		      }
		    }
		    Toast.makeText(getActivity(),
			String.format("%s SELECTED",
			  msg.substring(0, msg.length() - 1)),
			Toast.LENGTH_SHORT).show();
		  }
		}
	)
	    .create();
  }
}

