package info.univnantes.fragment;

import info.androidhive.slidingmenu.R;
import info.univnantes.activity.LoginActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ProfileFragment extends Fragment {
	
	public ProfileFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_profil, container, false);
        
        Button buttonDisconnect = (Button) rootView.findViewById(R.id.button1);
        buttonDisconnect.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				FragmentManager fragmentManager = getFragmentManager();
				fragmentManager.beginTransaction()
						.replace(R.id.frame_container, new DeconnexionFragment()).commit();

				// update selected item and title, then close the drawer
				/*mDrawerList.setItemChecked(2, true);
				mDrawerList.setSelection(2);
				setTitle(navMenuTitles[2]);*/
			}
		});
        
        return rootView;
    }
}
