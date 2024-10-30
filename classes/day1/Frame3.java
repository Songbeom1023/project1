package classes.day1;

import javax.swing.*;

public class Frame3 {
    JFrame frame;

    public Frame3(){}

    public Frame3(String title){
        //파라미터가 있는 생성자가 있으면, 디폴트 생성자를 제공하지 않는다.
        frame = new JFrame(title);
        initDisplay();
    }
    public void initDisplay(){
        frame.setTitle("Frame3");
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
     Frame3 f3 = new Frame3();
    }
}
