package classes.UI;

import javax.swing.*;

class AddressSub {

}
public class AddressMain {
    JFrame frame = null;

    AddressMain() {
        frame = new JFrame();
        frame.setSize(300,600);
        frame.setVisible(true);
    }
//원하는 클래스를 찾았다면 가장 먼저 볼 것은 "생성자"
    //-> 생성자의 선택에 따라 추가적인 메소드 호출이나 설정, 초기화 등을 생략가능하기 때문
    AddressMain(String title) {
        frame = new JFrame(title);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new AddressMain("키위톡 - Ver 1.0");
    }
}
