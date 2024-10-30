package tlak.step1;

//if 를 쓰는 경우 if 를 계속 쓰면 모든 경우를 다 따짐
//-> else if 를 사용해서 해당하는 경우 종료하도록 설정

public class IF2 {
    public static void main(String[] args) {
        int jumsu = 85;
        if (jumsu <= 100 && jumsu >= 90) {
            System.out.println("A학점");
        }
        else if (jumsu < 90 && jumsu >= 80) {
            System.out.println("B학점");
        }
        else if (jumsu < 80 && jumsu >= 70) {
            System.out.println("C학점");
        }
        else {
            System.out.println("F학점");
        }
        System.out.println("여기로 온다");
    }
}