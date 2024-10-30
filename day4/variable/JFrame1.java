package day4.variable;

import javax.swing.*;

public class JFrame1 {
    //선언부
    JFrame frame = null;

    ///왜 이렇게 null을 주는가???

    //생성자
    public JFrame1(){
        frame = new JFrame();
    }
    //화면처리부
    public void initDisplay(){
        frame.setTitle("윈도우가 제공하는 창");
        frame.setSize(500,300);
        frame.setVisible(true);
    }
    //메인메소드
    public static void main(String[] args) {
        JFrame1 jf1 = new JFrame1();
        jf1.initDisplay();
    }
}
