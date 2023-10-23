package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		String driverClass = "com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://127.0.0.1:3306/mydb?severtime=Asia/Seoul";
		String user = "myuser";
		String userpw = "pwmyuser";
		try {
			Class.forName(driverClass);
			Connection conn = DriverManager.getConnection(
					                  url, user, userpw);
                   System.out.println("연결성공!"+conn);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		

	}

}
