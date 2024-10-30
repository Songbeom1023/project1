package classes.day3;

import javax.swing.*;
import java.awt.*;

public class JFrameArray2 extends JFrame {
    JButton [] btns = new JButton[3];
    String[] btn_labels = {"Button 1","Button 2","Button 3"};

    public void initDisplay(){
        this.setLayout(new GridLayout(3,1));
        //btns.length == btn_labels.length 여야 아래 for 안 인스턴스화 가능
        for (int i = 0; i < btns.length; i++) {
            btns[i] = new JButton(btn_labels[i]);
            this.add(btns[i]);
        }
        this.setSize(500,300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        JFrameArray2 jfa = new JFrameArray2();
        jfa.initDisplay();
    }
}
