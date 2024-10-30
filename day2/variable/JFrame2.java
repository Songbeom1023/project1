package day2.variable;

import javax.swing.*;

public class JFrame2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        String title = "카카오톡";
        int width = 400;
        int height = 500;
        jFrame.setTitle(title);
        jFrame.setSize(width, height);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
