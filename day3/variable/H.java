package day3.variable;

public class H {
    public static void main(String[] args) {
        //int i = (int)"1";
        //char >byte > short > int > long > float > double
        //boolean
        //대입 연산자 오른쪽에 더 큰 타입이 왔습니다.
        int i = (int)3.14;
        System.out.println(i);//3
        double d = 3.14;
        System.out.println(d);//3.14
        //i = d;
        d = i;
        System.out.println(d);//3.14 -> 14번라인 다시 치환 -> 3
    }
}
