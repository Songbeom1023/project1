package day7.variable;

public class M1 {
    public M1(){
        System.out.println("M1 디폴트 생성자");
        //생성자는 클래스 이름을 적는다.
        //생성자는 반환 타입이 없다.
        //생성자는 인스턴스화할 때 호출된다.
        //디폴트 생성자는 파라미터가 없다 -> JVM 이 알아서 처리해준다
        System.out.println(this);
    }

    public static void main(String[] args) {
        M1 m1 = new M1();
        String s1 = new String("Hello");
        System.out.printf("%s,%s\n",s1,m1);
        m1 = null;
        System.out.println("M1"+m1);//null
        //m1.toString();//예외(Exception-디버깅, 문제 해결)가 발동하면 프로그램이 멈춤
        m1 = new M1();
    }
}
