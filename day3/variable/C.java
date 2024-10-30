package day3.variable;

public class C {
    //메소드 선언하기
    //{ return 타입 - 메소드 이름 - (파라미터) }
    /*
    * 두 수의 합을 구하는 메소드 구현
    * hap : 사용자가 정의한 메소드 / 무엇을 정의했는가? -> 파라미터의 개수, 타입 / return 타입
    * 재사용성을 높이는 코드를 작성하는 첫 단계 : 메소드 중심의 코딩을 전개하는 것
    * param i 는 정수형 -> 실수형 불가
    * param j 는 정수형 -> 실수형 불가
    * return 타입은 정수 / 왜? -> 파라미터 타입이 둘 다 int 이기 때문에
    */
    static int hap(int i, int j){
        return i+j;
    }
    public static void main(String[] args) {
        C c= new C();
        //내 안에 선언된 메소드이더라도 main 메소드 안에서 호출하려면 "인스턴스화"해야 함.
        //non-static 메소드는 static 메소드에서 사용할 수 없음.
        System.out.println(hap(3,2));
    }
}
