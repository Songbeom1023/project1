package jdbc.step1;

import Quiz.step1.DeptDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleConnection2 {
    //드라이버 클래스를 메모리에 올린다.
    public static final String _DRIVER = "oracle.jdbc.OracleDriver";
    //물리적으로 떨어져 있는 오라클 서버의 드라이버 이름과 IP 주소, 포트 번호, SID
    //thin 방식, oci 방식
    //thin -> 멀티 티어(여러 서버)에서 사용함, 동시에 많은 사람들이 접속할 때 사용
    public static final String _URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl11";
    //계정 이름
    public static final String _USER = "scott";
    //비밀 번호
    public static final String _PW = "tiger";
    Connection con = null;//오라클 서버에 연결 통로 확보
    Statement stmt = null;
    ResultSet rs = null;//select -> 커서를 조작하는 인터페이스

    public OracleConnection2() {
    }
    public DeptDTO[]getDeptList(){
        DeptDTO[]deptList = null;
        DeptDTO dto = null;
        try {
            Class.forName(_DRIVER);
            con = DriverManager.getConnection(_URL, _USER, _PW);
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }
        System.out.println(con);
        String sql = "SELECT empno, ename, deptno FROM emp";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt("empno") + " " + rs.getString("ename") + " " + rs.getInt("deptno"));
            }
        } catch (Exception e) {
        }
        return deptList;
    }

    public static void main(String[] args) {
        OracleConnection orcl =new OracleConnection();
        DeptDTO[] dto =orcl.getDeptList();
        System.out.println(dto);
    }
}
/*
Java API 활용해 오라클 서버에 접속하는 코드 작성
1. 오라클 회사가 제공하는 드라이버 클래스(ojdbc6.jar)를 로딩
 */