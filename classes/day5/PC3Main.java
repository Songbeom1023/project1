package classes.day5;
class Parent3{
    Parent3(){
        System.out.println("Parent3");
    }

    Parent3(String str){
        System.out.println("Parent3(String)");
    }
    void m(){
        System.out.println("Parent3.m()");
    }
}
class Child3 extends Parent3{
    Child3(String str){
        System.out.println("Child3");
    }
    void m(){
        System.out.println("Child3.m()");
    }
}
public class PC3Main {
    public static void main(String[] args) {
        Parent3 p3 = new Parent3();
        p3 = new Child3("P3");
        p3.m();
        //Child3 c3 = new Child3("hello");
        Parent3 p = new Child3("hello");
        //자바에서는 생성부의 이름으로 객체가 생성되므로
        //p가 Parent3 타입이더라도 생성부에 있는 자손의 메소드가 호출된다.
        //이 경우 부모의 메소드는 쉐도우 메소드가 되어 호출되지 않는다.
        p.m();
    }
}
/*
자손 클래스의 생성자가 호출될 때 부모 클래스의 생성자가 먼저 호출된다.
디폴트 생성자는 파라미터를 따로 정해주지 않아도 되니까 자동으로 제공할 수 있다.
파라미터가 있는 생성자를 호출하더라도 부모의 디폴트 생성자가 호출된다.
 */
