package com.example.demo_extra;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements OnClickListener {

	TextView tvLarge;
	TextView tvMedium;
	TextView tvSmall;
	CheckBox checkBox;
	ToggleButton toggleButton;
	Button btnFirst;
	Button btnSecond;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tvLarge = (TextView) findViewById(R.id.tvLarge);
		tvMedium = (TextView) findViewById(R.id.tvMedium);
		tvSmall = (TextView) findViewById(R.id.tvSmall);
		checkBox = (CheckBox) findViewById(R.id.checkBox);
		toggleButton = (ToggleButton) findViewById(R.id.toggelButton);
		btnFirst = (Button) findViewById(R.id.btnFirst);
		btnSecond = (Button) findViewById(R.id.btnSecond);

		tvLarge.setText("My custom large text");
		tvMedium.setText("My custom medium text");
		tvSmall.setText("My custom small text");

		checkBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				if (isChecked) {
					Toast.makeText(getApplicationContext(),
							"Checkbox is checked", Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(getApplicationContext(),
							"Checkbox is unchecked", Toast.LENGTH_SHORT).show();
				}
			}
		});

		toggleButton.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				if (isChecked) {
					Toast.makeText(getApplicationContext(),
							"Toggle button is ON", Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(getApplicationContext(),
							"Toggle button is OFF", Toast.LENGTH_SHORT).show();
				}
			}
		});

		btnFirst.setOnClickListener(this);
		btnSecond.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Button clickedButton = (Button)v;
		Toast.makeText(getApplicationContext(), clickedButton.getText()+" is clicked", Toast.LENGTH_SHORT).show();
	}
}
