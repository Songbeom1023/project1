package classes.day1;

import javax.swing.*;

public class A1 {
    //파라미터 자리에 객체가 올 수 있다.
    //파라미터 자리는 지역 변수의 성격을 갖는다.
    //그럼 언제 생성이 되는가?
    //메소드 A를 호출할 때 객체 주입
    //**메소드 뿐 아니라 생성자도 이런 방식으로 객체를 주입받음
    public void methodA(JFrame frame){
        System.out.println("methodA");
        System.out.println(frame);
        frame.setSize(500,400);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        A1 a = new A1();
        JFrame frame = new JFrame();
        a.methodA(frame);
    }
}
