package classes.day5;
class Parent2{
    Parent2(){
        System.out.println("Parent2");
    }
}
class Child2 extends Parent2{
    Child2(String str){
        System.out.println("Child2");
    }
}
public class PC2Main {
    public static void main(String[] args) {
       // Parent2 p2 = new Parent2();
        Child2 c2 = new Child2("hello");
        //Parent2 p3 = new Child2();
    }
}
/*
자손 클래스의 생성자가 호출될 때 부모 클래스의 생성자가 먼저 호출된다.
디폴트 생성자는 파라미터를 따로 정해주지 않아도 되니까 자동으로 제공할 수 있다.
파라미터가 있는 생성자를 호출하더라도 부모의 디폴트 생성자가 호출된다.
 */
