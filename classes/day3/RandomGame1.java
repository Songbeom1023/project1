package classes.day3;

import java.util.Random;
//클래스 설계 시 멤버 변수로 할지 지역 변수로 할지를 결정할 수 있어야 한다.
//어떤 변수가 변하고, 어떤 변수가 고정되어 있어야 하는지에 대해 고민해볼 것.

public class RandomGame1 {
    //생성자 최대한 활용 -> 초기화
    //채번하기
    //1) 메소드로 구현
    //2) 생성자에서 하는 방법
    //-> 둘 중 재사용성이 우수한 쪽은 어디인가??? -> 사용자 정의 메소드.
    //-> 만일, 깊은 복사를 결정했다면 인스턴스화가 여러 번 발생된다는 것을 생각해야 함.
    //-> 즉, 주소번지가 바뀌게 되므로 같은 타입의 클래스가 동시에 heap 영역에 존재
    //-> 그때마다 새로운 숫자가 채번된다면 정답이 계속 바뀌어도 되는건가?
    //-----> 사용자 정의 메소드로 구현할 것
    //만일, 새 게임 버튼이 있다면???
    //-> 새 게임 버튼이 눌릴 때마다 채번하는 메소드가 호출되어야 함.
    //-> 화면을 그리는 것과 무관하게 독립적으로 처리되어야 함.
    public RandomGame1() {
    }
    //0~9 사이의 임의의 수를 채번하기
/*


    public String 판정(int userNumber) {
        String account = null;
        if (정답 < userNumber) {
            account = "낮춰라";
        } else if (정답 > userNumber) {
            account = "높여라";
        } else if (정답 == userNumber) {
            account = "정답";
        }
    }
 */
    public void nanSu() {
        Random rand = new Random();
        rand.nextInt(10);
        //정답은 게임이 유지되는 동안에 변하면 안 된다.
        //인스턴스변수로 변경한다는 것은 멤버 변수를 말하는 것이다.
        //-> 컴퓨터가 채번한 숫자는 멤버 변수로 설정해야 한다.
        //RandomGame1 rg1 = new RandomGame1(); -> 한 사람
        //RandomGame1 rg2 = new RandomGame1();
        //RandomGame1 rg3 = new RandomGame1();
    }

    public static void main(String[] args) {

    }
}
