package com.tky.dialoglist;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MyDialogFragment extends DialogFragment {
  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState){
    final String[] items = {"A", "B", "O", "AB",};
    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    return builder.setTitle("BLOOD_ITEMS")
	    .setIcon(R.drawable.tky)
	    .setItems(items,
		new DialogInterface.OnClickListener(){
		  public void onClick(DialogInterface dialog, int which){
		    Toast.makeText(getActvity(),
			String.format("%s SELLECT", items[which]),
			Toast.LENGTH_SHORT).show();
		  }
		}
	)
	    .create();
  }
}


