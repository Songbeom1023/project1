package day6.variable;

import javax.swing.*;

public class KiwiTalk {
    //선언부
    String nickname = null;
    JFrame frame = new JFrame();

    public KiwiTalk(){}
    public KiwiTalk(String nickname){
        System.out.println(nickname);//지역 변수
        this.nickname = nickname; //-> this, 멤버 변수를 만들 때 -> 깊은 복사
        System.out.println(this.nickname);//멤버 변수 - null
    }
    //화면 처리부
    public void initDisplay2(){
        //System.out.println("Kiwi Talk의 initDisplay2 호출 성공");
        frame.setTitle(nickname+"님의 대화창");
        frame.setSize(700,400);
        frame.setVisible(true);
    }

    //메인 메소드는 없어도 괜찮음 -> kiwiLogin 에서 로그인 버튼을 누르면 그때 화면처리부 method 호출 할 거니까
}
