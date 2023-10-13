package banking.common;

import java.sql.Connection;

public class ConnectionT {

	public static void main(String[] args) {
      Connection conn = JDBCutil.getConnection();
      System.out.println("연결성공"+conn);
	}
	

}
