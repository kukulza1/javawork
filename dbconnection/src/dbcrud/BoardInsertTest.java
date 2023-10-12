package dbcrud;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardInsertTest {

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
			String sql ="INSERT INTO BOARDS(bno,btitle,bcontent,bwriter,bdate,bfilename,bfiledata)"
			   +" VALUES(seq_bno.NEXTVAL,?,?,?,SYSDATE,?,?)";
			pstmt = conn.prepareStatement(sql);
			//?값 지정
			pstmt.setString(1, "NOTEBOOK3");
			pstmt.setString(2, "LG그램2");
			pstmt.setString(3, "SKY123");
			pstmt.setString(4, "notebook.PNG"); //사진을첨부한경우
			pstmt.setBlob(5, new FileInputStream("src/dbcrud/notebook.PNG"));
			//pstmt.setString(4, null);
			//Blob blob = null;
			//pstmt.setBlob(5, blob);
			//sql실행
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행의 수:"+ rows);
			//auto commit됨
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
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
