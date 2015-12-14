package com.example.demo_click;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btnClickDemo = (Button)findViewById(R.id.btnClickDemo);
        btnClickDemo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Hurray,\ncaptured single click", Toast.LENGTH_SHORT).show();
			}
		});
        
        Button btnLongClickDemo = (Button)findViewById(R.id.btnLongClickDemo);
        btnLongClickDemo.setOnLongClickListener(new OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				Toast.makeText(getApplicationContext(), "Hurray,\ncaptured long click", Toast.LENGTH_SHORT).show();
				return true;
			}
		});
    }

    
}
