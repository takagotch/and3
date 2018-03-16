package com.tky.myfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Map;

public class DetailsFragment extends Fragment {
  @Override
  public View onCreateView(LayoutInflater inflater,
	ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.details_fragment, container, false);
	Bundle bundle = getArguments();
	if(bundle != null){
	  Map<String> item = ListDataSource.getInfoByName(
		bundle.getString("name"));
	  ((TextView)view.findViewById(R.id.name)).setText(String.format(
		  "%s (%s) ", bundle.getString("name"), item.get("alias")));
	  ((TextView) view.findViewById(R.id.info)).setText(item.get("info"));
	}
	return view;
  }
}


