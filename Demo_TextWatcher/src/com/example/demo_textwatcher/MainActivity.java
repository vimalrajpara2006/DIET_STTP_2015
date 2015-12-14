package com.example.demo_textwatcher;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ((EditText)findViewById(R.id.etWatcherDemo)).addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				Log.i("onTextChanged", s.toString());
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				Log.i("beforeTextChanged", s.toString());
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				Log.i("afterTextChanged", s.toString());
			}
		});
    }

}
