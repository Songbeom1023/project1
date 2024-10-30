package day4.variable;

class Param{
    int i;
}
public class TestParam {
    void effectParam(Param p) {//**구현, 선언이기 때문에 "타입을 적어주어야 함"** /

        ///여기서 파라미터 자리에 온 Param p 는 변수 p에 대한 선언과 같다고 보아도 되는가???

        p = new Param();//Parma 클래스가 하나 더 생김!새로운 객체 p 생성
        p.i = 100;
        System.out.println("sub i는" + p.i);
    }
    public static void main(String[] args) {
    TestParam tp = new TestParam();
        Param p = new Param();
    p.i = 500;
    tp.effectParam(p);//p에 대한 주소번지를 매개 변수로 넘길 수 있음. 14번에서 객체화가 되었으니까 -> !!**호출할 때는 타입을 적지 않음**!!
        System.out.println("main i는" + p.i);
    }
}

/*
null = 모름.
Param p = null; -> 타입을 선언만 하는 것과 같음.
p = new P(); -> 이 경우 선언과 초기화 분리가 가능하듯, 타입은 선언한 후 초기화만 한 것과 같음.
인스턴스화를 하는 경우, 다른 class 에 선언된 변수(전역변수)를 사용할 수 있는데 이 경우 "주입"했다고 말할 수 있음.
-> static 타입의 변수는 인스턴스화하지 않고 가져올 수 있음.
**지역변수는 stack area 에 거주하고 있기 때문에!!(automatic variable 이니까!!)
**지역변수는 값에 의한 호출
**메소드 선언과 호출(값만 주면 됨) 구분
 */


/*
 * main의 i와 sub의 i가 같은 값을 출력하고 있다.
 * 왜냐면 21번 라인에서 사용자 정의 메소드 effectParam()호출 할때
 * 19번에서 인스턴스화 된 주소번지(원본이다.)를 파라미터로 넘겨주었다.
 * 참고 : 얕은복사(주소번지가 같다, 하나다. 원본이다.)와 깊은복사(복사본이 만들어진다. 두개다. 타입은 같다. 복제본이다.)
 * 이 예제에서는 main메소드에서 500이었지만 main에서 출력전에 effectParam 먼저 호출했다.
 * 파라미터로 얕은 복사 즉, main에서 생성된 p의 주소번지를 넘겼다.
 * 그 메소드내부에서 i값을 다시 p.i=100으로 변경하였다. (원본이 바뀌는 것)
 */
