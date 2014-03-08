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
		TextView myTextView = (TextView) findViewById(R.id.txtView);
		myTextView.setText("hello world");
		Button myBtn = (Button) findViewById(R.id.btn);
		myBtn.setText("Send)");
		CheckBox myChB = (CheckBox) findViewById(R.id.chB);
		myChB.setChecked(true);
	}
	public void btnClick(View view) {
		TextView myTextView = (TextView) findViewById(R.id.txtView);
		myTextView.setText("send");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
