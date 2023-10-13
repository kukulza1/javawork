package banking.common;

import java.sql.Connection;
import java.sql.DriverManager;
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
}
