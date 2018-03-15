String msg = "";
boolean eol = cs.moveToFirst();
whilte(eol){
  msg += cs.getString(1);
  eol = cs.moveToNext();
}
Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

