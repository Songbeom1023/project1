package day7.variable;

import javax.swing.*;

public class JFrame1 {
    JFrame frame = null;

    public void initDisplay(){
        frame = new JFrame();
        frame.setSize(400,500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame1 f1 = new JFrame1();
        f1.initDisplay();
    }
}
