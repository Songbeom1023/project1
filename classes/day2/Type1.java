package classes.day2;
//자료구조를 사용하는 경우 모두 Object 단위로 읽고 쓸 수 있다.
//-> 타입을 맞추어야 한다.
//-> 이를 개선하기 위해 제네릭이나 형 전환이 필요
public class Type1 {
    public static void main(String[] args) {
        String msg = "오늘 스터디할까";
        Object obj = msg;
        Object obj1 = new String();
        Object obj2 = msg;
        String msg2 = (String) obj2;
        System.out.println(msg2);
        //메신저 프로젝트 - 문자열 처리와 관련된 API 활용
    }
}
