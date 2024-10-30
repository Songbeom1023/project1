package day2.variable;
//java.lang 패키지만 import 문을 생략할 수 있음 ---> 나머지 패키지는 import 문을 사용해야 함.
import javax.swing.JFrame;
//java.lang 패키지 안에 있는 클래스는 JVM 이 찾을 수 있으나, java.lang 이 아닌 패키지에 있는 클래스는 패키지 이름을 추가해야 함.


//1단계> main method 안에서만 코딩 전개
//2단게> main method 안에 하는 코딩을 줄여 나갈 것
public class JFrame1 {
    public static void main(String[] args) {
        //클래스의 구성 요소 = 변수 + 메소드
        //-->클래스 안에 변수 선언 + 메소드 선언이 가능
        //이미 JVM 이 구현해 놓은 많은 클래스가 존재
        //-->제공되는 클래스를 호출
        JFrame jFrame = new JFrame();
        String title = "전자 계산기";
        title = "카카오톡";//재정의
        //재정의 가능, but 한 번에 하나만 기억 가능
        //---> 변수를 "배열"할 것
        //but 배열, 같은 타입만 담을 수 있음
        //---> "List, Map, Set" 등의 자료 구조 활용 / 여러 개, 다른 타입도 기억//
        //but 시간 개념이 없음
        //---> Session, Cookie(웹, 앱, 하이브리드 - 공유, 유지, 상태값 관리) "시간 조절"
        //DataSet(json, csv, xml 등의 데이터 분석)
        jFrame.setTitle(title);
        jFrame.setSize(500,300);
        jFrame.setVisible(true);//true -> 화면에 보임 / false -> 메모리에 로딩되나 보여지지 않음
    }
}
/*
코드의 양은 늘어나더라도 코드의 복잡도는 늘어나지 않게 해야 함.
반복되는 코드 사용은 지양 -> 한 번에 해결 필요
***import javax.swing.JFrame
 */