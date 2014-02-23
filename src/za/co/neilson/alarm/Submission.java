package za.co.neilson.alarm;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Submission extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_submission);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.submission, menu);
		return true;
	}
	
	public void analytics(View view){
		startActivity(new Intent(this, Graphs.class));
	}
	
	public void goHome(View view){
		startActivity(new Intent(this, MainPage.class));
	}
	
	@Override
	public void onBackPressed(){
		startActivity(new Intent(this, MainPage.class));
	}
}
