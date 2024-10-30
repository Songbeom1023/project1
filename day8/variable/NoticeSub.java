package day8.variable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NoticeSub extends JFrame implements ActionListener {

    JPanel jp_south = new JPanel();
    JPanel jp_center = new JPanel();
    JButton btn_save = new JButton("저장");
    JButton btn_close = new JButton("닫기");
//**********************************************************
    //initDisplay 를  NoticeSub 생성자에서 호출하는 것이 더 효율적!!!!!!!!
    public NoticeSub() {
        initDisplay();
    }

    public void initDisplay() {
        this.setSize(400, 500);
        this.add("Center", jp_center);
        this.add("South", jp_south);
        this.setVisible(false);

        jp_center.setBackground(new Color(111, 159, 207));
        jp_south.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp_south.add(btn_save);
        jp_south.add(btn_close);

        btn_save.addActionListener(this);
        btn_close.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        }
    }