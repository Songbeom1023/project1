package classes.day4;
//오라클에서 생성된 테이블을 자바의 클래스로 설계
//오라클에서의 컬럼명 : 변수

//캡슐화 : 데이터(속성)와 그 데이터를 처리하는 메소드(기능)를 하나의 단위로 묶는 것
//-> 객체의 내부 구현을 감추고, 외부에서는 해당 객체가 제공하는 메소드를 통해서만 상호작용

//서로 관련 있는 하나의 로우를 담을 수 있는 클래스
//한 클래스 내에 여러 변수 선언
//-> 객체 배열에도 담을 수 있음 -> n개의 로우를 담을 수 있음
//-> 그러나 배열의 경우, 한 번 크기를 정하면 변경 불가(고정형) + 하나의 타입만
//Value Object 역할을 수행하는 클래스는 List or Map 의 제네릭으로 사용할 수 있음.
class Dept{
    //private(접근 제한자) : 내 클래스 안에서만 접근 가능
    //-> getter setter
    //SELECT dptno, dname, loc FROM dept;
    private int deptno = 0;
    private String dname = null;
    private String loc = null;

    Dept(){}
    //생성자를 통해 멤버 변수의 초기화
    //여러 가지 생성자 재정의 -> 상황에 따라 선택하여 호출
    //this 사용 이유에 대해 말할 수 있어야 함.
    Dept(String dname){}
    Dept(int deptno, String dname, String loc){
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public int getDeptno() {
        return deptno;
    }
    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }
    public String getDname() {
        return dname;
    }
    public void setDname(String dname) {
        this.dname = dname;
    }
    public String getLoc() {
        return loc;
    }
    public void setLoc(String loc) {
        this.loc = loc;
    }
}//end of dept
public class DeptMain {
    public static void main(String[] args) {
    Dept d = new Dept();
    d.setDeptno(100);
    System.out.println(d.getDeptno());
    System.out.println(d.getDname());
    System.out.println(d.getLoc());
    d = new Dept("총무부");
    Dept d2 = null;
    d2 = d;
    System.out.println(d);
    System.out.println(d2);
    System.out.println(d.getDeptno());
    System.out.println(d.getDname());
    System.out.println(d.getLoc());
    }
}
