package day2.variable;

import java.util.Scanner;

public class Scanner1 {
    //사용자 정의 메소드
    //제공되는 메소드가 아닌 같은 이름의 메소드를 선언
    String next() {
        return "안녕";
    }
    int nextInt() {
        return 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner1 scanner1 = new Scanner1();
        int a = scanner1.nextInt();
        System.out.println("안녕");//변수가 아닌 문자열 상수를 사용
        System.out.println(a);
        System.out.println(scanner1.next());
    }
}
