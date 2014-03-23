package com.example.salesson8;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by vanik on 22.03.14.
 */
public class MyTask extends AsyncTask<Double, Void, Double> {
    private static final String myLogger = "myLogger";
    private TextView tvAnswer;
//    private Double result;

    public MyTask(TextView tvAnswer) {
        this.tvAnswer = tvAnswer;
    }
    @Override
    public void onPreExecute() {
        super.onPreExecute();
        Log.d(myLogger, "onPreExecute");
    }

    @Override
    public Double doInBackground(Double... params) {
        Log.d(myLogger, "doInBackgroung");
        Double sign = params[2];
        Log.d(myLogger, "params0" + params[0] + " params2 = " + params[2]);
//        if (sign == MathOperations.add) {
//            Log.d(myLogger, "result = " + (params[0] + params[1]));
//            result =  params[0]+params[1];
//        }
//        if (sign == MathOperations.dif) {
//            Log.d(myLogger, "result = " + (params[0] - params[1]));
//            result =  params[0]-params[1];
//        }
//        if (sign == MathOperations.mult) {
//            result =  params[0]*params[1];
//        }
//        if (sign == MathOperations.div) {
//            result = params[0]/params[1];
//        }
        if (sign == MathOperations.add) {
            Log.d(myLogger, "result = " + params[0]+params[1]);
            return params[0]+params[1];
        }
        if (sign == MathOperations.dif) {
            return params[0]-params[1];
        }
        if (sign == MathOperations.mult) {
            return params[0]*params[1];
        }
        if (sign == MathOperations.div) {
            return params[0]/params[1];
        }
        return null;
    }

    @Override
    public void onPostExecute(Double res) {
        super.onPostExecute(res);
        Log.d(myLogger, "result = " + res);
        tvAnswer.setText("Result = "+res);
    }
}
