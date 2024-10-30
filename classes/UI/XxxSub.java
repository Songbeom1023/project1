package classes.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XxxSub extends JDialog implements ActionListener {
    XxxMain xxxmain = null;
    //xxxmain 을 멤버 변수로 설정함으로써 XxxSub 클래스 내에서 xxxmain 을 계속 사용할 수 있게 함.
    //null 로 주는 이유는, 얕은 복사를 하기 위해서.
    //-> 얕은 복사를 하는 이유???
    //   멤버 변수인 xxxmain 이 새로운 객체를 생성하는 것이 아니라, XxxMain 클래스 주소를 기억하게 하기 위해서
    //   이렇게 함으로써 XxxSub 클래스 내에서 계속해서 B1 클래스와 연결되게 함.

    JScrollPane jsp = new JScrollPane();
    JPanel jp_south = new JPanel();
    JButton btn_save = new JButton("저장");
    JButton btn_close = new JButton("닫기");

    public XxxSub() {
    }

    public XxxSub(XxxMain xxxmain) {
        this.xxxmain = xxxmain;
        //XxxSub 클래스 내의 멤버 변수인 xxxmain 에 XxxMain 클래스의 주소를 대입.
        initDisplay();
    }

    public void initDisplay() {
        jp_south.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp_south.add(btn_save);
        jp_south.add(btn_close);
        btn_close.addActionListener(this);
        btn_save.addActionListener(this);

        this.add("South", jp_south);
        this.add("Center", jsp);
        //this.setSize(400, 500);
        this.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        //공지사항 글을 작성한 후 저장 버튼 누르면, 데이터베이스에 저장 -> 현재 창 닫고 부모창에 전체 조회가 처리되도록
        //새로운 글이 입력되었으니까 추가된 글까지 출력해야 함
        if (obj == btn_save) {
            xxxmain.xxxList();
            this.dispose();
        } else if (obj == btn_close) {
            this.dispose();
        }
    }
}
