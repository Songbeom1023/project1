package tlak.step1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//BorderLayout1 -> 이벤트 처리를 담당하는 클래스의 역할을 같이 하고 있음
//여기서는 일부러 분리하여 처리!!!!!
//-> this 대신 인스턴스 변수 사용
//-> this 사용 시와 인스턴스 변수 사용 시의 차이 확인!!!!!!!!!
class BorderLayout2Event implements ActionListener{
//-> 이벤트 핸들러 클래스
    @Override
    public void actionPerformed(ActionEvent e) {
        //재정의 시 메소드 건드리지 말 것, 변수 이름은 바꿀 수 있음
        //바디 즉, {} 안만 재정의 할 것
        //코드 블럭에서 한 부분을 변경했을 때 이와 관려된 변수가 사용되는 부분을 모두 변경해야 함!!!!!!!!!!!!!!!!!
        System.out.println("actionPerformed 호출 성공");
        Object obj = e.getSource();
        JButton btn = (JButton) obj;
        //instanceof 예약어는 타입을 확인하는 키워드 -> 클래스 타입이면 확인 가능
        if(obj instanceof JButton){
            System.out.println("너는 JButton 입니다");
        }
        else {
            System.out.println("땡");
        }
    }
}

public class BorderLayout2 extends JFrame{
    JButton jbtn_north = new JButton("North");
    JButton jbtn_south = new JButton("South");
    JButton jbtn_west = new JButton("West");
    JButton jbtn_east = new JButton("East");
    JButton jbtn_center = new JButton("Center");
    JPanel jp = new JPanel();

    //화면 출력부
    public void initDisplay() {
        System.out.println("initDisplay 호출 성공");
        //JFrame 을 상속 받아서 따로 인스턴스화하지 않아도 됨
        this.setSize(400, 300);
        this.setVisible(true);
        this.add("Center", jp);
        jp.setLayout(new BorderLayout());
        //border -> 동서남북 배치 / panel -> flow 배치(왼 -> 오)
        jp.add("North", jbtn_north);
        jp.add("South", jbtn_south);
        jp.add("West", jbtn_west);
        jp.add("East", jbtn_east);
        jp.add("Center", jbtn_center);
        BorderLayout2Event bl2 = new BorderLayout2Event();
        jbtn_center.addActionListener(bl2);
        jbtn_south.addActionListener(bl2);
        jbtn_north.addActionListener(bl2);
        jbtn_west.addActionListener(bl2);
        jbtn_east.addActionListener(bl2);
    }

    public static void main(String[] args) {
        BorderLayout2 b2 = new BorderLayout2();
        b2.initDisplay();
    }
}
