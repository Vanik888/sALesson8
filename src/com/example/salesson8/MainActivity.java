package com.example.salesson8;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity{	
	private TextView tvInfo;
	private MyTask myTask;
	public void onCreate(Bundle bn) {
		super.onCreate(bn);
		setContentView(R.layout.activity_main);
	}
	public void onClick(View v) {
		tvInfo = (TextView) findViewById(R.id.tvInfo);
		myTask = new MyTask(tvInfo);
		myTask.execute();
	}
}
