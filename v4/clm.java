list.setOnItemLongClickListener(
  new AdapterView.OnItemLongClickListener(){
    public boolean onItemLongClick(AdapterView<?> av,
	View view, int position, long id){
        adapter.remove((String)((TextView)view).getText());
	return false;
    }
  }
);

