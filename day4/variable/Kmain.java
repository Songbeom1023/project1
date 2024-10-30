package day4.variable;
class K{
    int i;
}
public class Kmain {
    public static void main(String[] args) {
        K k = new K();
        //K k = 선언부 / new K() = 생성부 -> K k = new K(); 는 인스턴스화
        //-> 이 경우 선언부에 오는 타입과 생성부에 오는 타입이 같음. **다른 경우도 등장함.
        //여기서 K뒤의 ()가 생성자 -> K(); 는 생성자 호출!!
        System.out.println(k.toString());//
        k = null;//k가 참조하던 클래스와 연결이 끊김. candidate 상태 -> 초기화 상태 -> 그러나 당장 회수되지는 않고 RAM 에 남아 있음.
        //-> G.C (가비지 컬렉터)의 순서 체계에 따라 사라지나
        System.out.println(k);
        k = new K();//재정의 -> 기존의 객체와는 다른 객체!! -> 다른 주소번지

        ///타입을 새로 적지 않아도 되는 이유???
        ///null 했을 때 타입은 회수되지 않는 건가???
        ///변수로 설정한 k의 타입을 바꿀 수는 없는가???
        ///null을 사용하는 경우가 자주 있는가???

        //Exception -> 예외. 런 타임 에러
        System.out.println(k.toString());//
    }
}
/*
<클래스 설계>
: 전역 변수나 지역 변수를 설정하는 것.
전역 변수 : 객체를 나타낼 수 있는 직관적 특징들을 전역 변수로 삼음 -> 고유 명사 / 초기화 생략 가능, why? "생성자"가 초기화를 해줌.
-> 인스턴스화를 한다 : 타입 결정 / heap area 에 상주
지역 변수 : 과정 / 초기화 생략 불가 **call by value**
 */
