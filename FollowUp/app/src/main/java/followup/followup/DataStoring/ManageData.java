package followup.followup.DataStoring;

import java.io.FileOutputStream;

/**
 * Created by Steeven on 19/03/2016.
 */
public class ManageData {

	private static	String	filename = "data.xml";
	private static	FileOutputStream fos;

	public ManageData()
	{

	}

	public static void	storingData(String tag, String value)
	{
		//Context.

		/*
		fos =  Context.openFileOutput(filename, Context.MODE_PRIVATE);
		fos.write(string.getBytes());
		fos.close();
		*/
	}
}
