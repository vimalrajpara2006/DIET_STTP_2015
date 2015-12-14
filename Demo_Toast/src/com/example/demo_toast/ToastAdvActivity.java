package com.example.demo_toast;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToastAdvActivity extends Activity {

	Toast myToast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_toast_adv);

		configToast();

	}

	void configToast() {
		Context context = this;
		CharSequence text = "Hello toast!";
		int duration = Toast.LENGTH_SHORT;

		myToast = Toast.makeText(context, text, duration);
	}

	public void clickSecondBtn(View view) {
		myToast.setText(((Button) view).getText() + " clicked");
		myToast.show();
	}

	public void clickFirstBtn(View view) {
		myToast.setText(((Button) view).getText() + " clicked");
		myToast.show();
	}

}
