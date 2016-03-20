package followup.followup.activity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.util.Date;

import followup.followup.R;
import followup.followup.fragments.Pillule.UrgenceFragment;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		//Todo: Enlever le dur

		//writeInfos("Name", "Pauline");
		//writeInfos("Pill", "3 semaines");

		try {
			readInfos();
		} catch (IOException e) {
			e.printStackTrace();
		}

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button buttonPillule = (Button) findViewById(R.id.urgence);

		buttonPillule.setOnClickListener(new View.OnClickListener() {
			// Create new fragment and transaction

			@Override
			public void onClick(View v) {

				Fragment newFragment = new UrgenceFragment();
				Log.d("=============", "TEST ON CLICK");
				// consider using Java coding conventions (upper first char class names!!!)
				FragmentTransaction transaction = getFragmentManager().beginTransaction();

				// Replace whatever is in the fragment_container view with this fragment,
				// and add the transaction to the back stack
				transaction.replace(R.id.fragment_container, newFragment);
				transaction.addToBackStack(null);
				transaction.commit();
			}
		});
	}

	// write text to file
	public void writeInfos(String tag, String data) {
		// add-write text into file
		try {
			Log.d("**********", "Test save XML");

			//Todo: actually writing "Name//Pauline"
			String date = DateFormat.getDateTimeInstance().format(new Date());
			String concat = date + "//" + tag + "//" + data + "$";

			FileOutputStream fileout = openFileOutput("data.txt", MODE_APPEND);
			fileout.write(concat.getBytes());
			Log.d("STRING--", "[" + concat + "]");
			//deleteFile("data.txt");
			fileout.close();

			Log.d("----------", "Test save XML");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void readInfos() throws IOException {
		FileInputStream fis = openFileInput("data.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader bufferedReader = new BufferedReader(isr);
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			//Log.d("LINE = ", line);
			sb.append(line);
		}
		Log.d("Content = ", "[" + sb + "]");
		Log.d("--------------", "DAAAAAAUUUUUBBEEEE");
	}

	public void	readSpecificInfos(String type)
	{
		//Todo: Fill this method
	}
}
