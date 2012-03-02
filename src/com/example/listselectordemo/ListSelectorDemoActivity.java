package com.example.listselectordemo;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;

import com.example.listselectordemo.R;

public class ListSelectorDemoActivity extends Activity {
	
	String[] ITEMS = { "Next", "Drawer", "Clock", "Exit" };
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView textView = (TextView) findViewById(R.id.textViewCredits);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        
        ListView view = (ListView)findViewById(R.id.list);
        view.setAdapter(new ArrayAdapter<String>(this, R.layout.menu_item, ITEMS));
        view.setOnItemClickListener(mItemClickListener);    
    }
    
    private final OnItemClickListener mItemClickListener = new OnItemClickListener() {
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        	
        }
    };
}