package com.example.project0912;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//게임에 사용되며 속도가 가장 빠름
//layout margin과 padding - margin은 밖으로 작용을 함
public class FrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
    }
}
