package classes.day3;
//반복문 : for, while
//조건문 : if, switch, 삼항 연산자

/*
for
- 무한루프를 방지해야 함.
 */
public class For3 {
    public static void main(String[] args) {
        for (;;) {
            System.out.println("Hello");
        }//왜 아래 문장은 실행 안 됨?? -> for 가 "무한루프"에 빠지게 된다.
        //System.out.println("여기");
    }
}
