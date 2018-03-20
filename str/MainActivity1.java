public class MainActivity extends AppCompatActivity{

  @Override
  protected void onSaveInstanceState(Bundle onState){
    super.onSaveInstanceState(outState);
    TextView txtResult = (TextView)findViewById(R.id.txtResult);
    outState.putString("txtResult", txtResult.getText().toString());
  }

  @Override
  protected void onRestoreInstanceState(Bundle savedInstanceState){
    super.onrestoreInstanceState(savedInstanceState);
    TextView txtResult = (TextView)findViewById(R.id.txtResult);
    txtResult.setText(savedInstanceState.getString("txtResult"));
  }
}

