package in.au.darshan.sttp.demo_calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView txtResult; // Reference to EditText of result
    private int result = 0;     // Result of computation
    private String inStr = "0"; // Current input string
    // Previous operator: '+', '-', '*', '/', '=' or ' ' (no operator)
    private char lastOperator = ' ';
  
    @Override
    public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
  
       // Retrieve a reference to the EditText field for displaying the result.
       txtResult = (TextView) findViewById(R.id.txtResult);
       txtResult.setText("0");
  
       // Register listener (this class) for all the buttons
       BtnListener listener = new BtnListener();
       ((Button) findViewById(R.id.btnNum0)).setOnClickListener(listener);
       ((Button) findViewById(R.id.btnNum1)).setOnClickListener(listener);
       ((Button) findViewById(R.id.btnNum2)).setOnClickListener(listener);
       ((Button) findViewById(R.id.btnNum3)).setOnClickListener(listener);
       ((Button) findViewById(R.id.btnNum4)).setOnClickListener(listener);
       ((Button) findViewById(R.id.btnNum5)).setOnClickListener(listener);
       ((Button) findViewById(R.id.btnNum6)).setOnClickListener(listener);
       ((Button) findViewById(R.id.btnNum7)).setOnClickListener(listener);
       ((Button) findViewById(R.id.btnNum8)).setOnClickListener(listener);
       ((Button) findViewById(R.id.btnNum9)).setOnClickListener(listener);
       ((Button) findViewById(R.id.btnAdd)).setOnClickListener(listener);
       ((Button) findViewById(R.id.btnSub)).setOnClickListener(listener);
       ((Button) findViewById(R.id.btnMul)).setOnClickListener(listener);
       ((Button) findViewById(R.id.btnDiv)).setOnClickListener(listener);
       ((Button) findViewById(R.id.btnClear)).setOnClickListener(listener);
       ((Button) findViewById(R.id.btnEqual)).setOnClickListener(listener);
    }
  
    private class BtnListener implements OnClickListener {
       // On-click event handler for all the buttons
       @Override
       public void onClick(View view) {
          switch (view.getId()) {
          // Number buttons: '0' to '9'
          case R.id.btnNum0:
          case R.id.btnNum1:
          case R.id.btnNum2:
          case R.id.btnNum3:
          case R.id.btnNum4:
          case R.id.btnNum5:
          case R.id.btnNum6:
          case R.id.btnNum7:
          case R.id.btnNum8:
          case R.id.btnNum9:
             String inDigit = ((Button) view).getText().toString();
             if (inStr.equals("0")) {
                inStr = inDigit; // no leading zero
             } else {
                inStr += inDigit; // accumulate input digit
             }
             txtResult.setText(inStr);
             // Clear buffer if last operator is '='
             if (lastOperator == '=') {
                result = 0;
                lastOperator = ' ';
             }
             break;
  
          // Operator buttons: '+', '-', '*', '/' and '='
          case R.id.btnAdd:
             compute();
             lastOperator = '+';
             break;
          case R.id.btnSub:
             compute();
             lastOperator = '-';
             break;
          case R.id.btnMul:
             compute();
             lastOperator = '*';
             break;
          case R.id.btnDiv:
             compute();
             lastOperator = '/';
             break;
          case R.id.btnEqual:
             compute();
             lastOperator = '=';
             break;
  
          // Clear button
          case R.id.btnClear:
             result = 0;
             inStr = "0";
             lastOperator = ' ';
             txtResult.setText("0");
             break;
          }
       }
  
       // User pushes '+', '-', '*', '/' or '=' button.
       // Perform computation on the previous result and the current input number,
       // based on the previous operator.
       private void compute() {
          int inNum = Integer.parseInt(inStr);
          inStr = "0";
          if (lastOperator == ' ') {
             result = inNum;
          } else if (lastOperator == '+') {
             result += inNum;
          } else if (lastOperator == '-') {
             result -= inNum;
          } else if (lastOperator == '*') {
             result *= inNum;
          } else if (lastOperator == '/') {
             result /= inNum;
          } else if (lastOperator == '=') {
             // Keep the result for the next operation
          }
          txtResult.setText(String.valueOf(result));
       }
    }
}
