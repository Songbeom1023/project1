package day5.variable;
/*
7566 - scott - 1900.56
7499 - tiger - 2700
7390 - king - 3100
 */
public class EmpSimulation {
    public static void main(String[] args) {
        //같은 이름의 변수명 이지만 주소번지값은 서로 다름
        Emp emp = new Emp();
        System.out.println(emp);
        emp.empno = 7566;
        emp.ename = "scott";
        emp.salary = 1900.56;
        System.out.println(emp.empno);//7566
        System.out.println(emp.ename);//scott
        System.out.println(emp.salary);//1900.56
        emp= null;
        //바로 위에서 null로 초기화 하였다가 다시 새로 인스턴스화
        //하였다.
        emp = new Emp();//변수이름도 같고 타입도 같지만 새로운 객체생성됨
        //아래에서 사원번호가 0이 출력되는 이유는 19번에서
        //새로운 객체가 생성됨 - 깊은복사
        System.out.println(emp.empno);//0
        emp.empno = 7499;
        System.out.println(emp.empno);//7499출력됨
        System.out.println(emp);
        emp= null;//null초기화 했다가 다시 인스턴스화 할때
        //기존에 참조되던 객체가 candidate상태가 됨.
        //명시적으로 사용한 자원에 대해서 반납처리하는 것 권장함.
        emp = new Emp();
        System.out.println(emp);
    }
}
