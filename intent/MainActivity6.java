import android.app.SearchManager;

Intent i = new Intent(Intent.ACTION_WEB_SEARCH);
i.putExtra(SearchManager.QUERY, txtKeywd.getText().toString());

