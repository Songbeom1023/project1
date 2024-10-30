package day3.variable;

public class A {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        a = null;
        System.out.println(a);
        a = new A();
        System.out.println(a);
        //인스턴스화를 두 번 하게 되면 객체가 두 개 생성, 객체의 주소번지는 다름
    }
}
