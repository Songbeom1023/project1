package day7.variable;

import day4.variable.N;

public class N1 {
    void methodA(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        N1 n1 = new N1();
        System.out.println(n1);
        n1.methodA();
    }
}
