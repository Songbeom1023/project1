package day3.variable;

import javax.swing.*;
import java.awt.*;

public class JFrame2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();//인스턴스화
        JLabel label = new JLabel("로그인");
        Font f = new Font("궁서체",Font.BOLD,35);
        label.setForeground(Color.blue);
        label.setFont(f);
        //인스턴스화를 하면 JFrame 이 heap area 에 상주.
        //setSize(), setVisible() 호출 가능
        frame.setSize((int)300.5,300);
        //300.5는 정수가 아닌 실수이므로, 숫자 앞에 int 를 삽입
        frame.add("North",label);
        frame.setVisible(true);
    }
}
