package info.univnantes.fragment;

import info.androidhive.slidingmenu.R;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {
	
	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        
        Button buttonDest = (Button) rootView.findViewById(R.id.buttonEnterTarget);
		buttonDest.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				FragmentManager fragmentManager = getFragmentManager();
				fragmentManager.beginTransaction()
						.replace(R.id.frame_container, new DestinationFragment()).commit();

				// update selected item and title, then close the drawer
				/*mDrawerList.setItemChecked(2, true);
				mDrawerList.setSelection(2);
				setTitle(navMenuTitles[2]);*/
			}
		});
		
		Button buttonMap = (Button) rootView.findViewById(R.id.buttonDisplayMap);
		buttonMap.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				FragmentManager fragmentManager = getFragmentManager();
				fragmentManager.beginTransaction()
						.replace(R.id.frame_container, new CarteFragment()).commit();

				// update selected item and title, then close the drawer
				/*mDrawerList.setItemChecked(2, true);
				mDrawerList.setSelection(2);
				setTitle(navMenuTitles[2]);*/
			}
		});
		
		Button buttonQRCode = (Button) rootView.findViewById(R.id.buttonFlashQRCode);
		buttonQRCode.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				FragmentManager fragmentManager = getFragmentManager();
				fragmentManager.beginTransaction()
						.replace(R.id.frame_container, new QrCodeFragment()).commit();

				// update selected item and title, then close the drawer
				/*mDrawerList.setItemChecked(2, true);
				mDrawerList.setSelection(2);
				setTitle(navMenuTitles[2]);*/
			}
		});
         
        return rootView;
    }
}
