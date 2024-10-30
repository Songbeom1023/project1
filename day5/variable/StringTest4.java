package day5.variable;

public class StringTest4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        //StringBuilder sb3 = "Hello";
        System.out.println("before : "+sb1);//Hello
        System.out.println(sb2);
        System.out.println(sb1 == sb2); //new 를 붙였기 때문에 깊은 복사 -> 주소번지 다름
        sb1.append("World");
        System.out.println("after : "+sb1);//HelloWorld
        //아래 코드의 경우 String타입의 클래스가 3번 만들어짐
        //String 으로 여러 문자열을 만들게 되면 불변객체라서
        //반드시 대입연산자로 추가된 문자열을 재정의해야 함- 두번째생성됨
        String query = "SELECT ename, empno";//1번
        System.out.println("query : "+query);//SELECT ename, empno
                    query = query + " FROM emp";//1번
        System.out.println("query : "+query);//SELECT ename, empno  FROM emp
                    query = query + " WHERE salary > 3000";//1번
        System.out.println("query : "+query);


        //StringBuilder  --> String 은 불변 객체이나 가변 객체로 변화시키는 것이 StringBuilder
        StringBuilder query1 = new StringBuilder();
        //.append -> "붙여쓰기"
        query1.append("SELECT ename, empno");
        query1.append(" FROM emp");
        query1.append(" WHERE salary > 3000");
        System.out.println(query1);
    }
}
