package info.univnantes.fragment;

import info.androidhive.slidingmenu.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CarteFragment extends Fragment {
	
	public CarteFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_carte, container, false);
        
        ListView list = (ListView) rootView.findViewById(R.id.rstagesView);
        ArrayAdapter<String> adapter1;
        String[] data = {"Avancez 10m", "Tournez à gauche", "Avancez 5m"};

        list.setTextFilterEnabled(true);

        adapter1 = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, data);   
        list.setAdapter(adapter1);
        
        return rootView;
    }
}
