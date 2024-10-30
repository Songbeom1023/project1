package classes.UI.combo;

import com.util.DBConnectionMgr;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
//클래스의 구성 요소 : 변수 + 메소드
//생성자의 파리미터 자리도 사용자가 결정
//생성자를 활용하여 초기화하는 값이 오라클 서버를 경유한 뒤 결정되어야 한다면?
//JComboBox 객체 생성하기
//-> 생성자 자리에 들어갈 String[]을 결정하고, 결정된 값이 실제 ComboBox 에 출력되도록 처리하기
//테스트 시나리오
//1) 처음 화면이 그려질 때 초기화하는 방법
//2) 이벤트가 발생할 때 초기화하는 방법
public class Combo2 extends JFrame implements ItemListener, ActionListener {
    JComboBox<String> combo = null;
    JMenuBar jmb = new JMenuBar();
    JMenu jm = new JMenu("Edit");
    JMenuItem jmi_db = new JMenuItem("DB 테스트");
    JMenuItem jmi_ins = new JMenuItem("입력");
    JMenuItem jmi_upd = new JMenuItem("수정");
    JMenuItem jmi_det = new JMenuItem("상세보기");
    JMenuItem jmi_del = new JMenuItem("삭제");
    JSeparator jsep = new JSeparator();
    JMenuItem jmi_exit = new JMenuItem("종료");

    public Combo2() {
        initDisplay();
    }

    public void initDisplay() {
        jmi_db.addActionListener(this);

        jm.add(jmi_db);
        jm.add(jmi_ins);
        jm.add(jmi_upd);
        jm.add(jmi_det);
        jm.add(jmi_del);
        jm.add(jsep);
        jm.add(jmi_exit);
        jmb.add(jm);

        this.setJMenuBar(jmb);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        if(combo == null){
            combo = new JComboBox();
        }
        this.add("North", combo);
        this.setSize(500, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Combo2();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    public JComboBox<String> dbTest(){
        DBConnectionMgr dbMgr = DBConnectionMgr.getInstance();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT distinct(zdo) FROM zipcode_t");
        sql.append(" ORDER BY zdo asc");

        String zdos[] = null;
        Vector<String> v = new Vector<>();

        try {
            con = dbMgr.getConnection();//데이터베이스에 연결 요청
            pstmt = con.prepareStatement(sql.toString());//
            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("zdo"));
                v.add(rs.getString("zdo"));
            }
            zdos = new String[v.size()];
            v.copyInto(zdos);
            combo = new JComboBox(zdos);
        }catch (Exception e) {
            e.printStackTrace();
        } return combo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //이벤트 소스를 찾기 위한 코드 -> 무엇이 클릭되었는지, 값이 바뀌었는지를 알기 위한 감지
        Object obj = e.getSource();
        if (obj == jmi_db) {
            System.out.println("DB 연결");
            Container cont = this.getContentPane();
            if (combo != null) {
                cont.remove(combo);
            }
            combo = dbTest();
            this.add("North", combo);
            cont.revalidate();
        }
    }
}
