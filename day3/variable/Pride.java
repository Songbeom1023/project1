package day3.variable;
//Object 클래스
//- 모든 클래스의 부모 클래스 -> 모든 클래스는 원하지 않아도 Object 를 상속받고 있음.
//- Pride 클래스 타입을 인스턴스화하면, 부모 클래스인 Object 가 제공하는 toString 이라는 method 를 호출할 수 있음.
public class Pride extends Object{

    public static void main(String[] args) {
        Pride herCar = new Pride();
        //herCar 는 인스턴스화에서 선언된 변수이므로 인스턴스 변수라고 한다.
        //herCar 를 이용해서 변수나 메소드를 호출할 수 있다.
        //이때, 호출할 수 있는 변수는 전역변수만 가능하다.
        //현재 Pride.java 소스 파일 안에는 전역변수가 없어서 호출할 수 없다.
        //그러나, toString 이라는 메소드는 재정의 하였다.
        //-> 호출하면 부모 클래스가 제공하는 toString() 이 호출되는 것이 아니라 Pride.java 안에서 구현한 메소드가 호출된다.
        //이 코드에서는 toString 메소드가 구현되어 있어서 주소번지가 출력되지 않고, "나는 프라이드 자동차"가 대신 출력된다.
        System.out.println(herCar);
        System.out.println(herCar.toString());
    }
}
