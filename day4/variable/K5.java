package day4.variable;

public class K5 {
    //선언부
    int a;
    int speed;

    //생성자
    public K5(){//생성자 선언
        speed = 0;
        System.out.println("K5 디폴트 생성자 입니다.");
    }

    //사용자 정의 메소드
    public void speedUP(){
        //지변이라 안 됨
        speed = speed + 1;
        //전변이라 됨
        a = a +1;
    }
    //static 블록
    static {
        //K5 가 전시장에 전시되어 있는 상태.
        //"상태"를 다루는 것이 변수
        int speed;
        System.out.println("static 블록이 호출되었습니다.\n그러면 main 메소드보다 먼저인가?");
    }//////////end of static

    //메인 메소드
    public static void main(String[] args) {//entry point!!! but, static 블록이 있다면 static 이 먼저
        System.out.println("main 메소드가 호출되었습니다.");
        K5 k5 = new K5();//생성자 호출
    }/////////end of main 메소드
}/////////////end of K5
