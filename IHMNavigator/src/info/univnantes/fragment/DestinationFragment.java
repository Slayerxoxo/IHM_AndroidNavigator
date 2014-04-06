package info.univnantes.fragment;

import info.androidhive.slidingmenu.R;
import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class DestinationFragment extends Fragment {
	
	public DestinationFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_destination, container, false);
        
        EditText dest = (EditText) rootView.findViewById(R.id.editText1);
        dest.setLines(1);
        
        ListView list = (ListView) rootView.findViewById(R.id.listView1);
        ArrayAdapter<String> adapter1;
        String[] data = {"salle 46","salle I012","salle I011","salle I112","salle I003","salle 49"};

        list.setTextFilterEnabled(true);

        adapter1 = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, data);   
        list.setAdapter(adapter1);

        dest.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
               // FilterListActivity.this.adapter1.getFilter().filter(arg0);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                    int arg3) {
                // TODO Auto-generated method stub
            }

			@Override
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
				
			}
        });
         
        return rootView;
    }
}
