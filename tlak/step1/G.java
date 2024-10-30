package tlak.step1;

public class G {
    //모든 클래스의 부모가 Object 클래스이므로 대입연산자 오른쪽에 더 큰 타입이 온다면 컴파일 오류가 일어날 것
    // -> 그래도 하고 싶다면 casting 연산자를 쓰면 됨.
    public static void main(String[] args) {
        String s= "Hello";
        Object obj = "World";
        obj = s;//Object 가 더 큰 타입이니 대입연산자의 왼쪽에 와야 함!!!
        s = (String) obj;//캐스팅 연산자 사용
        System.out.println(s);
    }
}
