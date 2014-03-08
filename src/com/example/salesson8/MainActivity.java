package com.example.salesson8;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
	private static final String myLogName = "myLog";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
//		String logName = "myLog";
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.activity_main);
		Log.d(myLogName, "Find ok button" );
		Button btnOk = (Button) findViewById(R.id.btnOk);
		btnOk.setOnClickListener(this);
		Log.d(myLogName, "Find cancell button" );
		Button btnCancell = (Button) findViewById(R.id.btnCancell);
		btnCancell.setOnClickListener(this);
	}
	public void onClick(View view) {
		TextView txtView = (TextView) findViewById(R.id.txtView);
		if (view.getId() == R.id.btnOk) {
			txtView.setText("OK clicked");
			Log.d(myLogName, "OK clicked");
		}
		if (view.getId() == R.id.btnCancell) {
			txtView.setText("Cancell Clicked");
			Log.d(myLogName, "Cancell clicked");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
