package com.example.salesson8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Double var1;
    private Double var2;
    private TextView tvAnswer;
    private Button btnClear;
    private static final String myLogger = "myLogger";

    @Override
    public void onCreate(Bundle saveInstantState) {
        super.onCreate(saveInstantState);
        setContentView(R.layout.activity_main);
        Log.d(myLogger, "on Create");
        btnClear = (Button) findViewById(R.id.btnClear);
        tvAnswer = (TextView) findViewById(R.id.tvAnswer);
    }

    public void onClick(View v) {
        Log.d(myLogger, "onClick in main");

        EditText etVar1 = (EditText) findViewById(R.id.etVar1);

        EditText etVar2 = (EditText) findViewById(R.id.etVar2);

        if (v.getId() == R.id.btnClear) {
            Log.d(myLogger, "clear");
            tvAnswer.setText("");
            etVar1.setText("");
            etVar2.setText("");
        } else {

            var1 = Double.parseDouble(etVar1.getText().toString());
            var2 = Double.parseDouble(etVar2.getText().toString());

            Double[] arr = new Double[3];
            arr[0] = var1;
            arr[1] = var2;
            Log.d(myLogger, "var1 = " +var1 +", var2 = " +var2);

            if (v.getId() == R.id.btnAdd) {
                arr[2] = MathOperations.add;
                Log.d(myLogger, "add clicked");
            }
            if (v.getId() == R.id.btnDif) {
                arr[2] = MathOperations.dif;
                Log.d(myLogger, "dif clicked");
            }
            if (v.getId() == R.id.btnMult) {
                arr[2] = MathOperations.mult;
                Log.d(myLogger, "mult clicked");
            }
            if (v.getId() == R.id.btnDevide) {
                arr[2] = MathOperations.div;
                Log.d(myLogger, "devide clicked");
            }
            MyTask myTask = new MyTask(tvAnswer);
            myTask.execute(arr);
        }


    }


}