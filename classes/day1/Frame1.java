package classes.day1;
//생성자 활용해보기
//1)생성자에서 사용자 정의 메소드 호출하기
//2)main 메소드에서 사용자 정의 메소드 호출하기
//-> 둘 중에 뭐가 더 좋은 것인가

import javax.swing.*;

public class Frame1 {
    JFrame frame;//선언

    public Frame1(){
        frame = new JFrame("JFrame1");//생성자의 파라미터에 String 을 넣음으로써 setTitle 대신함.
        initDisplay(true);//메소드 호출 -> true라는 값을 isView 로 전달 -> 18번의 파라미터 자리에 true 대입
    }
    public void initDisplay(boolean isView){
        frame.setSize(500,500);
        frame.setVisible(isView);
    }

    public static void main(String[] args) {
        Frame1 frame1 = new Frame1();//-> 생성자 호출 -> 12번으로 이동
    }
}
