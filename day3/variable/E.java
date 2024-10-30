package day3.variable;

public class E {
    int x;
    void hap(int i, int j){
        System.out.println(x);
        System.out.println(i+j);
    }

    public static void main(String[] args) {
        E e = new E();
        System.out.println(e.x);
        e.hap(1,2);
    }//main 메소드가 entry 지점. 따라서 12번이 가장 먼저 출력되고, 이후 6번, 13번에서의 hap 호출로 인해 7번 값이 출력됨.
}
