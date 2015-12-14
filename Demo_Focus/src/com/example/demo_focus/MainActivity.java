package com.example.demo_focus;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;


public class MainActivity extends Activity implements OnFocusChangeListener {

	EditText etFirst,etSecond,etThird;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        etFirst = (EditText)findViewById(R.id.etFirst);
        etSecond = (EditText)findViewById(R.id.etSecond);
        etThird = (EditText)findViewById(R.id.etThird);
        
        etFirst.setOnFocusChangeListener(this);
        etSecond.setOnFocusChangeListener(this);
        etThird.setOnFocusChangeListener(this);
    }

	@Override
	public void onFocusChange(View v, boolean hasFocus) {
		resetBgColor();
		v.setBackgroundColor(0xFFe2ffc6);
	}

	void resetBgColor(){
		etFirst.setBackgroundColor(0xFFC6E2FF);
		etSecond.setBackgroundColor(0xFFC6E2FF);
		etThird.setBackgroundColor(0xFFC6E2FF);
	}
}
