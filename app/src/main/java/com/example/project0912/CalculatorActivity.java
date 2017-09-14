package com.example.project0912;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    //Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnC, btnEqual, btnPlus, btnMinus, btnTime, btnDivide;
    TextView topDisplay, inputDisplay;
    double temp = 0;
    int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        topDisplay = (TextView) findViewById(R.id.textView);
        inputDisplay = (TextView) findViewById(R.id.inputDisplay);


        findViewById(R.id.btn0).setOnClickListener(onClickListener);
        findViewById(R.id.btn1).setOnClickListener(onClickListener);
        findViewById(R.id.btn2).setOnClickListener(onClickListener);
        findViewById(R.id.btn3).setOnClickListener(onClickListener);
        findViewById(R.id.btn4).setOnClickListener(onClickListener);
        findViewById(R.id.btn5).setOnClickListener(onClickListener);
        findViewById(R.id.btn6).setOnClickListener(onClickListener);
        findViewById(R.id.btn7).setOnClickListener(onClickListener);
        findViewById(R.id.btn8).setOnClickListener(onClickListener);
        findViewById(R.id.btn9).setOnClickListener(onClickListener);
        findViewById(R.id.btnPlus).setOnClickListener(onClickListener);
        findViewById(R.id.btnMinus).setOnClickListener(onClickListener);
        findViewById(R.id.btnTime).setOnClickListener(onClickListener);
        findViewById(R.id.btnDivide).setOnClickListener(onClickListener);
        findViewById(R.id.btnC).setOnClickListener(onClickListener);
        findViewById(R.id.btnEqual).setOnClickListener(onClickListener);



    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch(view.getId()) {
                case R.id.btn1:
                    checkIfCalculate();
                    inputDisplay.append("1");
                    topDisplay.append("1");
                    break;
                case R.id.btn2:
                    checkIfCalculate();
                    inputDisplay.append("2");
                    topDisplay.append("2");
                    break;
                case R.id.btn3:
                    checkIfCalculate();
                    inputDisplay.append("3");
                    topDisplay.append("3");
                    break;
                case R.id.btn4:
                    checkIfCalculate();
                    inputDisplay.append("4");
                    topDisplay.append("4");
                    break;
                case R.id.btn5:
                    checkIfCalculate();
                    inputDisplay.append("5");
                    topDisplay.append("5");
                    break;
                case R.id.btn6:
                    checkIfCalculate();
                    inputDisplay.append("6");
                    topDisplay.append("6");
                    break;
                case R.id.btn7:
                    checkIfCalculate();
                    inputDisplay.append("7");
                    topDisplay.append("7");
                    break;
                case R.id.btn8:
                    checkIfCalculate();
                    inputDisplay.append("8");
                    topDisplay.append("8");
                    break;
                case R.id.btn9:
                    checkIfCalculate();
                    inputDisplay.append("9");
                    topDisplay.append("9");
                    break;
                case R.id.btn0:
                    if (!inputDisplay.getText().toString().equals("")) {
                        inputDisplay.append("0");
                        topDisplay.append("0");
                    }
                    break;
                case R.id.btnC:

                    topDisplay.setText("");
                    inputDisplay.setText("");
                    index=0;
                    temp = 0;
                    break;
            }
                switch(view.getId()){
                case R.id.btnPlus:
                    fourArithmetic(index, "+");
                    index = 1;
                    break;
                case R.id.btnMinus:
                    fourArithmetic(index, "-");
                    index = 2;
                    break;
                case R.id.btnTime:
                    fourArithmetic(index, "X");
                    index = 3;

                    break;
                case R.id.btnDivide:
                    fourArithmetic(index, "/");
                    index = 4;
                    break;
                case R.id.btnEqual:

                    topDisplay.setText("");
                    inputDisplay.setText(String.valueOf(calculate(index, temp)));
                    index = 5;

                    break;
            }
        }
    };

    public double calculate(int index, double temp){ //temp는 이미 계산된 값
        double value = Double.parseDouble(inputDisplay.getText().toString()); //화면에 뜬 값
        inputDisplay.setText("");
        switch(index){
            case 1:
                temp = temp + value;
                return temp;
            case 2:
                temp = temp-value;
                return temp;
            case 3:
                temp = temp*value;
                return temp;
            case 4:
                temp = temp/value;
                return temp;
        }

        return 0;
    }


    public void checkIfCalculate(){
        if(index==5){
            inputDisplay.setText("");
            inputDisplay.setText("");
            temp = 0;
            index = 0;
        }
    }

    public void fourArithmetic(int index, String four){
        if(index==0) {
            topDisplay.append(" " + four + " ");
            temp = Double.parseDouble(inputDisplay.getText().toString());

        }else if(index==5)
            {
            topDisplay.append(inputDisplay.getText().toString() + " " + four + " ");
            temp = Double.parseDouble(inputDisplay.getText().toString());
            }else{
            topDisplay.append(" " + four + " ");
            temp = calculate(index, temp);
            }

        inputDisplay.setText("");

    }
}
