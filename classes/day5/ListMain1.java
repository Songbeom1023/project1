package classes.day5;
//변수 - 배열 - 객체 배열 - List - Map - Session, cookie
//배열에서 3차원 배열을 쓰지 않는 이유 : 3차원은 공간, 공간은 직관이 떨아짐
//-----> 리스트나 맵을 활용해서 대체할 수 있다 -> JSON, UI 가 지원하는 Dataset 객체 설계
import java.util.ArrayList;
import java.util.List;
//자바의 자료구조를 지원하는 컬렉션 프레임워크가 있다 : java.util

public class ListMain1 {
    public static void main(String[] args) {
        //인터페이스는 단독으로 인스턴스화할 수 없다 -> 반드시 구현체 클래스가 필요하다
        //List list = new List();
        List list2 = new ArrayList();//제네릭을 표현하지 않은 경우, 타입을 맞추어야 한다
        //제네릭을 사용하면 타입을 명시적으로 정해주므로 타입을 따로 맞추지 않아도 된다
        List<String> list3 = new ArrayList<>();
       // list2.add(0, "사과");
       // list2.add("파인애플");
        list3.add("사과");
        list3.add("파인애플");

      //  for (Object obj : list2) {
      //      System.out.println((String) obj);
      //  }
        //add 메소드는 오버로딩이 적용된 메소드이다.
        //맨앞에서부터 차례대로 채운다.
        for (String str : list3) {
            System.out.println(str);
        }

        }
    }

