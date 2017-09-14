#안드로이드 화면과 레이아웃(Layout)에 관한 공부 및 레이아웃을 이용해 계산기 만들기

## 0. 안드로이드 화면 구조

##### 안드로이드의 화면 구조는 다음과 같다.
##### > App(어플) > Activity(화면한개단위) > Fragment(화면 조각) > 레이아웃(뷰그룹 혹은 컨테이너) > 위젯(뷰)
##### 안드로이드 스튜디오를 실행하면 가장 먼저 뜨는 MainActivity Class는 AppComatActivity를 상속받아 구현되는데 이 AppComatActivity 또한 Activity라는 클래스를 상속받는다. 이 Activity 클래스는 앱의 화면을 띄우게 하는 각종 메서드가 들어 있으므로 한 화면을 띄우기 위해서는 Activiy 클래스를 상속받아야 한다.

<br>
##### 버튼에 onClickListener를 붙여주는 방법은 여러가지가 있다.
##### 1.
```java
Button button = (Button) findViewById(R.id.btn);

button.setOnClickListner(new View.onClickListener){
//실행할 코드  
}
```
##### 2.
```java
Button button = (Button) findViewById(R.id.btn);

onClickListener listner = new OnClickListener(){
  @override
  public void onClick(View view){
    //실행할 코드
  }
}
button.setOnClickListner(listner);
```
##### 3.
```java
public class BtnClick extends AppComatActivity implements View.OnClickListener{

Button button = (Button) findViewById(R.id.btn);
button.setOnClickListner(this);  

@override
public onClick(View view){
  //실행할 코드
}
}
```
##### 4.
```java
public onClick(View view){ //xml에서 onClick란에 실행할 함수명 적어준다.
  //실행할 코드
}
```
<br>

## 1. 레이아웃 종류

### 1.1 Constraint Layout
##### 안드로이드에서 밀고 있는 default한 레이아웃이다. Relative 레이아웃과 비슷하며 객체 간 거리를 화살표 이음을 통해 위치를 정해주는 구조이다. 아직까지는 쓰기가 많이 불편하다.

### 1.2 Linear Layout
##### 내가 가장 많이 쓰는 레이아웃이며 수평 또는 수직으로 객체를 놔둘 수 있다.

### 1.3 Relative Layout
##### Constraint Layout과 비슷하며 객체와 객체 사이가 얼마나 떨어져있는지, 상대적으로 어느 위치에 있는지를 표현해줌으로 위치를 정할 수 있다.

### 1.4 Grid Layout
##### 격자간의 병합처리를 쉽게 할 수 있다. 하지만 화면 비율에 딱 맞출 수 없다는 것이 단점이다.

### 1.5 Frame Layout
##### 객체를 중첩하게 나타낼 수 있어 복잡한 화면처리에 적합하다. 또한 속도가 가장 빠른 Layout이다.

## 2. 순서대로 계산해주는 계산기

##### 로직은 다음과 같다.
##### > 1. 숫자를 누르고
```java
switch(view.getId()) {
                case R.id.btn1:
                    inputDisplay.append("1");
                    topDisplay.append("1");
                    break;
                  }
                  ```
##### > 2. 부호를 누르면 임시 변수에 숫자 저장됨
```java
switch(view.getId()){
               case R.id.btnPlus:
                   fourArithmetic(index, "+"); //숫자 저장하는 함수와 부호를 화면에 넣어주는 메서드가 있음
                   index = 1; // 다음에 부호를 눌렀을 때 그 전 숫자를 어떻게 계산할 것인지 알려주는 index
                   break;
```

##### > 3. 다음 숫자를 누르고
##### > 4. 부호를 누르면 임시 변수와 3번 숫자가 2번의 부호에 따라 계산됨
<br>
##### 이 계산기의 장점은 순서대로 계산한 값을 바로 확인할 수 있다는 점, 단점은 사칙연산 규칙대로 계산이 안된다는 점
