package classes.day3;
/*
개발자로서 디버깅 능력을 키울 것
 */
public class For4 {
    public static void main(String[] args) {
        for (;;) {
            System.out.println("Hello");
            if (1==1){
                System.out.println("if문 호출");
                break;}}//break -> 무한루프 방지
        System.out.println("여기");
    }
}
