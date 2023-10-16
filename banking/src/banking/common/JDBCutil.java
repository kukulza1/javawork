package banking.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//DB에 네트워크 연결및 종료하는 클래스
public class JDBCutil {
	static String driverClass = "oracle.jdbc.OracleDriver";
	static String url="jdbc:oracle:thin:@localhost:1521/xe";
	static String user = "c##mydb";
	static String userpw = "pwmydb";
	
	public static Connection getConnection(){
		try {
			Class.forName(driverClass);
			return DriverManager.getConnection(url,user,userpw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	//db연결종료(삽입,수정,삭제)
	public static void close(Connection conn,PreparedStatement pstmt) {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	//db연결종료 메서드(조회)
	public static void close(Connection conn,
			PreparedStatement pstmt,ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
