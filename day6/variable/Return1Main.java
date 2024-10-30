package day6.variable;
/*
관전 포인트
- 리턴 타입 : int, double, String + Sub1(클래스) -> this
 */
class Sub1{
    //Deprecated 출력 -> 실행은 되나 앞으로는 더 이상 지원하지 않을 수 있으니 가능하면 사용하지 말란 경고.
    //같은 위치인데 static 이 있으면 전역 변수(Global) - 하나, 공유
    int i = 1;//non-static -> 멤버(Member) 변수(인스턴스화를 하고 사용하는 변수)
    void methodX(){
        //**멤버 메소드 -> 인스턴스.methodX() 로 호출 가능하므로
        System.out.println(i);
    }///////end of methodX
}/////////////end of Sub1
public class Return1Main {
    int methodA() {
        return 1;
    }

    double methodB() {
        return (double) 2;
        //return 2L;
        //return 은 가장 마지막에 작성. return 뒤에는 아무것도 쓸 수 없음.
        //if 안에서도 사용됨.
    }

    String methodC() {
        return "Hello";
    }

    Sub1 methodD() {
        return new Sub1();
    }

    Sub1 methodE() {
        Sub1 sub = new Sub1();
        return sub;
    }
    public static void main(String[] args) {
        Return1Main m = new Return1Main();
        System.out.println(m.methodA());
        System.out.println(m.methodB());
        System.out.println(m.methodC());
        System.out.println(m.methodD());
        //sub1과 sub2의 주소번지는 같은가??
        Sub1 sub1 = m.methodD();
        System.out.println(sub1.i);
        Sub1 sub2 = m.methodE();
        sub2.i = 10;
        System.out.println(sub2.i);
        if(sub1 == sub2) System.out.println("같다");
        else System.out.println("다르다");//다르다
        if(sub1.equals(sub2)) System.out.println("같다");
        else System.out.println("다르다");//다르다
        //왜 다른가? 깊은 복사!! -> 즉, 복제본이 만들어졌음.
        //복제본을 쉽게 만들기 위해 "class"를 선언함.
        //같은 타입이지만 "서로 다른 객체" -> 똑같이 i를 출력하더라도, 어떤 때는 1을, 어떤 때는 10을 출력할 수 있다.
        //다른 사람들의 주문을 구분할 수 있고, "서로 다른 상태값을 유지"하는 것.
        //조건문에서 실행문이 한 줄이면, 좌중괄호우중괄호를 생략할 수 있다.
    }
}//end of
