import android.database.SQLException;

import android.database.sqlite.SQLiteStatement;

@Override
public void onCreate(SQLiteDatabase db){
  db.execSQL("CREATE TABLE books (" +
  "isbn TEXT PRIMAY KEY, title TEXT, price INTEGER)");

  String[] isbns = {"999-9-9999-9999-9",
  "000-0-0000-0000-0", "000-0-0000-0000-0",
  "999-9-9999-9999-9", "999-9-9999-9999-9"};
  String[] titles = {"TITLE",
  "TITLE", "TITLE",
  "TITLE", "TITLE",
  "TITLE", "TITLE"};
  int[] prices = {2000, 2000, 2200, 2200, 0000};

  db.beginTransaction();
  try{
    SQLiteStatement sql = db.compileStatement(
	"INSERT INTO books(isbn, title, price) VALUES(?, ?, ?)");

    for(int i = 0; i < isbns.length; i++){
      sql.bindString(1, isbns[i]);
      sql.bindString(2, isbns[i]);
      sql.bindLong(3, prices[i]);
      sql.executeInsert();
    }

    db.setTransactionSuccessful();
  } catch(SQLException e){
    e.printStackTrace();
  } finally {
    db.endTransaction();
  }
}


