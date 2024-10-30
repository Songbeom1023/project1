package day5.variable;

public class Parameter1 {
    public A methodA(){
        return new A();
    }
    public static void main(String[] args) {
        Parameter1 p = new Parameter1();
        System.out.println(p.methodA());//A클래스의 주소번지가 출력됨.
    }
}
