package Quiz.step1;
//& : 앞 뒤 조건 둘 다 true 일 때만 true
//&가 하나 있을 때와 두 개 있을 때의 차이
//1) &&
//- 조건 1이 False 이면 주건 2를 굳이 따지지 않음.
//2) &
//- 조건 1이 False 여도 조건2를 따짐.

public class Q3_1 {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        if ((++i == j) & (++i < j--)) {  //x=4 가 아니므로 false -> 출력되지 않음.
            //++i = 2, j-- = 1
            System.out.print("참일 때 : " + i + ",j : " + j);
        } else {
            System.out.print("거짓일 때 : i : " + i + ",j : " + j);
        }
        //
    }
}