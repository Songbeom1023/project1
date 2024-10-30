package classes.UI.combo;

import java.util.Vector;
class A {}
public class List2Main {
    public static void main(String[] args) {
        Vector<A> v = new Vector<>();
        v.add(new A());
        v.add(new A());
        v.add(new A());
        v.size();
        for (A a : v) {
            System.out.println(a);
        }
        A a = v.get(0);
        //15번 a는 candidate 상태에 빠진다. -> garvage collector
        //System.gc(); -> candidate 상태에 있는 값들을 회수 요청.
        a = new A();//15번에서 참조하던 객체와 연결 고리를 끊고, 새로운 객체를 참조
        A a1 = v.get(1);
        A a2 = v.get(2);
        System.out.println(a == v.get(0));
        System.out.println(a1 == v.get(1));
        System.out.println(a2 == v.get(2));
    }
}
