package day5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameMain extends JFrame implements ActionListener {
    JDialogMain jdmain = new JDialogMain(this);
    JPanel jp_north = new JPanel();
    JButton btn_ins = new JButton("입력");
    JButton btn_upd = new JButton("수정");
    JButton btn_det = new JButton("상세보기");
    public JFrameMain() {
        initDisplay();
    }
    public void initDisplay() {
        btn_ins.addActionListener(this);
        btn_upd.addActionListener(this);
        btn_det.addActionListener(this);
        jp_north.setLayout(new FlowLayout(FlowLayout.LEFT));
        jp_north.add(btn_ins);
        jp_north.add(btn_upd);
        jp_north.add(btn_det);
        this.add("North", jp_north);
        this.setSize(500, 400);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new JFrameMain();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == btn_ins){
            jdmain.set(btn_ins.getText(), true, true);
        }else if(obj == btn_upd){
            jdmain.set(btn_upd.getText(), true, true);
        }else if(obj == btn_det){
            jdmain.set(btn_det.getText(), true, false);
        }
        //입력버튼이 눌리면
        //수정하고 싶을 때
        //상세보기
    }
}
