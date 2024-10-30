package classes.day3;
//변수 scope(범위) 이슈
//내가 선언한 위치의 변수가 어디까지 영향을 미치는가.
//멤버 변수 / 전역 변수 / 지역 변수 -> 클래스 설계를 한다 = 변수(리턴타입, 파라미터 포함) 설계 + 메소드 설계 + 생성자 설계
//
public class For5 {
    public static void main(String[] args) {
        int i;
        for (i=2;i<=10;i=i+2) {
            System.out.println(i);
        }//for 외부에서 변수 i에 대해 접근하려면 for 외부에서 i에 대해 선언해야 한다.
    }
}
