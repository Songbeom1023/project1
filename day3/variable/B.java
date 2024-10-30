package day3.variable;

public class B {
    public static void main(String[] args) {
        int i = 1;
        double avg = 0.5;
        i = (int)avg;
        //처음에 i는 1이었지만, 7번 라인에서 int 로 강제 형전환이 되었으므로 실수 0.5는 담을 수 없다.
        //그럼에도 불구하고, 꼭 담고 싶다면 "0만" 담을 수 있다.
        System.out.println(i);
        avg = i;
        System.out.println(avg);
    }
}
