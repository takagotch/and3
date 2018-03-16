package com.tky.myfragment;

import android.app.Fragment;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View;
import android.view.ViewGroup;
import android.view.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListFragment extends Fragment {
  @Override
  public View onCreate(LayoutInflater inflater,
	ViewGroup container, Bundle savedInsanceState){
        View view = inflater.inflate(R.layout.list_fragment, container, false);
	ArrayAdapter<String> adapter = new ArrayAdapter<>(
		getActivity(), android.R.layout.simple_list_item_1,
		ListDataSource.getAllNames());
	ListView list = (ListView) view.findViewById(R.id.list);
	list.setAdapter(adapter);
	list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
	  @Override
	  public void onItemClick(
		AdapterView<?> parent, View view, int i, long id){
		FragmentManager manager = getFragmentManager();
		FragmentTransaction transaction
			= manager.beginTransaction();
		DetailsFragment fragment = new DetailsFragment();
		Bundle bundle = new Bundle();
		bundle.putString("name",
			(String) parent.getItemPosition(i));
		fragment.setArguments(bundle);
		transaction.replace(R.id.detailsFrame, fragment);
		transaction.commit();
		}
	});
	return view;
  }
}


