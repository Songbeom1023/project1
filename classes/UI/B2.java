package classes.UI;

public class B2 {
    B1 b1 = null;
    //현재 b1에 새로운 객체를 부여하게 되면, b1이 깊은 복사를 해 클래스 B1의 참조 주소를 가져올 수 없게 됨.
    //따라서, b1을 멤버 변수로 두고, 선언만 하게 됨.

public B2(B1 b1){
    System.out.println("B2 디폴트 생성자 호출");
    this.b1 = b1;
    //여기서 this : B2
    /*
    this.b1 = b1; 의미
    - 클래스 선언부에서 "멤버 변수로 선언된 b1"이 B1 클래스에서 전달받은 인자 b1, 즉 B1 클래스의 주소를 계속 참조하게 하기 위해서
      멤버 변수 b1에 B1 클래스의 주소를 대입
      -> 이렇게 하게 되면 멤버 변수 b1은 B1 클래스에 접근할 수 있게 됨.
         인스턴스화를 하지 않는 한 멤버 변수 b1은 계속해서 B1 클래스와 연결되게 됨.
     */
}
    public static void main(String[] args) {

    }
}
