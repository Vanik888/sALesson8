package com.example.salesson8;

import java.util.concurrent.TimeUnit;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity{
	private Handler handler;
	private TextView tvInfo;
	private Button btnStart;
	private static final String logger = "myLogger";
	
	public void onCreate(Bundle bn) {
		super.onCreate(bn);
		setContentView(R.layout.activity_main);
		tvInfo = (TextView) findViewById(R.id.tvInfo);
		btnStart = (Button) findViewById(R.id.btnStart);
		handler = new Handler() {
			public void handleMessage(android.os.Message msg) {
				tvInfo.setText("File downloading: " +msg.what);
				if (msg.what == 10) {
					btnStart.setEnabled(true);
				}
			}
		};
	}
	public void onClick1(View v) {
		if (v.getId() == R.id.btnStart) {
			v.setEnabled(false);
			Thread t = new Thread(new Runnable() {
				public void run() {
					for (int i = 0; i <= 10 ; i++) {				
						downloading();
						Log.d(logger, "Downloadint file: " + i);
						handler.sendEmptyMessage(i);
					}		
				}
			});
			t.start();
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
