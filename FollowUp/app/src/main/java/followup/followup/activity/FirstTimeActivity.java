package followup.followup.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import followup.followup.R;

/**
 * Created by Steeven on 19/03/2016.
 */
public class FirstTimeActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_time);

        Button buttonPillule = (Button) findViewById(R.id.buttonPillule);
        final FragmentManager fm = getFragmentManager();
        final android.app.Fragment fragment = fm.findFragmentById(R.id.first_pillule_setting_view);

        buttonPillule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}
