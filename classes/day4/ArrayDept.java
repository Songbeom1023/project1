package classes.day4;

public class ArrayDept {
    public static void main(String[] args) {
        Dept[]depts = new Dept[]{new Dept(10,"총무부","인천"),new Dept(20,"","서울"),new Dept(30,"개발부", "부산")};
        for (int i = 0; i < depts.length; i++) {
            System.out.println(depts[i]);
            System.out.println(depts[i].getDeptno()+","+depts[i].getDname()+","+depts[i].getLoc());
        }
    }
}
