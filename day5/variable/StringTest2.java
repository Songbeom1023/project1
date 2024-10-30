package day5.variable;

public class StringTest2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1 = s1 + " World";
        //5번에서 생성된 주번아니라 새로운 주번이 할당
        //String 타입은 = 에 의해 값이 변화.
        System.out.println(s1 + "World");//HelloWorld
        System.out.println(s1);//Hello만 기억하고 있습니다.
        String s2 = "haha";
        s2.replace('h', 'j');
        System.out.println(s2);//haha --->
        //***** 왜??? "대입연산자"에 의해서만 값이 변경
        s2 = s2.replace('h', 'j');
        System.out.println(s2);//jaja
    }
}
/*
String은 연속된 문자열을 표현하는 클래스형 입니다.
클래스는 언제나 참조형
연속된 문자(char, Character)를 저장하는 메모리를 할당
위 데이터를 처리할 수 있는 각종 메소드 지원함(equals)
---------------------------------------
Java의 String은 immutable이다. - 불변객체
:변경 불가하다. 원본이 안바뀐다.
생각해 볼 문제
select문 처럼 여러 줄을 여러 단어를 길게 쓸 때 String을 쓰면
메모리 누수가 생기는 건 아닌가?
 */