package jdbc.step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
SELECT mem_nick, mem_name
FROM tomato_member
WHERE mem_id =: user_id -> 파라미터, String -varchar2
AND mem_pw =:user_pw; -> 파라미터, String -varchar2
 */
public class LoginAction {
    Connection con;//물리적으로 떨어져 있는 오라클 서버와 연결 통로를 확보
    Statement stmt;//위에서 연결된 경로로 Query 문 전달, 처리 요청 메소드를 보유한 인터페이스
    ResultSet rs;//오라클에 작동되는 커서를 구현한 인터페이스
    public void login(String user_id, String user_pw){
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT mem_nick, mem_name");
        sql.append(" FROM tomato_member");
        sql.append(" WHERE mem_id ='"+user_id+"'");
        sql.append(" AND mem_pw ='"+user_pw+"'");

        try {
            Class.forName(OracleConnection._DRIVER);
            con = DriverManager.getConnection(OracleConnection._URL, OracleConnection._USER, OracleConnection._PW);
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql.toString());
            if (rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2));
            }
            else {
                System.out.println("입력하신 아이디나 비밀번호가 맞지 않습니다.");
            }
        } catch (Exception e) {
            System.out.println();
            System.out.println(e.toString());
        }
    }
    public static void main(String[] args) {
        LoginAction la = new LoginAction();
        la.login("kiwi", "123");
    }
}

//자손 클래스에 생성자가 호출되기 전에 부모 클래스의 생성자가 먼저 호출된다.
