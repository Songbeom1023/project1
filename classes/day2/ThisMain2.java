package classes.day2;

class ThisSub2{
    ThisSub2(){
        System.out.println("ThisSub 디폴트 생성자.");
    }
    ThisSub2(ThisMain2 thisMain){
        System.out.println(thisMain);
        thisMain.methodA();
    }
}
//자기자신에 대한 인스턴스화는 main메소드에서 디폴트 생성자가
//호출될 때 this주소번지도 결정된다.
//만일 인스턴스턴스화를 하지 않으면 this도 없다.
public class ThisMain2 {
    ThisSub2 obj = new ThisSub2(this);
    public ThisMain2(){
        System.out.println("디폴트 생성자 호출");
    }
    //가설 : 만일 객체가 생성되지 않았다면 바로 이때 NullPointerException발생함.
    void methodA(){
        System.out.println("ThisMain methodA호출");
    }
    //19-20-15-16
    public static void main(String[] args) {
        ThisMain2 tm = new ThisMain2();
        //내 안에 있는 메소드이더라도 static 에서 non-static 메소드를 불러올 수 없으므로 앞에 참조 필요.
        tm.methodA();
        System.out.println("main");
    }
}

