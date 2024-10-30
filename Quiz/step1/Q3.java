package Quiz.step1;

public class Q3 {
 public static void main(String [] args) {
            int x =5;
            boolean b1 = true;//
            boolean b2 = false;
            //&& = 그리고
            //-> 참참 일 때만 결과가 true
            if((x==4) && !b2){  //x=4 가 아니므로 false -> 출력되지 않음.
                System.out.print("1");
            }  //참일 때 실행
            System.out.print("2");  //if 문의 {}가 없어, if 조건에 상관없이 출력
            if ((b2 == true) && b1){
                //b2 = true 이면 false -> true 값 대입하여 true, b1도 true!!!!!!!!!!!!!!!!!!!
                //b2 == true 이면 b2는 false 이므로 맞지 않음
               System.out.print("3");  //참일 때 실행 : 20번 행의 결과가 참이므로 실행됨
          }
 }
    //What is the result?//
    //A. 2
    //B. 3
    //C. 1 2
    //D. 2 3
    //E. 1 2 3
    //F. Compilation fails.
    //G. Au exceptional is thrown at runtime.

}
