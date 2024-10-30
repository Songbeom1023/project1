package Quiz.step1;

class Pass {
    int x = 1;

    public static void main(String[] args) {
        int x = 5;  //main에서 선언된 지역변수
        Pass p = new Pass();
        p.doStuff(p);
        System.out.print("main x = "+ p.x);
    }

    void doStuff(Pass p) {
        System.out.print("doStuff x =" + ++p.x);  //x를 증가시키기전에 출력한다.
    }
}

public class Q12 {
}
