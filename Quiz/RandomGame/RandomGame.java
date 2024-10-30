package Quiz.RandomGame;

import java.util.Random;
import java.util.Scanner;

//단위 테스트, 통합 테스트를 하는 사람
//테스트 시나리오를 적어낼 줄 아는 사람

public class RandomGame {
    //com -> 멤버 변수이나 전역 변수가 아니기 때문에 main 에서 사용할 수 없다.
    int com = -1;//-1 -> end of file

    public RandomGame(){
        Random r = new Random();//
        nansuPrint(r);//nansuPrint의 인자로 r전달
        com = r.nextInt(10);
    }
    public void goGame(){
        System.out.println("0부터 9 사이의 숫자를 입력하시오");
        Scanner sc = new Scanner(System.in);
    }
    public void nansuPrint(Random r){
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(10));
        }
    }
    public static void main(String[] args) {
        RandomGame rg = new RandomGame();
        rg.goGame();
    }
}
