package day5.variable;

public class StringTest1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s1 == s2);//true
        System.out.println(s3 == s4);//false
        //s1이 가리키는 "Hello"문자열과 s2가 가리키는 "Hello"문자열이
        //**** ==는 "주소번지"가 같은가??
        //**** .equals 는 "값"이 같은가??
        //같니? -> 응 같아 -> true가 출력됨
        System.out.println(s1.equals(s2));//문자열값이 같은지 물어본다. true
        System.out.println(s3.equals(s4));//문자열값이 같은지 물어본다. true
        System.out.println(s2.equals(s4));//true
        System.out.println(s2==s4);//false - s2의 주소번지와 s4의 "주소번지가 같니?"
        //s1과 s2의 주소번지는 같다.
        System.out.println(s1==s4);//false
        //String 객체를 만들때 new 를 사용하지 않으면(유일하게 원시형처럼초기화가능)
        //기존에 같은 문자열이 메모리에 있는지 없는지 체크하고
        //만일 있다면 새로운 문자열을 생성하는 것이 아니라 기존에
        //주소번지를 갖는다.(하나를 공유함 - 얕은 복사임)
        System.out.println(s1==s2);//true
    }
}
