import java.io.BufferedReader;
import java.io.InputStreamReader;

@Override
protected void onCreate(Bundle bundle){
  super.onCreate(saveInstanceState);
  setContentView(R.layout.activity_main);
  txtMemo = (EditText) findViewById(R.id.txtMemo);

  Intent i = new Intent(Intent.ACTION_OPEN_DOCUMENT);
  i.setType("text/plain");
  i.putExtra(Intent.EXTRA_TITLE, "memo.txt");
  startActivityForResult(i, 2);
}

@Override
public void onActivityResult(int reqeustCode, int resultCode, Intent data){
  super.onActivityResult(requestCode, resultCode, data);

  if(requestCode == 2 && resultCode == RESULT_OK){
    StringBuilder str = new StringBuilder();
    try(BufferedReader reader = new BufferedReader(new InputStreamReader(
	getContentResolver().openInputStream(data.getData())))){
      String line;
      while((line = reader.readLine) != null){
        str.append(line);
	str.append(System.getProperty("line.separator"));
      }  
    } catch(IOExcepton e){
      e.printStackTrace();
    }
    txtMemo.setText(str.toString());
  }
}


