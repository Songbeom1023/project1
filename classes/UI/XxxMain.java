package classes.UI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XxxMain extends JFrame implements ActionListener {
    //********************************************************************
    XxxSub xxxSub = new XxxSub(this);
    //this = XxxMain 자신을 가리킴, 동시에  자신의 주소를 XxxSub 에 전달
    //********************************************************************

    JPanel jp_north = new JPanel();
    JButton jb_ins = new JButton("입력");
    JButton jb_upd = new JButton("수정");
    JButton jb_det = new JButton("상세");
    JButton jb_del = new JButton("삭제");
    JButton jb_sel = new JButton("전체 조회");
    JButton jb_exit = new JButton("종료");

    //테이블 그리기**********************************************
    String[] cols = {"번호","제목","작성자"}; //배열
    DefaultTableModel dtm = new DefaultTableModel(cols,3); //값에 접근
    JTable jtb = new JTable(dtm); //테이블 양식
    JScrollPane jsp = new JScrollPane(jtb);//맨 아래 속지

    public XxxMain() {
        initDisplay();
    }

    public void initDisplay() {
        this.setSize(800,600);
        this.setVisible(true);
        this.add("North", jp_north);
        this.add("Center", jsp);

        jp_north.setLayout(new FlowLayout(FlowLayout.LEFT));
        jp_north.add(jb_ins);
        jp_north.add(jb_upd);
        jp_north.add(jb_det);
        jp_north.add(jb_del);
        jp_north.add(jb_sel);
        jp_north.add(jb_exit);

        jb_upd.addActionListener(this);
        jb_ins.addActionListener(this);
        jb_del.addActionListener(this);
        jb_exit.addActionListener(this);
        jb_det.addActionListener(this);
        jb_sel.addActionListener(this);
    }

    public static void main(String[] args) {
        new XxxMain();
    }
    //********************************************************************
    //배열
    public void xxxList(){
        System.out.println("List 호출");
        //2차원 배열 - 로우가 3, 컬럼 3
        Object[][] objs ={
                {1,"공지사항1","관리자"},
                {2,"공지사항2","김유신"},
                {3,"공지사항3","강감찬"},
        };
        Container cont = this.getContentPane();
        if (jsp!=null){
            cont.remove(jsp);
        }
        dtm = new DefaultTableModel(objs,cols);
        jtb = new JTable(dtm);
        jsp = new JScrollPane(jtb);
        cont.add("Center",jsp);
        cont.revalidate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == jb_ins) {
            xxxSub.setTitle(jb_ins.getText());
            xxxSub.setSize(400,600);
            xxxSub.setVisible(true);
        } else if (obj == jb_upd) {
            xxxSub.setTitle(jb_upd.getText());
            xxxSub.setSize(400,600);
            xxxSub.setVisible(true);
        } else if (obj == jb_det) {
            xxxSub.setTitle(jb_det.getText());
            xxxSub.setSize(400,600);
            xxxSub.setVisible(true);
        } else if (obj == jb_del) {
            xxxSub.setTitle(jb_del.getText());
            xxxSub.setSize(400,600);
            xxxSub.setVisible(true);
        } else if (obj == jb_sel) {
            xxxList();
        } else if (obj == jb_exit) {
            this.dispose();
            System.exit(0);
    }
        }
    }
