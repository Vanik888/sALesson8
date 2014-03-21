package com.example.salesson8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Double var1;
    private Double var2;
    @Override
    public void onCreate(Bundle saveInstantState) {
        super.onCreate(saveInstantState);
        setContentView(R.layout.activity_main);

        EditText etVar1 = (EditText) findViewById(R.id.etVar1);
        var1 = Double.parseDouble(etVar1.getText().toString());

        EditText etVar2 = (EditText) findViewById(R.id.etVar2);
        var2 = Double.parseDouble(etVar1.getText().toString());

    }

    public void onClick(View v) {
        
    }


}