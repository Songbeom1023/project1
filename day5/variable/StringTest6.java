package day5.variable;

import java.util.Scanner;

public class StringTest6 {
    public static void main(String[] args) {
        String mem_id = "kiwi";
        String user_id = null;
        Scanner sc = new Scanner(System.in);
        user_id = sc.next();//재치환될때 새로운 주소번지가 할당됨
        System.out.println(mem_id == user_id);//false
    }
}
