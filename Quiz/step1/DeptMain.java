package Quiz.step1;

public class DeptMain {
    public static void main(String[] args) {
        DeptDTO[] depts = new DeptDTO[3];
        DeptDTO dto = new DeptDTO(10,"총무부", "인천");
        System.out.println(dto);
        depts[0] = dto;
        System.out.println(depts[0].deptno);
        dto = new DeptDTO(20,"영업부", "서울");
        depts[1] = dto;
        System.out.println(depts[1].deptno);
        dto = new DeptDTO(30,"개발부", "부산");
        depts[2] = dto;
        System.out.println(depts[2].deptno);
        System.out.println(dto.deptno);
    }
}
