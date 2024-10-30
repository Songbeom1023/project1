package classes.UI;
//클래스끼리 서로 인스턴스화를 하게 만드는 상황을 피하자.
//한 클래스를 다른 클래스에 주입한다고 생각하자.

public class A1 {
    A2 a2 = new A2();

public A1(){
    System.out.println("A1 디폴트 생성자 호출");
}

    public static void main(String[] args) {
        A1 a1 = new A1();
    }
}
