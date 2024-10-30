package Quiz.step1;

public class Q28 {
    int x = 12;

    //메소드 오버로딩 : 같은 이름의 메소드 여러 개
    public void method(int x,Q28 q) {
        System.out.println("method Q28 ;" + this);
        //this -> 인스턴스화를 두 번 했더니 변한다.
        this.x = x+x;
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(q.x);
    }

    //static()에서 this 사용 불가
    public static void main(String[] args) {
        Q28 q = new Q28();
        System.out.println("main Q28 첫번째 ;" + q);
        q.x = 10;
        q = new Q28();
        System.out.println("main Q28 두번째 ;" + q);
        q.method(5,q);
    }
}

