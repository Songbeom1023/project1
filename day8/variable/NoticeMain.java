package day8.variable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NoticeMain extends JFrame implements ActionListener {
    //JPanel -> 단독으로 창 출력 불가능
    //       -> 필요한 버튼들을 독립적인 레이아웃으로 배치할 수 있는 속지의 역할
    JPanel jp_north = new JPanel();
    JButton btn_create = new JButton("입력");
    JButton btn_update = new JButton("수정");
    JButton btn_detail = new JButton("상세");
    JButton btn_delete = new JButton("삭제");
    NoticeSub ns = new NoticeSub();
    //이때 NoticeSub 생성자를 호출하게 된다
    //따라서 NoticeSub 클래스에 생성자를 선언하고 생성자 클래스 내에 메소드를 호출하게 되면,
    //계속 initDisplay 할 필요가 없어져 코드가 짧아지고, 효율적이게 됨!!!!

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
        //"이벤트 소스"와 이벤트 처리를 담당하는 "핸들러 클래스"를 맵핑하기!!!!!!!!!!!!!!!!!!
        //이 경우 이벤트 소스 = JButton을 통해 생성한 btn_create, btn_update, btn_detail, btn_delete
        //핸들러 클래스 = ActionListener
        btn_create.addActionListener(this);
        btn_update.addActionListener(this);
        btn_detail.addActionListener(this);
        btn_delete.addActionListener(this);
    }

    public static void main(String[] args) {
        NoticeMain nm = new NoticeMain();
        nm.initDisplay();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //"call back method"에서 파라미터 자리에 오는 클래스를 깊은 복사(인스턴스화)를 하면 안 됨.
        //-> 내가 정의한 클래스가 아님.
        String command = e.getActionCommand();
        Object obj = e.getSource();

        if ("입력".equals(command)) {
            ns.setTitle(btn_create.getText());
            ns.setVisible(true);
        } else if ("수정".equals(command)) {
            ns.setTitle(btn_update.getText());
            ns.setVisible(true);
        } else if (obj == btn_detail) {
            ns.setTitle(btn_detail.getText());
            ns.setVisible(true);
        } else if (obj == btn_delete) {
            ns.setTitle(btn_delete.getText());
            ns.setVisible(false);
        }
    }
}