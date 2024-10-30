package classes.UI.combo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Combo1 extends JFrame implements ItemListener {
    JPanel jp_north = new JPanel();
    JComboBox jcb1 = null;
    JComboBox jcb2 = new JComboBox();
    JComboBox jcb3 = null;
    JTextArea jta_log = new JTextArea();
    //생성자도 메소드 오버 로딩의 규칙을 따른다.
    //오버 로딩 규칙 : 파라미터의 개수가 다르거나 타입이 달라야 한다.
    JScrollPane jsp_log = new JScrollPane(jta_log, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    public Combo1() {
        jcb1 = new JComboBox();
        jcb1.addItem("돈가스");
        jcb1.addItem("떡볶이");
        jcb1.addItem("김밥");
        initDisplay();
    }

    public void initDisplay() {
        jcb3 = new JComboBox(new String[]{"전체", "서울", "경기","부산"});
        jcb3.addItemListener(this);
        //this 가 가리키는 것이 Combo1 이지만, 그 안에는 add()가 없음.
        //그러나 JFrame 에 그 메소드가 있기에 상속을 받는 것.
        jp_north.setLayout(new GridLayout(3,1));
        jp_north.add(jcb1);
        jp_north.add(jcb2);
        jp_north.add(jcb3);
        this.add("North", jp_north);
        this.add("Center",jsp_log);
        this.setSize(400, 500);
        this.setVisible(true);
        //JVM 과 App 사이의 연결 고리가 끊겨 자원 반납이 일어나야 함.
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Combo1();
    }
    //ItemListener 가 정의하는 메소드를 Override 하고 있어서 Combo1 은 ItemListener 의 구현체 클래스라고 한다.
    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getSource();
        if (source == jcb3) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                int index = jcb3.getSelectedIndex();
                //System.out.println(index+"선택되었습니다");
                jta_log.append(index+"선택되었습니다\n");
                String item = (String)jcb3.getItemAt(index);
                //setText : 추가되는 것이 아니라 하나의 값으로 설정
                //append : 값을 하나로 결정하는 것이 아니라 추가
                jta_log.append("선택한 아이템은" + item +"입니다\n");
            }
        }
    }
}
