package classes.UI.table;

import model.vo.Notice1030;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Table1 extends JFrame implements ActionListener, MouseListener {
    String[] headers = {"번호", "제목", "작성자"};
    JButton jbtn_sel = new JButton("조회");
    DefaultTableModel dtm = new DefaultTableModel(headers, 0);
    JTable table = new JTable(dtm);
    JScrollPane jsp = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    public Table1() {
        initDisplay();
    }

    public void initDisplay() {
        jbtn_sel.addActionListener(this);
        table.addMouseListener(this);
        this.add("North", jbtn_sel);
        this.add("Center", jsp);
        this.setSize(500, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Table1();
    }

    public List<Notice1030> getNoticeList() {
        List<Notice1030> nList = new ArrayList<>();
        Notice1030 no = new Notice1030();
        no.setN_no(1);
        no.setN_title("제목1");
        no.setN_writer("나 신입");
        nList.add(no);
        no = new Notice1030();
        no.setN_no(2);
        no.setN_title("제목2");
        no.setN_writer("나 초보");
        nList.add(no);
        no = new Notice1030();
        no.setN_no(3);
        no.setN_title("제목3");
        no.setN_writer("나 일등");
        nList.add(no);
        return nList;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == jbtn_sel) {
            List<Notice1030> nList = getNoticeList();
            for (int i= 0; i < nList.size(); i++){
                Notice1030 nvo = nList.get(i);
                Vector<Object> onerow = new Vector<>();
                onerow.add(nvo.getN_no());
                onerow.add(nvo.getN_title());
                onerow.add(nvo.getN_writer());
                dtm.addRow(onerow);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getClickCount()==1){
            System.out.println("더블클릭");
            int index[] = table.getSelectedRows();
            if(index.length == 0){
                JOptionPane.showMessageDialog(this, "조회할 데이터를 선택하세요.");
                return;//메소드 탈출
            }else if(index.length > 1){
                JOptionPane.showMessageDialog(this, "데이터를 한 건만 선택하세요.");
                return;
            }else{
                int no = (Integer)dtm.getValueAt(index[0],0);
                String title = (String)dtm.getValueAt(index[0],1);
                String writer = (String)dtm.getValueAt(index[0],1);
                System.out.println(no+", "+title+", "+writer);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
