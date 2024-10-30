package day5.variable;

public class Y {
    public static void main(String[] args) {
        Y y = new Y();//
        System.out.println(y);
        y = null;//
        //insert here - null출력
        System.out.println(y);
        y = new Y();//
        System.out.println(y);
    }
}
