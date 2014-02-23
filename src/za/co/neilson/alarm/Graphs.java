package za.co.neilson.alarm;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.view.Menu;

public class Graphs extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_graphs);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		getMenuInflater().inflate(R.menu.graphs, menu);
		return true;
	}

}
