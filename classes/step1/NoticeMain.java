package classes.step1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NoticeMain extends JFrame implements ActionListener {
    NoticeDialog nd = new NoticeDialog(this);
    //이 클래스에 메인 메소드가 있고, 멤버에서 NoticeDialog 를 인스턴스화하므로, NoticeDialog 생성자가 활용됨.
    //-> NoticeMain 에서 NoticeDialog 를 인스턴스화하기 때문
    //-> 양쪽 클래스 모두가 서로를 필요로 하더라도, 순환구조가 아닌 한쪽에서만 인스턴스화를 하고 생성자 파라미터에 NoticeMain 을 넣어서
    //   원본이 전달되도록 한다.
    //NoticeDialog 에서는 null 로 초기화한 뒤 생성자의 파라미터로 받은 원본을 초기화하여 사용해야 한다.
    public NoticeMain() {}

    public void initDisplay() {//웹어플리케이션 -> html,ReactJS, Vue.js, Angular.js
        this.setSize(500,600);//브라우저 인터프리터 역할(JVM)
        this.setVisible(true);
    }

    public static void main(String[] args) {

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
