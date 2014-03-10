package com.example.salesson8;

import java.util.concurrent.TimeUnit;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity{
//	private Handler handler;
	private TextView tvInfo;
	private static final String logger = "myLogger";
	
	public void onCreate(Bundle bn) {
		super.onCreate(bn);
		setContentView(R.layout.activity_main);
		tvInfo = (TextView) findViewById(R.id.tvInfo);		
	}
	public void onClick1(View v) {
		if (v.getId() == R.id.btnStart) {
			for (int i = 0; i <= 10 ; i++) {				
				downloading();
				Log.d(logger, "Downloadint file: " + i);
				tvInfo.setText("Downloading file: " + i);
			}
		}
		if (v.getId() == R.id.btnTest) {
			Log.d(logger, "test");

		}		
	}
	public void downloading() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
