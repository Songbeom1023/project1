package Quiz.step1;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class List1 {
    public static void main(String[] args) {
        //List -> 인터페이스 -> 구현체 클래스를 가지고 있음.
        //즉, 인터페이스는 추상 메소드만 가지고 있어서 오른쪽에 사용 불가
        //-> 반드시 구현체 클래스가 와야 함.
        //-> 구현체 클래스가 추상메소드를 구현
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list instanceof ArrayList<String>);
        List<String> list2 = new ArrayList<>();
        System.out.println(list2 instanceof ArrayList<String>);
        System.out.println(list2 instanceof List<String>);
        List<String> list3 = new Vector<>();
    }
}
