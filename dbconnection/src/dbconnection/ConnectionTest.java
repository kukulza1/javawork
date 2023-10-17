package dbconnection;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String[] args) {
		Connection conn = null;
		//jdbc드라이버 등록
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기 -getConnection(url,user,pw)
			conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/xe","c##mydb","pwmydb");
			System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {//반드시 수행되는 구간
			if(conn !=null) {//연결이 되어있다면
			try {
				conn.close();
				System.out.println("연결끊음");
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		}

	}

}
