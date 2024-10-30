package day4.variable;

class G{
    int i;
    static int j;

    void methodA(){
//        변수 i는 전역변수 이므로 G class 내부 어디든지 호출이 가능.
        System.out.println(i);//default 값인 0이 출력될 것
        System.out.println(j);
    }
}

public class GMain {
    public static void main(String[] args) {
        G g = new G();
        g.methodA();
        System.out.println(g.i);
    }
}
