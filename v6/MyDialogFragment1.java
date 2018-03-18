package com.tky.dialogbutton;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MyDialogFragment extends DialogFragment {
  @Override
  public Dialog onCreateDialog(Bundle saveInstanceState){
    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    return builder.setTitle("DIALOG")
	    .setMessage("DIALOG")
	    .setIcon(R.drawable.tky)
	    .setPositiveButton("YES",
		new DialogInterface.OnClickListener(){
		  public void onClick(DialogInterface dialog, int which){
		    Toast.makeText(getActivity(), "CORRECT", Toast.LENGTH_SHORT)
			    .show();
		  }
		}
	);
    	    
    .setNegativeButton("NO",
	new DialogInterface.OnClickListener(){
	  public void onClick(DialogInterface dialog, int which){
	    Toast.makeText(getActivity(), "ERR", Toast.LENGTH_SHORT)
		    .show();
	  }
	}
     )

    .setNeutralButton("CANCEL",
	new DialogInterface.OnClickListener(){
	  public void onClick(DialogInterface dialog, int which){ }
	}
    )

    .create()
  }
}


