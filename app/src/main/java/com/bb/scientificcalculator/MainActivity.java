package com.bb.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView userInputTextView;
    private Double valueA = 0.0;
    private Double valueB = 0.0;

    private String operator = "";
    private boolean isOpActivated = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInputTextView = findViewById(R.id.user_input_textview);
    }

    public void calcClick(View view) {
        String currentVal = userInputTextView.getText().toString().trim();
        switch (view.getId()) {
            case R.id.ac_button:
                valueA = 0.0;
                valueB = 0.0;
                userInputTextView.setText("0");
                isOpActivated = false;
                break;
            case R.id.zero_button:
                if (currentVal == "0")
                    currentVal = "0";
                else
                    currentVal += "0";
                userInputTextView.setText(currentVal);
                break;
            case R.id.one_button:
                if (currentVal == "0" || isOpActivated) {
                    isOpActivated = false;
                    currentVal = "1";
                } else
                    currentVal += "1";
                userInputTextView.setText(currentVal);
                break;
            case R.id.two_button:
                if (currentVal == "0" || isOpActivated) {
                    isOpActivated = false;
                    currentVal = "2";
                } else
                    currentVal += "2";
                userInputTextView.setText(currentVal);
                break;
            case R.id.three_button:
                if (currentVal == "0" || isOpActivated){
                    isOpActivated = false;
                    currentVal = "3";
                }
                else
                    currentVal += "3";
                userInputTextView.setText(currentVal);
                break;
            case R.id.four_button:
                if (currentVal == "0"  || isOpActivated) {
                    isOpActivated = false;
                    currentVal = "4";
                }
                else
                    currentVal += "4";
                userInputTextView.setText(currentVal);
                break;
            case R.id.five_button:
                if (currentVal == "0"  || isOpActivated) {
                    isOpActivated = false;
                    currentVal = "5";
                }
                else
                    currentVal += "5";
                userInputTextView.setText(currentVal);
                break;
            case R.id.six_button:
                if (currentVal == "0"  || isOpActivated) {
                    isOpActivated = false;
                    currentVal = "6";
                }
                else
                    currentVal += "6";
                userInputTextView.setText(currentVal);
                break;
            case R.id.seven_button:
                if (currentVal == "0"  || isOpActivated) {
                    isOpActivated = false;
                    currentVal = "7";
                }
                else
                    currentVal += "7";
                userInputTextView.setText(currentVal);
                break;
            case R.id.eight_button:
                if (currentVal == "0" || isOpActivated) {
                    isOpActivated = false;
                    currentVal = "8";
                }
                else
                    currentVal += "8";
                userInputTextView.setText(currentVal);
                break;
            case R.id.nine_button:
                if (currentVal == "0" || isOpActivated) {
                    isOpActivated = false;
                    currentVal = "9";
                }
                else
                    currentVal += "9";
                userInputTextView.setText(currentVal);
                break;
            case R.id.add_button:
                isOpActivated = true;
                operator = "addition";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                break;
            case R.id.modulus_button:
                isOpActivated = true;
                operator = "modulus";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                break;
            case R.id.subtract_button:
                isOpActivated = true;
                operator = "substraction";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                break;
            case R.id.division_button:
                isOpActivated = true;
                operator = "division";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                break;
            case R.id.multiply_button:
                isOpActivated = true;
                operator = "multiplication";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                break;
            case R.id.period_button:
                break;
            case R.id.neg_pos_button:
                isOpActivated = true;
                operator = "neg_pos";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.equals_button:
                valueB = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.square_button:
                operator = "square";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.cube_button:
                operator = "cube";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.xy_button:
                operator = "x_y_exponent";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.e_x_button:
                operator = "e_x_exponent";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.ten_button:
                operator = "ten_exponent";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.on_x_button:
                operator = "on_x";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.square_root_button:
                operator = "square_root";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.cubic_root_button:
                operator = "cubic_root";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.nth_root_button:
                operator = "nth_root";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
            case R.id.ln_button:
                operator = "ln";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.log10_button:
                operator = "log10";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.factorial_button:
                operator = "factorial";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.sin_button:
                operator = "sin";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.cos_button:
                operator = "cos";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                operation();
                break;
            case R.id.e_button:
                operator = "e";
                operation();
                break;
            case R.id.ee_button:
                operator = "ee";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                break;
            case R.id.rad_button:
                operator = "rad";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                break;
            case R.id.sinh_button:
                operator = "sinh";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                break;
            case R.id.cosh_button:
                operator = "cosh";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                break;
            case R.id.tanh_button:
                operator = "tanh";
                valueA = Double.parseDouble(userInputTextView.getText().toString().trim());
                break;
            case R.id.pi_button:
                operator = "pi";
                operation();
                break;
            case R.id.rand_button:
                operator = "rand";
                break;
        }
    }

    public void operation() {
        Double answer = Double.parseDouble(userInputTextView.getText().toString().trim());
        switch (operator) {
            case "addition":
                answer = (valueA + valueB);
                isOpActivated = true;
                break;
            case "substraction":
                answer = (valueA - valueB);
                isOpActivated = true;
                break;
            case "division":
                answer = (valueA / valueB);
                isOpActivated = true;
                break;
            case "multiplication":
                answer = (valueA * valueB);
                isOpActivated = true;
                break;
            case "neg_pos":
                answer = (valueA * -1.0);
                isOpActivated = true;
                break;
            case "modulus":
                answer = (valueA % valueB);
                isOpActivated = true;
                break;
            case "square":
                answer = Math.pow(valueA, 2.0);
                isOpActivated = true;
                break;
            case "cube":
                answer = Math.pow(valueA, 3.0);
                isOpActivated = true;
                break;
            case "x_y_exponent":
                answer = Math.pow(valueA, valueB);
                isOpActivated = true;
                break;
            case "e_x_exponent":
                answer = Math.exp(valueA);
                isOpActivated = true;
                break;
            case "ten_exponent":
                answer = Math.pow(10.0, valueA);
                isOpActivated = true;
                break;
            case "on_x":
                answer = 1.0 / valueA;
                isOpActivated = true;
                break;
            case "square_root":
                answer = Math.sqrt(valueA);
                isOpActivated = true;
                break;
            case "cubic_root":
                answer = Math.cbrt(valueA);
                isOpActivated = true;
                break;
            case "nth_root": // https://www.geeksforgeeks.org/n-th-root-number/
                double xPre = Math.random() % 10;
                double eps = 0.001;
                double delX = 2147483647;
                double xK = 0.0;
                while (delX > eps)
                {
                    xK = ((valueA - 1.0) * xPre + (double)valueB / Math.pow(xPre, valueA - 1)) / (double)valueB;
                    delX = Math.abs(xK - xPre);
                    xPre = xK;
                }
                answer = xK;
                isOpActivated = true;
                break;
            case "ln":
                answer = Math.log(valueA);
                isOpActivated = true;
                break;
            case "log10":
                answer = Math.log10(valueA);
                isOpActivated = true;
                break;
            case "factorial":
                double fact = 1.0;
                for (int i = 2; i <= valueA; i++){
                    fact = fact * i;
                }
                answer = fact;
                isOpActivated = true;
                break;
            case "sin":
                answer = Math.sin(valueA);
                isOpActivated = true;
                break;
            case "cos":
                answer = Math.cos(valueA);
                isOpActivated = true;
                break;
            case "tan":
                answer = Math.tan(valueA);
                isOpActivated = true;
                break;
            case "e":
                answer = Math.exp(1);
                isOpActivated = true;
                break;
            case "ee":
                userInputTextView.setText( "" + Double.toString(valueA) + "X10" + Double.toString(valueB));
                isOpActivated = true;
                break;
            case "rad":
                answer = Math.toRadians(valueA);
                isOpActivated = true;
                break;
            case "sinh":
                answer = Math.sinh(valueA);
                isOpActivated = true;
                break;
            case "cosh":
                answer = Math.cosh(valueA);
                isOpActivated = true;
                break;
            case "tanh":
                answer = Math.tanh(valueA);
                isOpActivated = true;
                break;
            case "pi":
                answer = Math.PI;
                isOpActivated = true;
                break;
            case "rand":
                answer = Math.random();
                isOpActivated = true;
                break;
        }
        userInputTextView.setText("" + answer);
    }
}
