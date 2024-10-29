import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client extends JFrame implements ActionListener {


    //선언부
    String imgPath = "D:\\workspace_java\\basic1\\src\\image\\talk\\";
    ImageIcon img = new ImageIcon(imgPath+"gg.jpg");
    JLabel jlb_id = new JLabel("아이디");
    JLabel jlb_pw = new JLabel("패스워드");
    Font font =new Font("휴먼매직체",Font.BOLD,15);
    JTextField jtf_id = new JTextField();
    JPasswordField jpf_pw = new JPasswordField();
    JButton btn_login =new JButton(new ImageIcon(imgPath+"login.png"));
    JButton btn_join = new JButton(new ImageIcon(imgPath+"confirm.png"));

    private Socket socket;
    ObjectOutputStream oos;
    ObjectInputStream ois;

    public Client(Socket socket) {
        this.socket = socket;
    }
    Client(){
        initDisplay();
        startClient();
    }


    //JPaenl은 다양한 컴포넌트를 담을 수 있다.
    class Mypanel extends JPanel {
        // 컴포넌트가 그려질 때 호출되는 메소드. 패널에 맞춤형 그래픽을 그릴 수 있다.
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); // 항상 먼저 부모 메서드를 호출해야 합니다.
            // 이미지를 패널의 (0, 0) 위치에 그려준다.
            g.drawImage(img.getImage(), 0, 0, getWidth(), getHeight(), null);
            setOpaque(false); // 패널의 배경을 투명하게 설정
        }
    }

    public void initDisplay(){
        btn_login.addActionListener(this);
        btn_join.addActionListener(this);
        setContentPane(new Mypanel());
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
        //로그인 버튼 라인 추가
        btn_login.setBounds(175,285,120,40);
        this.add(btn_login);
        //회원가입 버튼 라인 추가
        btn_join.setBounds(45,285,120,40);
        this.add(btn_join);
        this.setLocation(500,250);
        this.setSize(350,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void startClient() {
        try{
            socket = new Socket("127.0.0.1", 5000);
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }




    public static void main(String[] args) {
        new Client();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == btn_login) {
            String id = jtf_id.getText();
            String pw = jpf_pw.getText();
            System.out.println(id);
            System.out.println(pw);
            if (id.equals("tomato") && pw.equals("123")) {
                JOptionPane.showMessageDialog(this,"로그인 성공","INFO",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            else JOptionPane.showMessageDialog(this,"로그인 실패 다시 시도하세요!");
        }else if (obj == btn_join) {
            JOptionPane.showMessageDialog(this,"회원가입요청","WARNING",JOptionPane.WARNING_MESSAGE);
        }

    }
}
