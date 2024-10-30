package classes.day1;

import javax.swing.*;
//여러 개의 생성자가 있을 때 각각의 생성자를 호출해보기
public class Frame2 {
    JFrame frame;

    public Frame2(){
        frame = new JFrame("JFrame2");
        initDisplay();
    }//setTitle 메소드가 아니어도 생성자로 초기화 가능
     //같은 이름의 생성자를 여러 개 가질 수도 있음 -> 오버로딩(OverLoading)
     // -> 생성자의 파라미터의 개수가 다르거나 타입이 다르면 다른 생성자로 인지
     // -> Frame2() / Frame2(String title) -> 다른 생성자

    public Frame2(String title){
        //생성자 호출 시 파라미터로 복사된 문자열이 생성자 호출할 때 전달됨.
        frame = new JFrame(title);
        initDisplay();
    }
    public void initDisplay(){
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Frame2 f2 = new Frame2();
        Frame2 f22 = new Frame2("22");
    }
}
