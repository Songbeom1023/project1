package classes.day3;

import java.util.Random;
import java.util.Scanner;

public class RandomGame2 {
    int com = -1;

    //위치와 초기화!!!!!!!!!!!!!!!!!!!!!!!!!
    //채번하는 메소드를 생성자에서 호출하지 않는다.
    //-> 메소드에 재사용성이 떨어지기 때문.
    //-> 생성자가 호출될 때 함수도 호출되므로, 생성자만 호출하고 싶은데 메소드까지 호출되어 채번이 바뀌게 됨.
    public RandomGame2() {
    }

    public void init(){//초기화, 새게임
        nanSu();
    }

    //메소드 설계에서는 파라미터 타입과 개수를 설정해야 함.
    //리턴 타입도 결정해야 함.
    //userNumber -> 게임 중 입력값이 계속 변함 -> 지역 변수
    public String account(int userNumber) {
        String result = null;
        if (com < userNumber) {
            result = "낮춰라";
        }else if (com > userNumber) {
            result = "높여라";
        } else if (com == userNumber) {
            result = "정답";
        }return result;
    }

    public void nanSu() {
        Random rand = new Random();
        //com 숫자는 게임이 진행되는 동안 변하면 안 됨 -> 멤버 변수
        com = rand.nextInt(10);
    }

    public static void main(String[] args) {
        RandomGame2 rg = new RandomGame2();
        System.out.println("0~9 사이의 숫자를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int userNumber = -1;
        for(int i = 0; i < 3; i++){
            userNumber = sc.nextInt();
            String result = rg.account(userNumber);
            System.out.println(result);
            if (i==2){
                System.out.println("3번의 기회를 모두 사용하였습니다. 정답은 "+rg.com+"입니다.");
                return;
            }
        }if (sc!=null){
            sc.close();
        }
    }
}
