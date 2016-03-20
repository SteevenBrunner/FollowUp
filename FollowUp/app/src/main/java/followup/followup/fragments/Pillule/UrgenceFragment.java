package followup.followup.fragments.Pillule;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import followup.followup.R;
import followup.followup.activity.MainActivity;
import android.app.Fragment;

/**
 * Created by Steeven on 19/03/2016.
 */
public class UrgenceFragment extends Fragment /*implements View.OnClickListener */  {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_urgence, null);
        final Button buttonPillule = (Button) v.findViewById(R.id.buttonOubli);
        return inflater.inflate(R.layout.fragment_urgence, container, false);
    }

/*    public void onClick(View v) {

        switch(v.getId())
        {
            case R.id.buttonOubli:
                Fragment newFragment = new UrgenceOubli_recapFragment();
                Log.d("=============", "TEST ON CLICKEZAEA");
                // consider using Java coding conventions (upper first char class names!!!)
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.fragment_container, newFragment);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
        }
    }*/

}