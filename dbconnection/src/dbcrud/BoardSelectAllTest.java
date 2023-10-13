package dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import domain.Boards;

public class BoardSelectAllTest {

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
			String sql ="SELECT*FROM BOARDS"
					+ " ORDER BY bno DESC";
			pstmt = conn.prepareStatement(sql);
			
		   ResultSet rs = pstmt.executeQuery();
		   List<Boards> Blist = new ArrayList<>();
		   while(rs.next()) {
			   Boards bs = new Boards();
			   bs.setBno(rs.getInt("bno"));
			   bs.setBtitle(rs.getString("btitle"));
			   bs.setBcontent(rs.getString("bcontent"));
			   bs.setBwriter(rs.getString("bwriter"));
			   bs.setBdate(rs.getDate("bdate"));
			   bs.setBfilename(rs.getString("bfilename"));
			   bs.setBfiledata(rs.getBlob("bfiledata"));
			   Blist.add(bs);   
			   }
		  for(Boards bs : Blist) {
				System.out.println(bs);
			}
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
