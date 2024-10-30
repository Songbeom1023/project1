package classes.step1;

class Some{
    SomeObject so = null;
    public Some() {
        System.out.println("Some Constructor");
    }
    //같은 이름의 생성자를 여러 개 선언할 수 있다
    //-> 단, 파라미터의 개수나 타입이 달라야 함.
    public Some(SomeObject so){
        this.so = so;
    }
}

public class SomeObject {
    //선언부
    //클래스와 클래스 간 관계가 있다.
    Some some = new Some(this);//this -> 얕은 복사와 깊은 복사에 대해 꼭 생각해야 함.
    //생성자 -> 메소드 활용(선언, 호출과 유사 - 다른 점은 리턴 타입)
    public SomeObject() {
        System.out.println("SomeObject Constructor");
    }

    //사용자 정의 메소드
    void methodA() {}

    //메인 메소드
    public static void main(String[] args) {
        new SomeObject();


    }
}
