package day7.variable;
/*
상속 : A is a B
**여기서 JFrame2 는 JFrame 을 상속받는다
**extends
**상속을 받으면 코드를 줄일 수 있다!
 */

import javax.swing.*;

public class JFrame2 extends JFrame {
    public void initDisplay(){
       this.setSize(400,500);
       this.setVisible(true);
       //이 경우 this -> JFrame2
    }

    public static void main(String[] args) {
        JFrame2 f1 = new JFrame2();
        f1.initDisplay();
    }
}
