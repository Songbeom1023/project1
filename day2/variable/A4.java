package day2.variable;

public class A4 {
    //선언부
    //여기에서 선언하는 변수는 전역변수
    int i;//전역변수. 초기화하지 않으면 default 값 = 0

    //사용자 정의 메소드 선언

    //main 메소드 : 가장 먼저 실행
    //main 메소드가 있으면 exe 파일을 만들 수 있음. (= 배포했을 때 실행해볼 수 있음)
    public static void main(String[] args) {
    //이 안에서 선언하는 변수는 모두 지역변수
        int i;//지역변수
        //println() 안의 i는 호출(사용)
        //선언 후 초기화를 두 줄로 나누어 할 수 있으니 선언만 했을 때는 에러가 나지 않으나, 초기화하지 않고 호출하면 에러가 뜸.
        //변수 이름 앞에 int "타입"을 적으면 변수 "선언"
        //같은 이름의 변수를 두 번 선언할 수 없음. 단, 전역변수는 가능.
        i = 1;
        System.out.println(i);
        //전역변수도 출력하고 싶음.
        A4 a4 = new A4();
        //a4는 전역변수.
        System.out.println(a4.i);
        //a4는 인스턴스변수.
    }//////end of main method
}//////////end of A4
