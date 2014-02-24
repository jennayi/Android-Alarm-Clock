package za.co.neilson.alarm;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class TrackDonations extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_track_donations);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.track_donations, menu);
		return true;
	}
	public void about(View view){
		startActivity(new Intent(this, About.class));
	}
	@Override
	public void onBackPressed(){
		startActivity(new Intent(this, MainPage.class));
	}
	public void goHome(View view){
		startActivity(new Intent(this, MainPage.class));
	}

}
