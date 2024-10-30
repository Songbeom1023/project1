package classes.UI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NickNameList extends JFrame{
    String[] cols = {"대화명"};
    DefaultTableModel dlm = new DefaultTableModel(cols,3);
    JTable jtb = new JTable(dlm);
    //파라미터 자리의 순서가 잘못되면 에러가 날 수 있으므로 그 위치까지 신경 써준다!!!!!!!!!!!!!!!!
    JScrollPane jsp = new JScrollPane(jtb,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    JPanel jp_south = new JPanel();
    JButton btn_one = new JButton("1:1");
    JButton btn_many = new JButton("n:n");
    JButton btn_imo = new JButton("이모티콘");
    JButton btn_exit = new JButton("종료");

    public NickNameList() {
        initDisplay();
    }

    public void initDisplay() {
        this.setSize(400,500);
        this.setVisible(true);
        this.add("Center", jsp);
        this.add("South", jp_south);

        //default : FlowLayout -> GridLayout
        jp_south.setLayout(new GridLayout(2,2));
        jp_south.add(btn_one);
        jp_south.add(btn_many);
        jp_south.add(btn_imo);
        jp_south.add(btn_exit);
    }

    public static void main(String[] args) {
        new NickNameList();//생성자 호출
    }

    }
