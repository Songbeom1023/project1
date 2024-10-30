package day6.variable;

import java.awt.event.ActionListener;

public class KiwiSimulation {
    public static void main(String[] args) {
      //  ActionListener kl = new KiwiLogin();
        KiwiLogin kl = new KiwiLogin();
        kl.frame.setTitle("외부에서 호출한 화면");
        kl.frame.setSize(500,500);
        kl.frame.setVisible(true);
        //부모 타입의 자손 클래스에 구현된 동일한 메소드가 없어서
        kl.initDisplay();
    }
}
