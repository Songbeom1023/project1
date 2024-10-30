package classes.UI;

public class B1 {
    B2 b2 = new B2(this);
    //this 사용의 의미 : B2 클래스에 자신의 주소를 전달

    public B1(){
        System.out.println("B1 디폴트 생성자 호출");
    }

    public static void main(String[] args) {
        new B1();
    }
}
