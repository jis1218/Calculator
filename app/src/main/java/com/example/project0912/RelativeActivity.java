package com.example.project0912;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//Constraint와 같은 구조
//어느 위젯으로부터 얼마정도 떨어져 있다로 표현할 수가 있음
public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
    }
}
