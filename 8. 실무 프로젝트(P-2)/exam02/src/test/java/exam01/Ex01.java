package exam01;

import java.sql.*;

public class Ex01 {
    void test1(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "STUDY";
        String password = "oracle";
        try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement()){
            String sql = "INSERT INTO MEMBER(USER_NO, USER_ID, USER_PW, USER_NM, MOBILE) VALUES(SEQ_MEMBER.NEXTVAL, 'USER01', '123456', '사용자01', '01000000000'";

            int cnt = stmt.executeUpdate(sql);
            System.out.println(cnt);

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    void test2(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "STUDY";
        String password = "oracle";
        try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement()) {
            String sql = "SELECT * FROM WHERE MEMBER";
            ResultSet resultSet = stmt.executeQuery(sql);

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
