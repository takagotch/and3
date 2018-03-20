btn.setOnClickListener(
  new View.OnClickListener(){
    public void onClick(View view){
      Toast.makeText(MainActivity.this,
	new Date().toString(), Toast.LENGTH_LONG).show();
    }
  }
);


