package day5.variable;

public class Oper1 {
    public static void main(String[] args) {
        Oper1 o1 = new Oper1();
        System.out.println(o1);//주소번지 출력됨
        int i = 1;
        int j = i + 2;//1+2=3이 j변수에 초기화 됩니다.
        System.out.println(j);//3
        j+=2;// j= j+2; += 먼저 앞에 변수와 뒤에 2를 더하고 대입하세요.
        //insert here - 5출력된다.
        System.out.println(j);//5
    }
}
