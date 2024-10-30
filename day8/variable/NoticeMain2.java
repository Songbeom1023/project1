package day8.variable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NoticeMain2 extends JFrame implements ActionListener {
    //JPanel -> 단독으로 창 출력 불가능
    //       -> 필요한 버튼들을 독립적인 레이아웃으로 배치할 수 있는 속지의 역할
    JPanel jp_north = new JPanel();
    JButton btn_create = new JButton("입력");
    JButton btn_update = new JButton("수정");
    JButton btn_detail = new JButton("상세");
    JButton btn_delete = new JButton("삭제");

    public void initDisplay() {
        this.setTitle("공지사항 -Main");
        this.setSize(600, 500);
        this.setVisible(true);
        this.add("North", jp_north);

        jp_north.setLayout(new FlowLayout(FlowLayout.LEFT));
        jp_north.add(btn_create);
        jp_north.add(btn_update);
        jp_north.add(btn_detail);
        jp_north.add(btn_delete);
//*********************************
        //이벤트 소스와 이벤트 처리를 담당하는 핸들러 클래스를 맵핑하기!!!!!!!!!!!!!!!!!!
        btn_create.addActionListener(this);
        btn_update.addActionListener(this);
        btn_detail.addActionListener(this);
        btn_delete.addActionListener(this);
    }

    public static void main(String[] args) {
        NoticeMain2 nm = new NoticeMain2();
        nm.initDisplay();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //"call back method"에서 파라미터 자리에 오는 클래스를 깊은 복사(인스턴스화)를 하면 안 됨.
        //-> 내가 정의한 클래스가 아님.
        String command = e.getActionCommand();
        Object obj = e.getSource();
        /////////////////////////////////
        //인스턴스화를 아래 위치 즉, 메소드 내에 하게 되면 인스턴스화를 계속하게 되는 것.
        //------> 아래 인스턴스화를 클래스 선언부에 해서 전역변수로 만드는 것이 훨씬 효율적이다!!!!!!!!!!!!!!!
        NoticeSub2 ns = new NoticeSub2();
        System.out.println("actionPerformed : " + ns);
        if ("입력".equals(command)) {
            ns.frame.setTitle(btn_create.getText());
            ns.frame.setVisible(true);
        } else if ("수정".equals(command)) {
            ns.frame.setTitle(btn_update.getText());
            ns.frame.setVisible(true);
        } else if (obj == btn_detail) {
            ns.frame.setTitle(btn_detail.getText());
            ns.frame.setVisible(true);
        } else if (obj == btn_delete) {
            ns.frame.setTitle(btn_delete.getText());
            ns.frame.setVisible(false);
        }
    }
}