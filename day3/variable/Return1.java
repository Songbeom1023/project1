package day3.variable;

import java.util.SplittableRandom;

public class Return1 {
    void hap(int i, int j){
        int result = i+j;
        System.out.println("hap() : 9번라인 "+result);
    }
    int hap1(int i, int j){
        return (i+j);
    }
    String hap2(int i, int j){
        return (i+j+"");
    }
    String hap3(int i, int j) {
        return (i + j + "");
    }
    public static void main(String[] args) {
        Return1 r = new Return1();
        r.hap(1,2);
        System.out.println(r.hap1(3,4));
        /*
        print 라는 () 안에서 hap 이라는 메소드를 호출할 수 있음.
        -> 메소드 안에서 또다른 메소드를 호출할 수 있음.
        -> 단, return 타입이 void 인 경우, 반환되는 값이 없기 때문에 호출할 수 없음.
         */
        String dap = r.hap2(1,2);
    }
}
