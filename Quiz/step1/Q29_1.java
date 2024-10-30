package Quiz.step1;

public class Q29_1 {
    int a1[],b1;//[]가 뒤에 있으면 []가 붙어있는 것만 배열
    int[]a2,b2;//[]가 앞에 있으면 그 뒤로 선언된 모든 변수가 배열
    public static void main(String[] args) {
        Q29_1 q = new Q29_1();
        System.out.println(q.a1+","+q.b1);
        System.out.println(q.a2+","+q.b2);
    }
}
