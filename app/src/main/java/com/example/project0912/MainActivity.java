package com.example.project0912;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

// 안드로이드 화면 구조
// App(어플) > Activity(화면한개단위) > Fragment(화면 조각) > 레이아웃(뷰그룹 혹은 컨테이너) > 위젯(뷰)


public class MainActivity extends AppCompatActivity {
                                    //Activity 기반 클래스를 상속받아서 구성된다.

    TextView txt = null;
    int toggle = 0;

    Button btnFrame, btnLinear, btnRelative, btnGrid, btnCalculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 0. 레이아웃 xml 파일을 메모리에 로드
        setContentView(R.layout.activity_main);

//        //View view = findViewById(R.id.btn); //AppCompatActivity에 정의되어 있는 함수, return type이 view
//        //하지만 view는 눌리지가 않으므로
//
//        // 1. 내가 사용할 개체들을 가져옴
//        View view = (Button) findViewById(R.id.btnlinear);//
//        txt = (TextView) findViewById(R.id.textView);//
//        // 2. 이벤트가 필요할 경우 리스너를 달아준다.//
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { //view 함수는 안드로이드 시스템이 호출해주는 것, view는 버튼 객체를 뜻함. 이게 콜백, 인터페이스를 써서 콜백형태로 구현
//
//                toggle++;
//                if(toggle%2==0){
//                    txt.setText("Hello android");
//                }else{
//                    txt.setText("show me the money");
//                }
//            }
//        });
//
        btnFrame = (Button) findViewById(R.id.btnframe);
        btnLinear = (Button) findViewById(R.id.btnlinear);
        btnGrid = (Button) findViewById(R.id.btngrid);
        btnRelative = (Button) findViewById(R.id.btnrelative);
        btnCalculator = (Button) findViewById(R.id.btnCalculator);

        btnFrame.setOnClickListener(onClickListener);
        btnLinear.setOnClickListener(onClickListener);
        btnGrid.setOnClickListener(onClickListener);
        btnRelative.setOnClickListener(onClickListener);
        btnCalculator.setOnClickListener(onClickListener);

        //findViewById(R.id.btnframe).setOnClickListener(onClickListener); // 이렇게 할 수도 있다.

        //activity를 실행할 때는 시스템에 어떤 메세지를 날려주면 된다. 그게 Intent
        //intent의 major component(액티비티, 서비스, 브로드캐스트 리시버, 콘텐트 프로바이더)
        // 실행방법은 1. 인텐트(시스템에 전달되는 메시지 객체) 생성
        // 인텐트에 Context라는 시스템 자원을 넘겨줘야 한다

    }

    View.OnClickListener onClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {

            Intent intent = null;

            switch(view.getId()){
                case R.id.btnframe :
                    intent = new Intent(MainActivity.this, FrameActivity.class);
                    break;
                case R.id.btnlinear :
                    intent = new Intent(MainActivity.this, LinearActivity.class);
                    break;
                case R.id.btngrid :
                    intent = new Intent(MainActivity.this, GridActivity.class);
                    break;
                case R.id.btnrelative :
                    intent = new Intent(MainActivity.this, RelativeActivity.class);
                    break;
                case R.id.btnCalculator :
                    intent = new Intent(MainActivity.this, CalculatorActivity.class);
            }
            startActivity(intent);
        }
    };
}
