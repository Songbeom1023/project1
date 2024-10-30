package day5;

import javax.swing.*;
import java.awt.*;

public class JDialogMain extends JDialog {
    JFrameMain jfm = null;
    JPanel jp_center = new JPanel();
    JPanel jp_south = new JPanel();
    JButton jbtn_save = new JButton("저장");
    JButton jbtn_close = new JButton("닫기");
    JLabel jlb_name = new JLabel("이름");
    JLabel jlb_sex = new JLabel("성별");
    ButtonGroup bg = new ButtonGroup();
    JRadioButton jrb_man = new JRadioButton("남자",true);
    JRadioButton jrb_woman = new JRadioButton("여자", false);
    JTextField jtf_name = new JTextField(20);

    JDialogMain(JFrameMain jfm){
        this.jfm = jfm;
        initDisplay();
    }

    public String getSelectedSex(){
        if (jrb_man.isSelected()){
            return "남자";
        }else if (jrb_woman.isSelected()) {
            return "여자";
        }else {
            return null;}
    }

    public String getName(){
        return jtf_name.getText();
    }

    public void setName(String name){
        jtf_name.setText(name);
    }

    public void set(String title, boolean isView, boolean editable){
        setEditable(editable);
        this.setTitle(title);
        this.setVisible(isView);
    }
    public void setEditable(boolean editable){
        //true -> 입력, 수정
        //false -> 비활성화
        jtf_name.setEditable(editable);
    }

    //부모창에서 사용자의 요청에 따라 화면이 켜진 후 setTitle, setVisible, setSize 가 바뀜
    // JTextField -> 상세보기일 때는 읽기만  / 입력과 수정일 때는 활성화
    public void initDisplay(){
        jp_center.setLayout(null);//디폴트인 FlowLayout 을 초기화
        jlb_name.setBounds(20,20,100,20);
        jtf_name.setBounds(80,20,100,20);
        jlb_sex.setBounds(20,50,100,20);
        jrb_man.setBounds(80,50,100,20);
        jrb_woman.setBounds(200,50,100,20);
        bg.add(jrb_man);
        bg.add(jrb_woman);
        jp_center.add(jlb_name);
        jp_center.add(jtf_name);
        jp_center.add(jlb_sex);
        jp_center.add(jrb_man);
        jp_center.add(jrb_woman);
        jp_center.setBorder(BorderFactory.createEtchedBorder());
        jp_south.setBorder(BorderFactory.createEtchedBorder());
        jp_center.setBackground(new Color(154, 189, 225));
        jp_south.setBackground(new Color(88, 119, 239));
        jbtn_save.setBackground(new Color(43, 66, 154));
        jbtn_save.setForeground(new Color(255, 255, 255));
        jbtn_close.setBackground(new Color(43, 66, 154));
        jbtn_close.setForeground(new Color(255, 255, 255));
        jp_south.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp_south.add(jbtn_save);
        jp_south.add(jbtn_close);
        this.add("Center",jp_center);
        this.add("South",jp_south);
        this.setSize(500,400);
        this.setVisible(false);
    }
    public static void main(String[] args) {
        new JDialogMain(null);
    }
}
