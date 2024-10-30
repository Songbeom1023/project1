package athread.talk3;

import Quiz.step1.DeptDTO;
import com.util.DBConnectionMgr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DBUnitTest {
    DBConnectionMgr dbMgr = null;
    Connection conn= null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    public DBUnitTest(){
    dbMgr = DBConnectionMgr.getInstance();
    conn = dbMgr.getConnection();
    dbTest();
    }
    public void dbTest(){
        System.out.println(conn);
        String query = "SELECT deptno, dname, loc FROM dept";
        List<DeptDTO> list = new ArrayList<DeptDTO>();
        try{
            pstmt = conn.prepareStatement(query);
            //커서(rs)가 필요 : 조회결과를 읽어옴.
            rs = pstmt.executeQuery();//select 일 때 사용
            DeptDTO dto = null;
            while(rs.next()){
                //셍성자의 파라미터 자리로 초기화를 처리
                dto = new DeptDTO(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
                list.add(dto);
            }
            System.out.println(list.size());
            for (DeptDTO deptDTO : list) {
                System.out.println(deptDTO.getDeptno());
            }
        }catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        new DBUnitTest();
    }
}

