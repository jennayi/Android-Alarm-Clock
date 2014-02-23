package za.co.neilson.alarm;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

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
	
	public void goHome(View view){
		startActivity(new Intent(this, MainPage.class));
	}
	@Override
	public void onBackPressed(){
		startActivity(new Intent(this, MainPage.class));
	}

}
