package com.example.salesson8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
	private static final String myLogName = "myLog";
    private	Button btnSend;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
//		String logName = "myLog";
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.activity_main);
		btnSend = (Button) findViewById(R.id.btnSend);
		btnSend.setOnClickListener(this);
	}
	public void onClick(View view) {
		if (view.getId() == R.id.btnSend) {
			Log.d(myLogName, "Button send clicked");
			Intent myIntent = new Intent(this, SecondActivity.class);
			startActivity(myIntent);			
		}		
		else return;		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
