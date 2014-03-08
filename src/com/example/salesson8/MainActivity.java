package com.example.salesson8;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
	private static final String myLogName = "myLog";
    private	Button addBtn;
	private Button subBtn;
	private Button multBtn;
	private Button divBtn;			
	
	private EditText et1;
	private EditText et2;
	
	private TextView result;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
//		String logName = "myLog";
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.activity_main);
		addBtn = (Button) findViewById(R.id.btnAdd);
		subBtn = (Button) findViewById(R.id.btnSub);
		multBtn = (Button) findViewById(R.id.btnMult);
		divBtn = (Button) findViewById(R.id.btnDiv);
				
		et1 = (EditText) findViewById(R.id.etNum1);
		et2 = (EditText) findViewById(R.id.etNum2);
		
		result = (TextView) findViewById(R.id.tvResult);
		
		addBtn.setOnClickListener(this);
		subBtn.setOnClickListener(this);
		multBtn.setOnClickListener(this);
		divBtn.setOnClickListener(this);
		
	}
	public void onClick(View view) {
		float num1 = 0;
		float num2 = 0;
		float res = 0;
		String oper = "";
		
		if (TextUtils.isEmpty(et1.getText().toString()) 
			|| TextUtils.isEmpty(et2.getText().toString())) {
					Log.d(myLogName,"one of the operands is empty");
					return;
				}
		num1 = Float.parseFloat(et1.getText().toString());
		num2 = Float.parseFloat(et2.getText().toString());
		Log.d(myLogName, "First operand = " + num1);
		Log.d(myLogName, "Second operand = " + num2);
		if (view.getId() == R.id.btnAdd) {
			res = num1 + num2;
			oper = "+";
			Log.d(myLogName, "adding");
			
		}
		if (view.getId() == R.id.btnSub) {
			res = num1 -num2;
			oper = "-";			
			Log.d(myLogName, "sub");
		}
		if (view.getId() == R.id.btnMult) {
			res = num1 * num2;
			oper = "*";
			Log.d(myLogName, "Multiplying");
		}
		if (view.getId() == R.id.btnDiv) {
			res = num1 / num2;
			oper = "/";
			Log.d(myLogName, "Divergating");
		}
		result.setText(num1 + " " + oper + " " + num2 + " = " + res);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
