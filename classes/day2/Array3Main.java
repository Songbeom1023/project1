package classes.day2;

public class Array3Main {
    public static void main(String[] args) {
        int[][]a = new int[3][4];
        a[0] = new int[4];
        a[1] = new int[4];
        a[2] = new int[4];
        System.out.println(a[0]);//1차 배열을 참조하는 변수
        System.out.println(a.length);
        int row = a.length;
        int col = a[0].length;
        int col1 = a[1].length;
        int col2 = a[2].length;
    }
}
