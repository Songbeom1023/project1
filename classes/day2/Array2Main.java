package classes.day2;
//배열은 한 번 선언하면 크기가 고정
//같은 타입만 담을 수 있어서 문자와 숫자를 같은 로우에 담을 수 없음.

public class Array2Main {
    public static void main(String[] args) {
        int[][] is = new int[2][3];
        for (int i = 0;i<is.length;i++){
            for(int j = 0;j<is.length;j++) {
                System.out.println("is["+i+"]["+j+"] = "+is[i][j]);
            }//inner for
        }//outter for
    }//main
}//Array2Main
