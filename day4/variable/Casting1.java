package day4.variable;

public class Casting1 {
    public static void main(String[] args) {
        int i = 1;//실수형
        double pi = 3.14;//정수형
//        pi는 실수형을 담는 변수명이기에, 정수를 담는 변수 i에 3.14를 담을 수 없다.
//        그런데, 꼭 그렇게 하고 싶다면 Casting 연산자를 사용하면 된다.
//        Casting 연산자 -> 형 전환 연산자
//        i = pi; -> 오류. 대입연산자 오른쪽에 왼쪽 보다 더 큰 타입이 위치했기 때문.
//                -> Casting 연산자를 사용.
        i = (int)pi;
        System.out.println(i);//1-> 3.14 -> 3
    }
}
