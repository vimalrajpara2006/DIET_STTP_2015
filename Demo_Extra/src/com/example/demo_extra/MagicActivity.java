package com.example.demo_extra;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;


public class MagicActivity extends Activity {

	@Bind(R.id.tvLarge) TextView tvLarge;
	@Bind(R.id.tvMedium) TextView tvMedium;
	@Bind(R.id.tvSmall) TextView tvSmall;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ButterKnife.bind(this);
        
        tvLarge.setText("My custom large text");
		tvMedium.setText("My custom medium text");
		tvSmall.setText("My custom small text");
    }

    @OnCheckedChanged(R.id.toggelButton)
    void myToggleCheckChangeCallback(ToggleButton toggleButton){
    	if (toggleButton.isChecked()) {
    		Toast.makeText(getApplicationContext(), "Toggle button is ON", Toast.LENGTH_SHORT).show();	
		} else {
			Toast.makeText(getApplicationContext(), "Toggle button is OFF", Toast.LENGTH_SHORT).show();
		}
    }
    
    @OnCheckedChanged(R.id.checkBox)
    void myCheckChangeCallback(CheckBox checkBox){
    	if (checkBox.isChecked()) {
    		Toast.makeText(getApplicationContext(), "Checkbox is checked", Toast.LENGTH_SHORT).show();	
		} else {
			Toast.makeText(getApplicationContext(), "Checkbox is unchecked", Toast.LENGTH_SHORT).show();
		}
    }
    
    @OnClick({R.id.btnFirst,R.id.btnSecond})
    void myBtnClickCallback(Button button){
    	Toast.makeText(getApplicationContext(), button.getText()+" is clicked", Toast.LENGTH_SHORT).show();
    }
}
