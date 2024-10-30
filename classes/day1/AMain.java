package classes.day1;

import javax.swing.*;

class A2 extends JFrame {
}

class A3{
}

public class AMain {
    public static void main(String[] args) {
        A2 a2 = new A2();//JFrame 상속
        System.out.println(a2);//JFrame 이라는 UI 클래스여서 toString 메소드가 재정의(좌표값, 레이아웃 정보 등으로) 되어 있어 주소번지를 볼 수 없음.
        A3 a3 = new A3();//기본 Object class 상속
        System.out.println(a3);//@로 시작되는 주소번지 출력
    }
}
/*

 */

