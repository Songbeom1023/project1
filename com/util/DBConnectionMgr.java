package com.util;
//공통 코드 작성해보기
import oracle.jdbc.driver.DBConversion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnectionMgr {
    static DBConnectionMgr dbMgr;
    //아래 Connection, PreparedStatement, ResultSet 은 인터페이스
    //-> 디바이스마다 각각 다르게 동작해야 하므로 결정할 수 없음.
    //-> 구현체 클래스가 동작을 구현해줌.
    //-> 메소드를 통해 객체가 생성된다.
    Connection con;
    PreparedStatement pstmt;//동적 query
    ResultSet rs;
    //final -> 상수, 대문자로 표기
    public final static String _DRIVER = "oracle.jdbc.OracleDriver";
    public final static String _URL = "jdbc:oracle:thin:@127.0.0.1:1521:orcl11";
    public final static String _USER = "scott";
    public final static String _PW = "tiger";

    //메소드를 활용하여 객체 생성 - 세련된 코드 - 싱글톤 패턴
    //클래스 선언에 static -> 얕은 복사 -> 원본 하나를 공유 -> 쓰레드
    public static DBConnectionMgr getInstance() {
        //선택적으로 객체 생성
        //if 조건절에서 null 체크
        if (dbMgr == null) {
            dbMgr = new DBConnectionMgr();
        }
        return dbMgr;
    }

    public Connection getConnection() {
        try {
            Class.forName(_DRIVER);//드라이버에 로드
            con = DriverManager.getConnection(_URL, _USER, _PW);//세 부분에 연결
        } catch (Exception e) {
        }
        return con;
    }
    //사용한 자원 반납
    //사용한 자원을 닫을 때는 생성된 역순으로 닫는다.
    //JVM 가비지 컬렉터가 대신 해준다. 그러나, 명시적으로 구현하는 것을 권장한다.
    //Insert, Update, Delete -> Connection, PreparedStatement
    //Select -> Connection, Statement, ResultSet
    public void freeConnection(Connection con, PreparedStatement pstmt, ResultSet rs) {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
        } catch (Exception e) {
        }
    }
    public void freeConnection (Connection con, PreparedStatement pstmt){
        try {
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
        }
        catch (Exception e) {
        }
    }
}
