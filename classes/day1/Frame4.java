package classes.day1;

import javax.swing.*;

//상속은 class 간의 결합도를 높이는 코드이므로 권장하지는 않음.
//인터페이스나 추상 클래스를 증식하는 코드를 짤 것
//-> 독립적인 코드 작성
//-> 단위 테스트나 통합 테스트가 가능하도록
//ex) 주문 관리와 배송 관리는 관계가 있다.
//   -> 주문 관리는 3년 차 개발자가, 배송 관리는 7년 차 개발자가 담당
//   -> 주문 관리와 배송 관리가 독립적이어야 함
//   -> 그러나 주문이 들어와야 배송이 됨 -> 배송 관리를 담당하는 메소드는 파라미터로 주문 내역을 받아 옴.
public class Frame4 extends JFrame{

    public void initDisplay(){
        this.setTitle("Frame4");//is a 관계 -> 상속
        this.setSize(500,500);
        this.setVisible(true);
    }
}
