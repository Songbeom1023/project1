package classes.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener {

    String imgPath = "D:\\workspace_java\\basic1\\src\\image\\image\\talk\\";
    //JPanel 에 쓰일 이미지 아이콘
    ImageIcon img = new ImageIcon(imgPath + "main.png");
    JLabel jlb_id = new JLabel("아이디");
    JLabel jlb_pw = new JLabel("비밀번호");
    Font font = new Font("휴먼매직체",Font.BOLD,13);
    JTextField jtf_id = new JTextField("tomato");
    JPasswordField jpf_pw = new JPasswordField("123");
    JButton btn_login = new JButton(new ImageIcon(imgPath + "login.png"));
    JButton btn_join = new JButton(new ImageIcon(imgPath + "confirm.png"));

    public LoginForm() {
        System.out.println("LoginForm 디폴트 생성자");
        initDisplay();
    }

    //JPanel : 다양한 컴포넌트를 담을 수 있다.
    //컴포넌트 : 독립적인 역할을 하는 클래스
    //         ex) 버튼, 라디오 버튼 등
    class MyPanel extends JPanel{
        //컴포넌트가 그려질 때 호출되는 메소드 -> 패널에 맞춤형 그래픽도 그릴 수 있음.
        public void paintComponent(Graphics g) {
            //이미지를 패널의 (0,0) 위치에 그려주는 메소드
            g.drawImage(img.getImage(), 0, 0, null);
            setOpaque(false);//패널의 배경을 투명하게 설정
            //super : 상위 클래스를 가리키는 수정자
            super.paintComponent(g);
            //이미지 처리는 개발자가 호출만 할 수 있고, 내부적으로 처리가 되는 부분
            //-> 상위 메소드를 호출애 JVM 이 처리할 수 있도록 함.
        }
    }

    public void initDisplay() {
        btn_login.addActionListener(this);
        btn_join.addActionListener(this);
        setContentPane(new MyPanel());

        //버튼 추가
        btn_login.setBounds(175,285,120,40);
        this.add(btn_login);
        btn_join.setBounds(45,285,120,40);
        this.add(btn_join);

        //디폴트가 보더레레이아웃이기 때문에 좌표값으로 하나하나 배치하려면 디폴트로 잡혀있는 레이아웃을 파괴 해주어야 함. -> null
        this.setLayout(null);
        //아이디 라인
        jlb_id.setBounds(45,200,80,40);
        jlb_id.setFont(font);
        jtf_id.setBounds(110,200,185,40);
        this.add(jlb_id);
        this.add(jtf_id);

        //비밀번호 라인
        jlb_pw.setBounds(45,240,80,40);
        jlb_pw.setFont(font);
        jpf_pw.setBounds(110,240,185,40);
        this.add(jlb_pw);
        this.add(jpf_pw);

        this.setSize(350,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(800,250);
    }

    public static void main(String[] args) {
        //메인 메소드 내에서 initDisplay 호출 X
        //생성자 내에서 호출
        //-> 인스턴스 변수가 필요 없음 = 선언부 필요없음
        new LoginForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == btn_login) {
            JOptionPane.showMessageDialog(this, "로그인 요청","INFO",JOptionPane.INFORMATION_MESSAGE);
            return;
        } else if (obj == btn_join) {
            JOptionPane.showMessageDialog(this, "회원가입 요청","INFO",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    }
}
