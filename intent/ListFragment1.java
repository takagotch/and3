public class ListFragment extends Fragment {
  private boolean isTwoPane = false;

  @Override
  public void onActivityCreate(Bundle savedInstanceState){
    super.onActivityCreated(savedInstanceState);

    if(fetActivity() findViewById(R.id.detailsFrame) != null){
      isTwoPane = true;
    }
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
    list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
      @Override
      public void onItemClick(AdapterView<?> parent,
	View view, int i, long id){
        Bundle bundle = new Bundle();
	bundle.putString("name", (String) parent.getItemAtPosition(i));

	if(isTwoPane){
	  FragmentManager manager = getFragmentManager();
	  FragmentTransaction transaction = manager.beginTransaction();
	  DetailsFragment fragment = new DetailsFragment();
	  fragment.setArgument(bundle);
	  transaction.replace(R.id.detailsFrame, fragment);
	  transaction.commit();
	} else {
	  Intent intent = new Intent(getActivity(), DetailsActivity.class);
	  intent.putExtra(bundle);
	  startActivity(intent);
	}
      }
    });
    return view;
  }
}


