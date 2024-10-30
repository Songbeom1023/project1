package day4.variable;

public class H {
    int i = 1;//Global variable(=member variable = 전역변수)
    public static void main(String[] args) {
        //인스턴스화를 3번 하였으므로 H 타입의 클래스가 세 개 생성된 것.
        //아래 세 개의 객체는 heap area 에 상주.
        //인스턴스화 : 재사용을 위해 heap area 에 저장
        H h1 = new H();
        //전역변수는 인스턴스 변수에 따라 서로 다른 값을 가질 수 있음.
        h1.i = 2;
        H h2 = new H();
        h2.i = 3;
        H h3 = new H();
        h3.i = 4;
        System.out.println(h1 + "," + h1.i);
        System.out.println(h2 + "," + h2.i);
        System.out.println(h3 + "," + h3.i);
    }
}
