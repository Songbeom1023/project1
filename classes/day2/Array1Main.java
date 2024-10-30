package classes.day2;
class Array1{
    //원시형 타입의 1차 배열
    //is.length -> 배열의 길이를 반환 = 원소 개수 반환 -> 3
    //int -> 초기값 = 0, is[0] = 0, is[1] = 0, is[2] = 0
    // []가 있으면 배열
    int is[] = new int[3];

}
public class Array1Main {
    Array1 a = new Array1();
    void print1(){
        for(int i=0;i<a.is.length;i++){
            System.out.println(a.is[i]);
        }
    }
    public static void main(String[] args) {
        Array1Main a1m = new Array1Main();
        a1m.print1();
    }
}
