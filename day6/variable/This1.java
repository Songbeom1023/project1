package day6.variable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class This1EventHandler implements ActionListener{
    JButton jbtn = null;
    This1EventHandler(JButton jbtn){
        this.jbtn = jbtn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();//버튼에 대한 문자열
        Object source = e.getSource();//버튼에 대한 주소번지
        System.out.println(command+","+source);
        System.out.println(source == jbtn);
    }
    //ActionListener는 JButton에 대한 이벤트 처리를 담당하는 추상메소드를 정의
    //-> 추상 메소드는 메소드 변형 하지 않음.
    //그래서, 이벤트를 처리하려면 반드시 actionPerformed 라는 메소드를 구현해야 함.
}
public class This1 {
    JFrame frame = new JFrame();
    JButton jbtn = new JButton("로그인");
    This1EventHandler handler = new This1EventHandler(jbtn);
    //생성자 자리에 주소값

    public void initDisplay(){
        jbtn.addActionListener(handler);//jbtn 클래스 연결
        frame.add("North", jbtn);//**버튼 보이게 하기
        frame.setSize(600,450);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        This1 t1 = new This1();
        t1.initDisplay();
    }
}
