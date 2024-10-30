package day5.variable;

import java.io.PrintWriter;
import java.util.Scanner;

public class StringTest5 {
    public static void main(String[] args) {
        String mem_id = "tomato";
        String user_id = "tomato";
        //파라미터에 System.in은 로컬 컴터에서 입력받은 값을
        //기다리게 됩니다.
        System.out.println("아이디를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        user_id = sc.next();
        System.out.println("비번을 입력하세요.");
        System.out.println("사용자가 입력한 아이디는 "+user_id + " 입니다.");
        /*
        문자열 변수에 저장돼 있는 건 값이 아니라 메모리 주소이다.
        따라서 ==가 비교하는 대상은?
        주소를 비교
        그 주소에 있는 실제 문자열을 비교하는게 아님.
         */
        if(mem_id == user_id){//주소번지가 같니?
            //실행문이라고 하면 조건을 만족하지 않으면 단 한 번도 실행이 안됨.
            //조건을 실행문 보다 먼저 따지므로 조건이 false이면 한번도 실행이 안됨
            //참일 때만 if문 좌중괄호 우중괄호에 문장이 실행됩니다.
            System.out.println("주소번지가 같다.");
        }
        else{//if문의 괄호안에 조건을 수렴하지 않으면 그 때 실행됨.
            System.out.println("주소번지가 달라요.");
        }
        if(mem_id.equals(user_id)){//아이디 중복검사라고 가정하면.....
            System.out.println("당신이 입력한 아이디 "+user_id+"는 사용할 수 없습니다.");
        }
    }
}
