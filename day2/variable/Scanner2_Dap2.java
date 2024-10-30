package day2.variable;
/*
에러의 두 가지 종류
1) Compile Error -> .class 파일이 만들어지지 않음 -> 실행할 수 없음.
2) Run Time Error ->
 */
import java.util.Scanner;

public class Scanner2_Dap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //명령 프롬프트 화면(터미널)에서 사용자가 입력한 값을 읽어올 수 있음.
        System.out.println("0부터 9사이의 숫자를 입력해줘.");
        int input = scanner.nextInt();
        System.out.println("첫 번째 입력받은 숫자 : "+input);
        System.out.println("한번 더 0부터 9사이의 숫자를 입력해줘.");
        int second = scanner.nextInt();
        System.out.println("두 번째 입력받은 숫자 : "+second);
        System.out.println("두 수의 합은 : "+ (input + second));
    }
}
