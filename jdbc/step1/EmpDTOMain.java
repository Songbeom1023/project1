package jdbc.step1;
//오라클 서버와 자바 연동하기
//VO(Value Object) 클래스 설계가 필요한 이유
//DTO(Data Transfer Object) -> table 과 연관있는 클래스
//대화 내용을 오라클 서버에 저장하기
public class EmpDTOMain {
    //메소드 m -> 메소드 오버로딩 : 파라미터의 개수가 다르거나 타입이 다름
    void m(int empno, String ename, int deptno){
        System.out.println(empno + " " + ename + " " + deptno);
    }
    //클래스 EmpDTO -> 변수가 3개
    //메소드의 파라미터 자리는 사용자가 입력한 값을 받는 자리
    //-> 사용자와 어플리케이션의 소통이 시작되는 지점
    void m(EmpDTO edto){
        System.out.println(edto.getEmpno() + " " + edto.getEname() + " " + edto.getDeptno());
    }
    public static void main(String[] args) {
        EmpDTOMain etm = new EmpDTOMain();
        EmpDTO dto = new EmpDTO();
        dto.setEmpno(8000);
        dto.setEname("king");
        dto.setDeptno(50);
        etm.m(dto);
        etm.m(7566, "Scott", 10);
        EmpDTO dto2 = new EmpDTO();
        dto2.setEmpno(7566);
        dto2.setEmpno(7499);
        System.out.println(dto.getEmpno());
    }
}
