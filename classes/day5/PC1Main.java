package classes.day5;
class Parent1{
    Parent1(){
        System.out.println("Parent1");
    }
}
class Child1 extends Parent1{
    Child1(){
        System.out.println("Child1");
    }
}
public class PC1Main {
    public static void main(String[] args) {
       // Parent1 p1 = new Parent1();
        Child1 c1 = new Child1();
        //Parent1 p2 = new Child1();
    }
}
/*
자손 클래스의 생성자가 호출될 때 부모 클래스의 생성자가 먼저 호출된다.
 */
