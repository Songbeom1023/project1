package classes.day1;

import day3.variable.F;

//
public class FrameMain {
    //다음 주부터는 가능하면 main 메소드 안에서 코딩하는 것을 줄여나갈 것.
    //main 메소드는 entry point -> static{}을 제외하면 가장 먼저 실행되는 메소드 -> main thread 라고도 함.
    //main 메소드는 개발자인 내가 직접 호출할 수 없음.
    public static void main(String[] args) {
    Frame2 f2 = new Frame2();
    Frame2 f22 = new Frame2("22");
    f2.initDisplay();
    }
}
