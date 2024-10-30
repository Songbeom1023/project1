package classes.day3;

import javax.swing.*;
import java.awt.*;

public class JFrameArray1 extends JFrame {
    JButton [] btns = new JButton[3];
    String[] btn_labels = {"Button 1","Button 2","Button 3"};

    public void initDisplay(){
        btns[0] = new JButton("Button 1");
        btns[1] = new JButton("Button 2");
        btns[2] = new JButton("Button 3");

        this.setSize(500,300);
        this.setVisible(true);
        this.setLayout(new GridLayout(3,1));
        this.add("North", btns[0]);
        this.add("South", btns[1]);
        this.add("East", btns[2]);

    }

    public static void main(String[] args) {
        JFrameArray1 jfa = new JFrameArray1();
        jfa.initDisplay();
    }
}
