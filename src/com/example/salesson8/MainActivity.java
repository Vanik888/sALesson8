package com.example.salesson8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity implements View.OnClickListener {
	private final static String loggerName = "myLogger";	

	public void onClick(View v) {
		Log.d(loggerName, "all works");
		Intent myIntent = new Intent(this, SecondActivity.class );
		Log.d(loggerName, "starting second activity");
		startActivity(myIntent);
	}
	@Override
	protected void onCreate(Bundle bn) {
		super.onCreate(bn);
		setContentView(R.layout.activity_main);
		Button btn = (Button) findViewById(R.id.btnSend);
		btn.setOnClickListener(this);
		
		Log.d(loggerName, "MainActivity: onCreate");	
		
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Log.d(loggerName, "MainActivity: onStart");
	}
	
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.d(loggerName, "MainActivity: onResume");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Log.d(loggerName, "MainActivity: onPause");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		Log.d(loggerName, "MainActivity: onStop");
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(loggerName, "MainActiviy: onDestroy");
	}
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(loggerName, "MainActivity: onRestart");
	}

}
