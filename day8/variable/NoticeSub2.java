package day8.variable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NoticeSub2  {

    JFrame frame = new JFrame();
    JPanel jp_south = new JPanel();
    JPanel jp_center = new JPanel();
    JButton btn_save = new JButton("저장");
    JButton btn_close = new JButton("닫기");
//**********************************************************
    //initDisplay 를 여기서 설정하는 것이 더 효율적!!!!!!!!
    public NoticeSub2() {
        initDisplay();
    }

    public void initDisplay() {
        frame.setSize(400, 500);
        frame.add("Center", jp_center);
        frame.add("South", jp_south);
        frame.setVisible(false);

        jp_center.setBackground(new Color(111, 159, 207));
        jp_south.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp_south.add(btn_save);
        jp_south.add(btn_close);

       // btn_save.addActionListener(ns2);
       // btn_close.addActionListener(ns2);
    }
    //@Override
    //public void actionPerformed(ActionEvent e) {
  //this.dispose();
        }
