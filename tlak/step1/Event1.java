package tlak.step1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event1 extends JFrame implements ActionListener {
    JButton send = new JButton("send");
    JButton exit = new JButton("종료");
    JPanel jp_south = new JPanel();
    JPanel jp_center = new JPanel();
    JTextField jtf_msg = new JTextField("",20);
    JTextArea jta_area = new JTextArea();
    JScrollPane jsp_msg = new JScrollPane(jta_area,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    public void initDisplay(){
    this.setSize(500,400);
    this.setVisible(true);
    this.add("South",jp_south);
    this.add("North",exit);
    //this.add("Center",jta_area);
    this.add("Center",jsp_msg);

    send.addActionListener(this);
    exit.addActionListener(this);
    jtf_msg.addActionListener(this);

    jp_south.setLayout(new BorderLayout());
    jp_south.add("South",send);
    jp_south.add("Center",jtf_msg);
    jp_south.add("East",send);
    send.setBackground(new Color(88, 119, 239));
    send.setForeground(Color.BLACK);
    exit.setBackground(new Color(253, 247, 199));
    jta_area.setBackground(new Color(215, 246, 242));


    //Event1에 ActionListener implements 했으므로 this 사용
    }
    public static void main(String[] args) {
    Event1 e1 = new Event1();
    e1.initDisplay();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionPerformed 호출 성공");
        Object obj =e.getSource();
        if(obj == jtf_msg||obj == send){
            String msg = jtf_msg.getText();
            jta_area.append(msg+"\n");
            jtf_msg.setText("");
            jtf_msg.requestFocus();
        } else if (obj == exit) {
            System.exit(0);
        }
    }
}
