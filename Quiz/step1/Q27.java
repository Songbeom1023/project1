package Quiz.step1;

public class Q27 {
    public static void parse(String str) {
        float f = 1;
        try {
            f = Float.parseFloat(str);
        } catch (NumberFormatException nfe) {
            f = 0;  //에러 : 데이터형이 선언되지 않았다. F변수는 try절 안에서만 선언되어 있다.
            //아래 문장이 실행되면 finally 를 작성했더라도, finally 는 실행 기회를 가질 수 없다.
            // System.exit(0);
        } finally {
            //예외가 발생하든 하지 않든 무조건 실행됨
            //-> 예외가 발생하더라도 무조건 실행되어야 하면 finally 에 작성할 것
            System.out.println(f);
        }
    }

    public static void main(String[] args) {
        //실수형을 초기화할 때 f 리터럴을 붙이지 않으면 double
        parse("3.14f");
    }

}
