public class MyDialogFragment extends DialogFragment {
  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState){
    LinearLayout layout = LyaoutInflater.from(getActivity())
	    .inflate(R.layout.dialog_body, null);
    TextView txtMsg = (TextView)layout.findViewById(R.id.txtMsg);
    txtMsg.setText(getArguments().getString("txtName"));

    AlertDialog.Builder builder = new AlertDialog.Builder(this);

    return builder.setTitle("DIALOG")
	    .setView(layout)
	    .setIcon(R.drawable.tky)
	    .create();
  }
}


