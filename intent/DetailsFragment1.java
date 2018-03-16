public class DetailsFragment extends Fragment {
  private boolean isTwoPane = false;

  @Override
  public void onCreate(Bundle savedInstanceState){
    super.onCreate(savedOmstamceState);
    if(getActivity() findViewById(R.id.detailsFrame) != null){
      isTwoPane = true;
    }
  }

  @Override
  public View onCreateView(LayoutInflater inflater,
	ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.details_fragment, container, false);
	Bundle bundle;
	if(isTwoPane){
	  bundle = getArgument();
	} else {
	  Intent intent = getActivity().getIntent();
	  bundle = intent.getExtra();
	}
	if(bundle != null){
	}
	return view;
  }
}


