package day4.variable;

class Member{
    int age;
    static String name;
    String address;
}
/*
세 개의 변수 중에서 name 앞에만 static 을 붙임.
-> age, address 는 모두 다른 값을 쥐고 있는데 static 이 추가된 변수 name 은 m1, m2, m3 가 서로 다른 주소 번지를 가지고 있음에도 불구하고,
 같은 값인 Tiger 를 출력하였음.
 */
public class MemberMain {
    public static void main(String[] args) {
        Member m1 = new Member();
        m1.age = 20;
        m1.name = "John";
        m1.address = "서울시 금천구 가산동";

        Member m2 = new Member();
        m2.age = 30;
        m2.name = "Scott";
        m2.address = "서울시 마포구 공덕동";

        Member m3 = new Member();
        m3.age = 40;
        m3.name = "Tiger";
        m3.address = "서울시 영등포구 당산동";

        System.out.println(m1.age+" "+m1.name+" "+m1.address);
        System.out.println(m2.age+" "+m2.name+" "+m2.address);
        System.out.println(m3.age+" "+m3.name+" "+m3.address);
    }
}
