package day6.variable;

class Dept{
    int deptno;
    String dname;//디폴트 null
    String loc;//디폴트 null
}

public class DeptMain {
    void effectParam(Dept dept) {
        //dept = new Dept();
        dept.deptno = 100;
        System.out.println("sub deptno : "+dept.deptno);
    }
    public static void main(String[] args) {
        DeptMain obj = new DeptMain();
        Dept dept = new Dept();
        dept.deptno = 500;
        obj.effectParam(dept);
        System.out.println("main deptno : "+dept.deptno);
    }
}
/*
얕은 복사 : 원본 복사
깊은 복사 : 주소번지가 달라짐.
 */
