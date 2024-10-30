package classes.day2;

public class Array11 {
    public static void main(String[] args) {
        //new 로 배열을 선언하면 아직 초기화가 되지 않았으므로 디폴트값을 가진다.
        boolean[] bs = new boolean[3];//기본값 false
        bs[0] = true;//재정의
        //반복되는 코드는 항상 옳지 않다. -> 개선할 수 있는 방법이 없나 고민해야 함.
        //아래 세 코드에서 중복되는 것들 -> 반복문을 떠올려야 함! "for"
        System.out.println(bs[0]);
        System.out.println(bs[1]);
        System.out.println(bs[2]);
        //for (선언 및 초기화 ; 조건식(true or false) ; 증감 연산자)
        //주의사항 : for 안에서 변수 선언을 한 경우, for 밖에서 그 변수에 접근할 수는 없음.
        //변수 중복 선언은 안 됨.
        int i;
        for (i =1;i<3;i++) {
            System.out.println("for문");
        }
        System.out.println(i);
        //조건식을 생략할 경우 무한 반복에 놓이게 된다.
        //-> 반복문은 항상 무한 반복에 대한 방지 코드를 고려
        //-> 무한 루프에 빠지면 그 다음 코드는 실행 기회를 가질 수 없음.
        //--------> for 사용 시 조건문을 반드시 확인해야 함!!!!!
    }
}
