package dbcrud;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import domain.User;

public class UserSelectAllTest {

	public static void main(String[] args) {
		
		Connection conn = null;//네트워크 연결 클래스
		PreparedStatement pstmt=null;//sql처리 인터페이스
		//jdbc드라이버 등록
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기 -getConnection(url,user,pw)
			conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/xe","c##mydb","pwmydb");
			System.out.println("연결성공");
			
			//db처리작업
			//매개변수화된 sql문 작성- 동적 바인딩
			String sql ="select*from users";
			pstmt = conn.prepareStatement(sql);
			
			//sql실행-검색
			ResultSet rs = pstmt.executeQuery();
			ArrayList<User> Ulist = new ArrayList<>();
			while(rs.next()) {//검색된 데이타가 있으면
				//db에서userid를 꺼내옴
				User ss = new User();
				ss.setUserId(rs.getString("userid"));
				ss.setUserName(rs.getString("username"));
				ss.setUserPw(rs.getString("userpw"));
				ss.setUserAge(rs.getInt("userage"));
				ss.setUserEmail(rs.getString("useremail"));
				//리스트에 user객체를 저장
				Ulist.add(ss);
			}
			/*for(int i=0;i<Ulist.size();i++) {
				User ss= Ulist.get(i);
				//System.out.println(ss);
				System.out.println("userId:"+ss.getUserId());
				System.out.println("userNamess:"+ss.getUserName());
				System.out.println("userpw:"+ss.getUserPw());
				System.out.println("userage:"+ss.getUserAge());
				System.out.println("useremail:"+ss.getUserEmail());
				System.out.println("==============================");
				
			}*/
			for (User ss : Ulist) {
				System.out.println("userId:"+ss.getUserId());
				System.out.println("userNamess:"+ss.getUserName());
				System.out.println("userpw:"+ss.getUserPw());
				System.out.println("userage:"+ss.getUserAge());
				System.out.println("useremail:"+ss.getUserEmail());
				System.out.println("==============================");
				
			}
			
			//스택구조이므로 종료 순서를 rs> pstmt> conn 으로함
			rs.close()	;
			pstmt.close() ;
				
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
