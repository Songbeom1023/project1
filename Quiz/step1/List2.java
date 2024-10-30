package Quiz.step1;

import java.util.ArrayList;
import java.util.List;

class A{

}
public class List2 {
    public static void main(String[] args) {
        List<A> list = new ArrayList<>();
        System.out.println(list.size());
        A a = new A();
        list.add(a);
        a = new A();
        list.add(a);
        a = new A();
        list.add(a);
        System.out.println(list.size());
        //자료구조 안에 있는 모두를 다 출력할 때는 개선된 for 사용
        for(A a1 : list){//개선된 for : 제네릭 타입/자료구조
            System.out.println(a1);
        }
    }
}
