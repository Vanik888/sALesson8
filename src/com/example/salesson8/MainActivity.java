package com.example.salesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;


public class MainActivity extends Activity{

	private final String ATTRIBUTE_NAME_TXT = "text";
	private final String ATTRIBUTE_NAME_CHECKED = "checked";
	private final String ATTRIBUTE_NAME_IMAGE = "image";
	private ListView lv;
	
	public void onCreate(Bundle bn) {
		super.onCreate(bn);
		setContentView(R.layout.activity_main);
		String[] arrTexts = {"hello", "main", "asfd", "hjklj", "loea"};
		boolean[] arrCheckBox = { true, false, true, false, true};
		int img = R.drawable.ic_launcher;
		
		ArrayList<Map<String, Object>> data = new ArrayList<Map<String, Object>>(
				arrTexts.length);
		Map<String, Object> m;
		for (int i = 0 ; i < arrTexts.length; i++ ) {
			m = new HashMap<String, Object>();
			m.put(ATTRIBUTE_NAME_TXT, arrTexts[i]);
			m.put(ATTRIBUTE_NAME_CHECKED, arrCheckBox[i]);
			m.put(ATTRIBUTE_NAME_IMAGE, img);
			data.add(m);
		}
		String[] from = { ATTRIBUTE_NAME_TXT, 
					    ATTRIBUTE_NAME_CHECKED, 
						ATTRIBUTE_NAME_IMAGE };
		int[] to = { R.id.txtView, R.id.chBox, R.id.imageV};
		
		SimpleAdapter sAdapter = new SimpleAdapter(this, data, 
								R.layout.item,
								from, to);
		lv = (ListView) findViewById(R.id.listView);
		lv.setAdapter(sAdapter);
		
				
		
	}

}
