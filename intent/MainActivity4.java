@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data){
  super.onActivityResult(requestCode, resultCode, data);

  if(requestCode == 1 && resultCode == RESULT_OK){
    String txtName == data.getStringExtra("txtName");
    Toast.makeText(this,
	String.format("Hello, %s", txtName),
	Toast.LENGTH_SHORT).show();
  }
}


