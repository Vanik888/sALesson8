package com.example.salesson8;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	private final String logger = "myLogger";
	private final String[] arrString = {"asdfsd", "sfhj", "shjh", "kjlj"};
	private TextView tvInfo;
	private MyTask myTask;
	@Override
	protected void onCreate(Bundle bn) {
		super.onCreate(bn);
		setContentView(R.layout.activity_main);
		tvInfo = (TextView) findViewById(R.id.tvInfo);
		myTask = new MyTask(tvInfo);
		
	}
	public void onClick(View v) {
		Log.d(logger, "onClick clicked");
		myTask.execute(arrString);
	}
}