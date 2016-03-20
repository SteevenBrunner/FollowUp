package followup.followup.fragments.Pillule;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import followup.followup.R;
import followup.followup.activity.MainActivity;

/**
 * Created by Steeven on 19/03/2016.
 */
public class FirstPiluleSettings extends Fragment
{
    Activity context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        context = getActivity();
        return inflater.inflate(R.layout.first_pillule_setting_view, container, false);
    }
}
