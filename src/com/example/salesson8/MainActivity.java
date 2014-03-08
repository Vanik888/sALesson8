package com.example.salesson8;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}
	public void btnOkClick(View view) {
		TextView txtView = (TextView) findViewById(R.id.txtView);
		txtView.setText("OkButton Clicked");				
	}
	public void btnCancellClick(View view) {
		TextView txtView = (TextView) findViewById(R.id.txtView);
		txtView.setText("Cancell Button clicked");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
