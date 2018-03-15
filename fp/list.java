
//update
public int update(String table, ContentValues values,
	String whereClause, String[] whereArgs)
ContentValues cv = new ContentValues();
cv.put("title", txtTitle.getText().toString());
cv.put("price", txtPrice.getText().toString());
String[] params = { txtIsbn.getText().toString() };
db.update("books", cv, "isbn = ?", params);


