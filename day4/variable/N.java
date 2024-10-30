package day4.variable;


public class N {
    void methodA(N n){
    System.out.println(n.toString());
}
    void methodB(String x){
        System.out.println(x.toUpperCase());
    }
    public static void main(String[] args) {
        N n = new N();
        n.methodA(n);
        String name = "Hello";
        n.methodB(name);
    }
}
