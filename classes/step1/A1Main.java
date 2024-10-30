package classes.step1;

class A1{
    A1Main am = null;
    A1(){}
    A1(A1Main am){
        //생성자 파라미터 자리에 null이 올 수 있음.
        //참조형 타입을 파라미터로 넘기는 경우 null 유무 체크하기!!!!
        if (am == null){
            System.out.println("파라미터로 넘어온 주소번지가 아무것도 가리키지 않음");
        } else{
            am.m();
            this.am = am;//멤버 변수를 글로벌하게 쓰기 위한 초기화 작업. 이 작업이 필수!!!
            other();
        }
    }void other(){
        am.m();
    }
}

public class A1Main {
    A1 a1 = new A1(this);
    void m (){
        System.out.println("m() 호출");
    }
    public static void main(String[] args) {
        new A1Main();
    }
}
