package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserinsertTest {

	public static void main(String[] args) {
		Connection conn = null;//네트워크 연결 클래스
		PreparedStatement pstmt=null;//sql처리 인터페이스
		try {
			//jdbc드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기 -getConnection(url,user,pw)
			conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/xe","c##mydb","pwmydb");
			System.out.println("연결성공");
			
			//db처리작업
			//매개변수화된 sql문 작성- 동적 바인딩
			String sql ="INSERT INTO USERS(userid,username,userpw,userage,useremail)"
			   +" VALUES(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			//?값 지정
			pstmt.setString(1, "admin");
			pstmt.setString(2, "관리자");
			pstmt.setString(3, "a111");
			pstmt.setInt(4, 28);
			pstmt.setString(5, "admin123@cloud.com");
			//sql실행
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행의 수:"+ rows);
			//auto commit됨
			
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
