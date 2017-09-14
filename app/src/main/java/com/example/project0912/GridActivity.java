package com.example.project0912;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//GridLayout의 단점은 화면상에 비율에 맞게 맞출 수가 없음, 하지만 격자간의 병합처리를 쉽게 할 수 있음
public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
    }
}
