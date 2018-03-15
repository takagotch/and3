public  void onSave(View view){
  cv.put("price", txtPrice.getText().toString());
  db.insertWidthOnConflict("books", null, cv, SQLiteDatabase.CONFLICT_REPLACE);
  Toast.makeText(this, "SUCCESS",
	Toast.LENGTH_SHORT).show();
}

