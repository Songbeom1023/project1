package classes.UI.refresh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameMain extends JFrame implements ActionListener {
    JTextArea jta = new JTextArea();
    JButton refresh = new JButton("Refresh");

    public JFrameMain() {
        initDisplay();
    }

    public void initDisplay() {
        this.setSize(500, 600);
        this.setVisible(true);
        this.add("Center", jta);
        this.add("South", refresh);

        refresh.addActionListener(this);
    }

    public static void main(String[] args) {
        //인스턴스 변수를 생성하지 않고, 생성부만 작성
        //initDisplay 메소드를 호출하기 위해 인스턴스화를 함.
        //생성자로 JFrameMain 을 선언해 놓았기 때문에 생성만 진행하면 됨.
        //따라서 생성부만 작성하는 것.
        new JFrameMain();
    }
//메소드 앞 @Override -> 부모 클래스/인터페이스/추상 클래스가 정의한 메소드를 재정의하는 경우
    //이 경우 선언부를 훼손해서는 안 됨.
    //call back method, main method 내에서는 보통 인스턴스화를 하지 않음.
    //-> 내가 제어할 수 있는 method 가 아님.
    //-> add.ActionListener 가 발생할 때마다 인스턴스화가 계속 일어나게 해서는 안 됨.

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == refresh) {
            System.out.println("refresh 버튼 클릭");
            Container cont = this.getContentPane();
            // -> 처음에 그려진 화면에서 필요없는 component 삭제할 때 활용
            if (jta != null) {
                cont.remove(jta);
                cont.remove(refresh);
            }
            JPanel1 jp1 = new JPanel1();
            this.add("Center", jp1);
            cont.revalidate();
        }
    }
}
