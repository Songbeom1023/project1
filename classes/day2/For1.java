package classes.day2;

public class For1 {
    public static void main(String[] args) {
        int i;
        //for문에서 선언한 변수는 좌중괄호 우중괄호 안에서만 접근이 가능
        for(i = 0; i < 3; i++) {
            System.out.println(i);
        }
        System.out.println("i가 3이면 여기로 빠짐"+i);
    }
}
