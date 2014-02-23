package za.co.neilson.alarm;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class About extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about, menu);
		return true;
	}
	
	public void goHome(View view){
		startActivity(new Intent(this, MainPage.class));
	}
	@Override
	public void onBackPressed(){
		startActivity(new Intent(this, MainPage.class));
	}
}
