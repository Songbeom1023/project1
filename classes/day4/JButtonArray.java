package classes.day4;

import javax.swing.*;

public class JButtonArray {
    public static void main(String[] args) {
        JButton[]btns = new JButton[3];
        btns[0] = new JButton("Button 1");
        btns[1] = new JButton();
        btns[2] = new JButton("Button 3");
        for (int i = 0; i < btns.length; i++) {
            System.out.println(btns[i].getText());
        }
    }
}
