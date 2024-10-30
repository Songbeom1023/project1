package day2.variable;
//가상 머신이 실행하는 순서를 따라 코딩 해보는 것은 좋으나 무작정 받아쓰기를 하는 것은 비효율적
public class A3 {
    //선언부 - 전역 변수 선언
    //사용자가 정의한 메소드
    //지변은 초기화를 생략할 수 없음 -> 언제 초기화가 되는가??? -> 메소드가 호출될 때(call by value)
    int hap(int i, int j){//파라미터 자리에 변수 선언이 가능 -> 이 경우 변수는 지역변수
        return i+j;
    }
    // 11(main) - 16(인스턴스화, 객체 생성) - 17(메소드 호출) - 7- 8- 9 - 17(return 값) - 18 - 19
    public static void main(String[] args) {
        //인스턴스화 : 클래스가 heap area 에 로딩 -> 기억, 유지
        //--> 클래스를 heap area 에 새로 로딩할 때 "new"
        //stack area - 지변(Automatic Variable) / 공유, 유지되지 않음 -> 유지하고 싶으면??? "전역 변수"
        //*상태값 : 상태에 따라 변화하며 유지되는 값 -> 변하는 값을 담기 위해 "변수 선언"
        A3 a3 = new A3();
        int result = a3.hap(2,3);//메소드 이름 뒤 ;로 끝나면 **메소드 호출**
        System.out.println(result);
    }
}
