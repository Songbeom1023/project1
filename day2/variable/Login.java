package day2.variable;
/*
변수 선언 하기 : 타입(int, String) 변수명
변수 초기화 하기
1) 타입을 적지 않음(타입을 적는 것은 변수 선언의 경우) / 자바에서는 변수 선언과 초기화를 분리해서 작성할 수 있다
2) 주의사항 : 허용되는 것과 허용되지 않는 것을 구분할 수 있어야 함. = 컴파일 타입 에러를 찾아야 함. **디버깅의 첫단추**
**syntax 타입 변수명 =
**전역변수는 class 선언 후 선언.
**전역변수는 변수 선언과 초기화 분리 안 됨.
대입연산자 : 오른쪽에 있는 값(원시형 타입)을 왼쪽에 대입.
-> 부르면 값이 출력됨
3) 원시형 타입 vs 참조형 타입(주소번지 - RAM - stack, heap)
 */
public class Login {
    //프로그래밍이란? 입력(변수) - 처리(메소드/제공되는 메소드(JVM), 사용자가 정의하는 메소드(직접 정의)) - 출력
    //선언부 : 변수(명사형) 선언, 메소드(동사형) 선언
    //Login 시 파라미터의 필요 개수? 두 개
    //아이디 중복 검사 : boolean -> if "기준" -> True/False // 파라미터 하나만 필요
    //아이디 중복 검사의 결과 = 판정(사용가능 or 불가능) / use boolean for 판정
    boolean isIDCheck(String mem_id){
        return false;
    }
    String loginAction(String mem_id, String mem_pw){
        return "토마토";
    }


    public static void main(String[] args) {
        //mem_id는 변수명
        String mem_id = "tomato";
        mem_id = "kiwi";//id가 재정의됨.
        String mem_pw = "123";

    }
}
