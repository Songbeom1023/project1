package day5;

import model.vo.Tomato_Member;

import java.util.ArrayList;
import java.util.List;

public class ListMain3 {
    public static void main(String[] args) {
        List<Tomato_Member> list = new ArrayList<>();
        Tomato_Member tomato = new Tomato_Member();
        tomato.setMem_id("toamto");
        tomato.setMem_pw("123");
        tomato.setMem_nick("토마토");
        tomato.setMem_name("김유신");
        list.add(tomato);
        System.out.println(tomato == list.get(0));
        System.out.println(tomato.getMem_id());
        //멤버 변수에 private 선언 -> get 활용해야 함.
        //클래스의 인스턴스 변수의 값을 직접 변경하는 것은 대체로 피하는 것이 좋다.
        //-> private 설정 후 getter setter 로 활용.
        //-> 사이드이펙트 발생에 유의
        //외부의 클래스에서 멤버 변수에 직접 접근 불가
        //-> System.out.println(tomato.mem_id); 이렇게 쓸 수 없음.

        Tomato_Member kiwi = new Tomato_Member();
        tomato.setMem_id("kiwi");
        tomato.setMem_pw("123");
        tomato.setMem_nick("키위");
        tomato.setMem_name("이성계");
        list.add(kiwi);
    }
}
