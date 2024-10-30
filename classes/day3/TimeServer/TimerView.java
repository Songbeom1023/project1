package classes.day3.TimeServer;

import javax.swing.*;
import java.awt.*;

public class TimerView extends JFrame {
    JLabel jlb_timer = new JLabel("현재 시간", JLabel.CENTER);
    Font f = new Font("굴림체",Font.BOLD,30);

    public TimerView() {
        initDisplay();
    }

    public void initDisplay() {
        jlb_timer.setFont(f);
        this.setSize(400,200);
        this.setVisible(true);
        this.add("Center", jlb_timer);
        //아래 코드에 대해서 리뷰하기
        //생성자 파라미터에 this 사용하는 경우 vs 다른 클래스를 사용하는 경우

        TimeClient1 tc1 = new TimeClient1(jlb_timer);
        tc1.start();
    }
    public static void main(String[] args) {
        new TimerView();
    }
}
