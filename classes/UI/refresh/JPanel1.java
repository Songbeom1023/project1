package classes.UI.refresh;

import javax.swing.*;
import java.awt.*;
//JPanel -> 윈도우창 제공하지 않음.
//
public class JPanel1 extends JPanel{

    public JPanel1() {
        initDisplay();
    }

    public void initDisplay() {
        this.setSize(400,300);
        this.setVisible(true);
        this.setBackground(Color.blue);
    }

    public static void main(String[] args) {
        new JPanel1();
    }
}

