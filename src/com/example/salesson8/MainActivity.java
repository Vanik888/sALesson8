package com.example.salesson8;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Menu;

public class MainActivity extends Activity implements ActionBar.TabListener{

    private final String myLogger = "myLogger";

    @Override
    public void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ActionBar.Tab tab = actionBar.newTab();
        tab.setText("first tab");
        tab.setTabListener(this);
        actionBar.addTab(tab);

        ActionBar.Tab tab2 = actionBar.newTab();
        tab2.setText("second tab");
        tab2.setTabListener(this);
        actionBar.addTab(tab2);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        Log.d(myLogger, "onTabSelected: "+ tab.getText());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        Log.d(myLogger, "onTabUnselected: " + tab.getText());
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        Log.d(myLogger, "onTabReselected: "+ tab.getText());
    }
}