package tlak.step1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderLayout1 extends JFrame implements ActionListener {
    JButton jbtn_north = new JButton("North");
    JButton jbtn_south = new JButton("South");
    JButton jbtn_west = new JButton("West");
    JButton jbtn_east = new JButton("East");
    JButton jbtn_center = new JButton("Center");
    JPanel jp = new JPanel();

    //화면 출력부
    public void initDisplay() {
        System.out.println("initDisplay 호출 성공");
        //this -> JFrame 을 상속 받아서 따로 인스턴스화하지 않아도 됨
        this.add("Center", jp);
        //jp.setBackground(new Color(8, 40, 196));
        jp.setLayout(new BorderLayout());
        //**************************************************
        jp.add("North", jbtn_north);
        jp.add("South", jbtn_south);
        jp.add("West", jbtn_west);
        jp.add("East", jbtn_east);
        jp.add("Center", jbtn_center);
        this.setSize(400, 300);
        this.setVisible(true);
        //아래 문장이 있어야 이벤트가 감지되었을 때 ActionPerformed 수행.
        jbtn_north.addActionListener(this);
        jbtn_west.addActionListener(this);
        jbtn_east.addActionListener(this);
        jbtn_south.addActionListener(this);
        jbtn_center.addActionListener(this);
    }

    public static void main(String[] args) {
        BorderLayout1 bl = new BorderLayout1();
        bl.initDisplay();
    }

    @Override
/*
재정의
- 부모 클래스에서 정의된 원본 메소드가 존재하고, 자식 클래스가 그 원본 메소드를 "재정의"하여 새로운 동작을 추가하거나 변경할 수 있다
- call back method
 */
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        JButton btn = (JButton) obj;
        if (jbtn_north == btn) {
            System.out.println("북쪽 버튼 누름");
        } else if (jbtn_south == btn) {
            System.out.println("남쪽 버튼 누름");
        } else if (jbtn_west == btn) {
            System.out.println("서쪽 버튼 누름");
        } else if (jbtn_east == btn) {
            System.out.println("동쪽 버튼 누름");
        } else if (jbtn_center == btn) {
            System.out.println("중앙 버튼 누름");
        }
    }
}
