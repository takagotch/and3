public class MainActivity extends ExpandableListActivity{
  @Override
  protected void onCreate(Bundle savedInstanceState){
    setListAdapter(adapter);
  }

  public boolean onChildClick(ExpandableListView parent,
	View v, int groupPosition, int childPosition, long id){
  
  }
}


