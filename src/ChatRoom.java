import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatRoom extends JFrame implements ActionListener {
//    Client client = new Client(this);
    JLabel jb_north = new JLabel("North");
    JTextField jb_south = new JTextField();
    JButton jbt_send = new JButton("Send");
    JTextArea textArea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


    public ChatRoom(){
        initDisplay();
    }

    public void initDisplay(){
        // South 패널의 레이아웃을 BorderLayout으로 변경
        jb_south.setLayout(new BorderLayout());

        // 버튼을 남쪽 패널의 동쪽에 배치
        jb_south.add(jbt_send, BorderLayout.EAST);
        jbt_send.addActionListener(this);
        this.add("South",jb_south);
        this.add("North",jb_north);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add("Center",scrollPane);
        this.setSize(500,500);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        new ChatRoom();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == jbt_send) {
            String message = jb_south.getText();
            textArea.append(message + "\n");
            jb_south.setText("");
        }
    }
}
