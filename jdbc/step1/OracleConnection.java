package jdbc.step1;

import Quiz.step1.DeptDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OracleConnection {
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
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public OracleConnection() {
    }
    public DeptDTO[] getDeptList() {
        DeptDTO[] depts = null;
        DeptDTO dto = null;
        try {
            Class.forName(_DRIVER);
            con = DriverManager.getConnection(_URL, _USER, _PW);
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }
        System.out.println(con);
        String sql = "SELECT deptno, dname, loc FROM dept";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            depts = new DeptDTO[4];
            int i = 0;
            while (rs.next()) {
                dto = new DeptDTO(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
                System.out.println(dto);//주소번지 변경 후
                depts[i] = dto;//배열에 치환
                i = i + 1;
            }
        } catch (Exception e) {
        }
        return depts;
    }

    public DeptDTO[] getDeptList3() {
        DeptDTO[] depts = null;
        DeptDTO dto = null;
        try {
            Class.forName(_DRIVER);
            con = DriverManager.getConnection(_URL, _USER, _PW);
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }
        System.out.println(con);
        String sql = "SELECT deptno, dname, loc FROM dept";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println(rs.next());
            while(rs.next()){
                System.out.println(rs.getInt("deptno") + " " + rs.getString("dname") + " " + rs.getString("loc"));
            }
        } catch (Exception e) {
        }
        return depts;
    }

    public List<DeptDTO> getDeptList2() {
        List<DeptDTO> deptList = new ArrayList<>();
        DeptDTO dto = null;
        try {
            Class.forName(_DRIVER);
            con = DriverManager.getConnection(_URL, _USER, _PW);
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }
        System.out.println(con);
        String sql = "SELECT deptno, dname, loc FROM dept";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                dto = new DeptDTO(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
                deptList.add(dto);
            }
        } catch (Exception e) {
        }
        return deptList;
    }
        public static void main (String[]args){
            OracleConnection oc = new OracleConnection();
            //DeptDTO[] dto = oc.getDeptList();
            List<DeptDTO> list = oc.getDeptList2();
            System.out.println(list.get(0)instanceof DeptDTO);
            for (int i = 0; i < list.size(); i++) {
                DeptDTO dto =list.get(i);
                System.out.println(dto.deptno + " " + dto.dname + " " + dto.loc);
            }
             //   System.out.println(list.get(i));
            /*
            System.out.println(dto);
            for(DeptDTO d : dto){
                System.out.println(d.deptno+" "+d.dname+" "+d.loc);
            }
            */
        }
    }

/*
Java API 활용해 오라클 서버에 접속하는 코드 작성
1. 오라클 회사가 제공하는 드라이버 클래스(ojdbc6.jar)를 로딩
 */