package day3.variable;

public class D {
    //i는 전역변수이면서 static
    static int i;//전역변수 선언
    //j는 전역변수이면서 non-static
    int j=2;
    public static void main(String[] args) {
        System.out.println(i);
        D d = new D();
        System.out.println(d.j);
        d.j =3;
    }
}
