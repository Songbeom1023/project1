package day5.variable;

public class StringTest3 {
    public static void main(String[] args) {
        //String은 클래스 중에서 유일하게 new사용하지 않고도
        //객체를 만들 수 있다.
        String s1 = "Hello5";
        String s2 = "Hello";
        System.out.println(s1 == s2);//false  --> 주소번지가 같아??
        System.out.println(s1.equals(s2));//false  --> 값이 같아??
    }
}
