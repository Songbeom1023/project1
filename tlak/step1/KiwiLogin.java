package tlak.step1;

import day6.variable.KiwiTalk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//키위톡 로그인 화면
//로그인 -> 대화창
//이벤트 소스를 지원하는 인터페이스 : ActionListener
//구현 : 어떤 디바이스냐에 따라 다르기 때문에 결정할 수 없음. -> 추상메소드(미정)
//-> actionPerformed 는 추상메소드 -> 구현체 클래스가 구현을 해주어야 함
//-> "implements"가 붙은 클래스가 구현체가 됨.

public class KiwiLogin implements ActionListener {
    //ActionListener : 인터페이스, 약속된 method 있음
    //-> actionPerformed method 호출
    //implements :
    //이벤트 : 행위에 대한 처리
    String nickname = null;
    //이 변수에 담긴 닉네임을 kiwiTalk 클래스에 넘겨 재사용
    //선언부
    JFrame frame = new JFrame();
    //JPanel 속지의 배치를 동서남북 중앙으로 배치해주는 BorderLayout 설정 -> setLayout() 메소드 활용
    JPanel jp_north = new JPanel();
    JLabel jlb_nickname = new JLabel("닉네임");
    JTextField jtf_nickname = new JTextField("");
    JPanel jp_south = new JPanel();
    JButton jbtn_login = new JButton("Login");
    JButton jbtn_join = new JButton("회원가입");
    //디폴트 생성자는 생략할 수 있지만, **굳이 여기서는 구현하여 외부에서 initDisplay가 호출되도록 해본다.
    //디폴트 생성자 : ()가 없는 생성자
    //생성자는 반환 타입이 없다 -> 반환 타입이 있다면 method
    public KiwiLogin(){
        //initDisplay();
    }
    //생성자 안에서

    //화면 그리기 메소드 선언
    public void initDisplay(){
        jp_north.setLayout(new BorderLayout());
        jp_south.setLayout(new GridLayout(1,2));//south 레이아웃 분할
        jp_south.add(jbtn_login);
        jp_south.add(jbtn_join);
        jp_north.add("West", jlb_nickname);
        jp_north.add("Center",jtf_nickname);
        jp_north.setBackground(Color.LIGHT_GRAY);
        //이벤트 소스와(jbtn_login) 이벤트 핸들러 클래스(ActionListener 구현 클래스)를 연결해줌
        jbtn_login.addActionListener(this);
        jtf_nickname.addActionListener(this);
        //-> Action method 호출
        frame.add("South", jp_south);//UI 에서 add 는 "붙이다"의 의미
        frame.add("North", jp_north);
        //add(위치, 객체) **위치는 대문자로 시작
        frame.setTitle("키위톡 로그인");
        frame.setSize(300,500);
        frame.setVisible(true);
    }

    //메인 메소드
    public static void main(String[] args) {
        KiwiLogin login = new KiwiLogin();
        login.initDisplay();
    }/////end of main

    //개발자가 호출하는 method 아님.
    //이벤트 소스가 이벤트 발생을 느끼면 자동으로 호출해줌
    //-> JVM 이 이벤트를 감지하면 개발자 대신 호출해주는 것.
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();//반환타입 String
        Object source = e.getSource();//반환타입 Object
        //로그인 버튼이 눌렸을 때, 인터셉트하여 사용자가 JTextFelid에 입력했는지 여부를 체크
        //-> 없으면 그 이상 진행되지 않도록 할 것
        nickname = jtf_nickname.getText();//이벤트가 발동하면

        //command 는 지역 변수
        //****System.out.printf("%s, %s\n",command,source.toString());
        //printf **f=format
        //print("%s %s",)
        if("Login".equals(command)) {
            System.out.println(source == jbtn_login);
            System.out.println(source.equals(jbtn_login));
            if (nickname.equals("")){
                JOptionPane.showMessageDialog(frame, "닉네임을 입력하세요");
                jtf_nickname.requestFocus();
                //actionPerformed 메소드 영역을 빠져 나감
                return;//if문에서 return을 만나면 값을 반환하는 것이 아니라 중단
            }
        } else if (jtf_nickname == source){
            System.out.println("사용자가 입력한 닉네임 : "+jtf_nickname.getText());
            String nickname = jtf_nickname.getText();
            jtf_nickname.setText("");//빈 문자열 -> 지운 효과
            KiwiTalk kt = new KiwiTalk(nickname);
            //디폴트 생성자 : 파라미터 없음.
            //선언이 안 되어 있으면, 디폴트 생성자를 대신 정의해줌.
            kt.initDisplay2();
            frame.dispose();
        } else if ("회원가입".equals(command)){
            //else if (command.equals("회원가입"))
        }
    }
}//////end of KiwiLogin
