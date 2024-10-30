package day6.variable;

import javax.swing.*;//JVM 이 자동으로 찾을 수 있는 패키지는 java.lang 뿐 -> import 해야 함.

public class NullPointer1 {
    public static void main(String[] args) {
        String s = null;
        //s 객체의 타입만 결정 -> 참조하는 실체가 없음. heap area 에 공간 할당받지 못함.
        //구현체 클래스에 의해 구현됨.
        //선언부 = 생성부 -> 분리 가능
        //선언부 : "타입" 생성부 : "클래스"

        System.out.println(s);//null 출력
        System.out.println(s.toString());//NullPointerException
        JFrame jf = null;
        //타입 선언만 된 것. -> 참조하는 실체가 없음. heap area 에 공간 할당받지 못함.
        //호출하려면 new 로 인스턴스화 해야 함.
        System.out.println(jf);//null 출력
        System.out.println(jf.toString());//NullPointerException
    }
}
