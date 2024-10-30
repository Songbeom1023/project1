package Quiz.step1;

public class Q35 {
    public static void main(String[] args) {
        //선언부와 생성부에 다른 타입이 올 수 있다.
        //선언부와 생성부가 다를 때, 다형성이 성립된다.
        Object ob = new String("Hello");
        System.out.println(ob);
        ob = new int[3];
        System.out.println(ob);
        //Object 타입에 원시형 타입을 담을 수 있다. "오토박싱"
        ob = 3;
        System.out.println(ob);
    }
}
