package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardMain {
	private Connection conn;
	private PreparedStatement pstmt;
	//db연결관련변수
	private String driverClass = "com.mysql.cj.jdbc.Driver";
	private String url="jdbc:mysql://127.0.0.1:3306/mydb?severtime=Asia/Seoul";
	private String user = "myuser";
	private String userpw = "pwmyuser";
	private	Scanner sc = new Scanner(System.in);
	
	public  BoardMain() {
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(url,user,userpw);
			System.out.println("db연결성공!"+conn);
		}catch (Exception e) {
			e.printStackTrace();
		}
		}
		
	public void list() {
		System.out.println("[게시글목록]");
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("%-4s%-12s%-30s%-30s \n",".no","writer","date","title");
		System.out.println("--------------------------------------------------------------------");		
		try {
			String sql ="select *from board "+ " order by bno desc" ;
			pstmt = conn.prepareStatement(sql);
			ResultSet rs =pstmt.executeQuery();
			while(rs.next()) {
				Board bd = new Board();
				bd.setBno(rs.getInt("bno"));
				bd.setBwriter(rs.getString("bwriter"));
				bd.setBdate(rs.getTimestamp("bdate"));
				bd.setBtitle(rs.getString("btitle"));
							
			    System.out.printf("%-4s%-12s%-30s%-30s\n",
						bd.getBno(),
						bd.getBwriter(),
						bd.getBdate(),
						bd.getBtitle()
				       );			
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		mainMenu();
	}
	public void mainMenu() {
		System.out.println("--------------------------------------------------");
		System.out.println("1Create|2.Read|3.Clear|4.Exit");
		System.out.println("선택: ");
		
		String menuN= sc.nextLine();
		switch(menuN) {
		case "1": create(); break;
		case "2": Read();break;
		case "3": Clear(); break;
		case "4": Exit(); break;	
		}		
	}	
	public void create() {
		Board b1 =new Board();
		System.out.println("[새로운게시물입력]");
		System.out.print("제목:");
		String title = sc.nextLine();
		b1.setBtitle(title);
		
		System.out.print("내용:");
		String content = sc.nextLine();
		b1.setBcontent(content);
		
		System.out.print("작성자:");
		String writer = sc.nextLine();
		b1.setBwriter(writer);
		
		try {
			String sql ="insert into board (btitle,bcontent,bwriter) "
					+" values(?,?,?)";
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, b1.getBtitle());
			pstmt.setString(2, b1.getBcontent());
			pstmt.setString(3, b1.getBwriter());
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			Exit();
		}   
		list();
	}	
     public void update(Board b1) {
		System.out.println("수정할내용입력");
		
		System.out.print("제목:");
		String title = sc.nextLine();
		b1.setBtitle(title);
		
		System.out.print("내용:");
		String content = sc.nextLine();
		b1.setBcontent(content);
		
		System.out.print("작성자:");
		String writer = sc.nextLine();
		b1.setBwriter(writer);
		
		try {
			String sql ="update board set btitle =?,bcontent =?,bwriter=?   " +" where bno =? ";
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, b1.getBtitle());
			pstmt.setString(2, b1.getBcontent());
			pstmt.setString(3,b1.getBwriter());
			pstmt.setInt(4, b1.getBno());
			pstmt.executeUpdate();
			pstmt.close();
			} catch (SQLException e) {
			e.printStackTrace();
		}
	    }
     public void delete(Board b1) {
    	System.out.println(b1.getBno()+"번 게시글을 삭제하시겠습니까??");
 		System.out.println("1.ok|2.cancel");
 		String menuNo = sc.nextLine();
 		if(menuNo.equals("1")) {
    	 String sql ="delete from board  where bno =?";
    	 try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, b1.getBno());
			pstmt.executeUpdate();
			pstmt.close();
			System.out.println(b1.getBno()+"번 게시글을 삭제하엿습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
 		} 
     }
	public void Read() {
		System.out.println("[게시물읽기]");
		System.out.println("글번호선택");
		int bno = Integer.parseInt(sc.nextLine());
		try {			
			String sql = "Select * from board where bno = ? ";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				Board b1 = new Board();
				b1.setBno(rs.getInt("bno"));
				b1.setBcontent(rs.getString("bcontent"));
				b1.setBwriter(rs.getString("bwriter"));
				b1.setBdate(rs.getTimestamp("bdate"));
				b1.setBtitle(rs.getString("btitle"));
				
				System.out.println("=========================");
				System.out.println("번호:"+b1.getBno());
				System.out.println("글제목:"+b1.getBtitle());
				System.out.println("작성자:"+b1.getBwriter());
				System.out.println("내용:"+b1.getBcontent());
				System.out.println("날짜:"+b1.getBdate());
				
				System.out.println("1.게시글수정,2.삭제,3.메인메뉴로돌아가기");
				String menuN = sc.nextLine();
				if(menuN.equals("1")) {
					update(b1);
				}else if(menuN.equals("2")) {
					delete(b1);
				}else if(menuN.equals("3")) {
					rs.close();
					pstmt.close();
				}
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		list();
	}
	//테이블유지하면서 전체글삭제 -truncate
	public void Clear() {
		System.out.println("전체게시글삭제");
		System.out.println("========================");
		System.out.println("삭제하시겠습니까??");
		System.out.println("1.ok|2.cancel");
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			try {
				String sql = "truncate table Board";
				
				pstmt = conn.prepareStatement(sql);
				pstmt.executeUpdate();
				
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
				Exit();
			}					
		}	
		list();
	}
	public void Exit() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		System.out.println("종료");
		System.exit(0);
	}
		
	public static void main(String[] args) {
		BoardMain b1 = new BoardMain();
		b1.list();
	}
}