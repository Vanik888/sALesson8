package com.example.salesson8;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity{
	private ArrayList<Product> productList = new ArrayList<Product>();
	private MyBoxAdapter myAdapter;
	
	@Override
	public void onCreate(Bundle bnl) {
		super.onCreate(bnl);
		setContentView(R.layout.activity_main);
		
		fillData();
		myAdapter = new MyBoxAdapter(this, productList);
		
		ListView lvMain = (ListView) findViewById(R.id.lvMain);
		lvMain.setAdapter(myAdapter);
	}
	public void fillData() {
		for (int i = 0; i <= 20 ; i++) {
			productList.add(new Product(R.drawable.ic_launcher, "Product" + i, i*1000, false));		
		}
	}
	public void showResult(View v) {
		String result = "Your ordered things:\n";
		for(Product p : myAdapter.getBox()) {
			if (p.getBox()) {
				result += p.getName()+"\n";
			}			
		}
		Toast.makeText(this, result, Toast.LENGTH_LONG).show();
	}
	
}
