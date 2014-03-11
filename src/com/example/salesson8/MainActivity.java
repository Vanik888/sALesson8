package com.example.salesson8;

import java.util.concurrent.TimeUnit;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity{
	private Handler handler;
	private TextView tvInfo;
	private Button btnStart;
	private static final String logger = "myLogger";
	private final int STATUS_NONE = 0;
	private final int STATUS_CONNECTING = 1;
	private final int STATUS_CONNECTED = 2;
	
	private Handler h;
	private TextView tvStatus;
	private ProgressBar pbConnect;
	private Button btnConnect;
	
	public void onCreate(Bundle bn) {
		super.onCreate(bn);
		setContentView(R.layout.activity_main);
		
		tvStatus = (TextView) findViewById(R.id.tvStatus);
		pbConnect = (ProgressBar) findViewById(R.id.pbConnect);
		btnConnect = (Button) findViewById(R.id.btnConnect);
		
	    h = new Handler() {
	        public void handleMessage(android.os.Message msg) {
	        	if (msg.what == STATUS_NONE) {	        		
		            btnConnect.setEnabled(true);
		            tvStatus.setText("Not connected");
	        	}
	        	if (msg.what == STATUS_CONNECTING) {
		            btnConnect.setEnabled(false);
		            pbConnect.setVisibility(View.VISIBLE);
		            tvStatus.setText("Connecting");
	        	}
	        	if (msg.what == STATUS_CONNECTED) {
		            pbConnect.setVisibility(View.GONE);
		            tvStatus.setText("Connected");
	        	}	          
	        }
	      };
	      h.sendEmptyMessage(STATUS_NONE);		
	}	
	public void onClick(View v) {
		Thread t = new Thread(new Runnable() {
			public void run() {
				try {
					h.sendEmptyMessage(STATUS_CONNECTING);
					TimeUnit.SECONDS.sleep(2);
					
					h.sendEmptyMessage(STATUS_CONNECTED);
					TimeUnit.SECONDS.sleep(3);
					
					h.sendEmptyMessage(STATUS_NONE);
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t.start();
	}
}
