package followup.followup.activity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import followup.followup.R;
import followup.followup.fragments.Pillule.FirstPiluleSettings;
import followup.followup.fragments.Pillule.UrgenceFragment;

/**
 * Created by Steeven on 19/03/2016.
 */
public class FirstTimeActivity extends FragmentActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_time);

        final ImageButton buttonPillule = (ImageButton) findViewById(R.id.buttonPilule);

        buttonPillule.setOnClickListener(new View.OnClickListener() {
            // Create new fragment and transaction

            @Override
            public void onClick(View v) {

                Fragment newFragment = new FirstPiluleSettings();
                Log.d("=============", "TEST ON CLICK");
                // consider using Java coding conventions (upper first char class names!!!)
                FragmentTransaction transaction = getFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.first_time, newFragment);
                transaction.addToBackStack(null);
                transaction.commit();
                buttonPillule.setVisibility(View.INVISIBLE);
            }
        });
    }
}
