package classes.day5;
/*
인스턴스화에서 선언부와 생성부의 타입이 다른 경우
1) 부모에는 없는데 자손에는 있는 메소드 n() 추가
2) 테스트 시나리오
- Parent p1 = new Parent(); : 기본
- Parent p2 = new Child(); : 부모타입과 생성자 타입이 다른 경우 -> 다형성이 가능
**자바의 특징 : 재사용성과 이식성
- p1.n();
- p2.n();
-----> 관찰 포인트 : 부모 타입에는 없는 메소드를 자손타입에서 호출할 수 있는가?
-----> 부모에도 있고, 자손에도 있는 메소드를 호출한다면 어디에 있는 메소드가 호출될 것인가?
 */
class Parent4{
    Parent4(){
        System.out.println("Parent4");
    }

    Parent4(String str){
        System.out.println("Parent4(String)");
    }
    void m(){
        System.out.println("Parent4.m()");
    }
}
class Child4 extends Parent4{
    void m(){
        System.out.println("Child4.m()");
    }
    void n(){
        System.out.println("Child4.n()");
    }
}
public class PC4Main {
    public static void main(String[] args) {
        Parent4 p4 = new Parent4();
        p4.m();
        //부모 타입으로 선언된 변수로 자손 클래스의 메소드 호출은 불가하다.
        //상속을 받은 경우 자손클래스를 활용할 때 더 많은 변수와 메소드를 누릴 수 있다.
        Child4 c4 = new Child4();
        c4.m();
        c4.n();
        //객체 생성 시 주의사항 : 사이드 이펙트를 피해야 한다.
        //**사이드 이펙트 :
        //선언부의 타입과 생성부의 타입이 다른 경우, 다형성을 누릴 수 있다.
        //구현체 클래스 변수명 = new 구현체 클래스();
        //인터페이스 변수명 = new 구현체 클래스();
        //추상 클래스 변수명 = new 구현체 클래스();
        Parent4 p1 = new Child4();
        p1.m();
        //p1.n(); -> 실제로 생성된 클래스는 Child4 이지만, 타입이 부모 타입이면 자손에 선언된 메소드는 호출이 불가하다.
    }
}
/*
자손 클래스의 생성자가 호출될 때 부모 클래스의 생성자가 먼저 호출된다.
디폴트 생성자는 파라미터를 따로 정해주지 않아도 되니까 자동으로 제공할 수 있다.
파라미터가 있는 생성자를 호출하더라도 부모의 디폴트 생성자가 호출된다.
 */
