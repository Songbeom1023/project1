package day3.variable;

import javax.swing.*;

public class JFrame1 {
    public static void main(String[] args) {
        //JFrame 은 UI를 담당하는 클래스이므로 UI 에 대한 Default 값을 JVM 이 정의한 대로
        JFrame frame = new JFrame();
        //원시형 변수는 호출하면 값 출력
        //참조형 변수는 호출하면 주소번지 출력
        System.out.println(frame);//frame 변수는 참조형 변수
        System.out.println(frame.toString());
    }
}
