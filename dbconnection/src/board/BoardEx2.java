package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardEx2 {
	private Connection conn;
	private PreparedStatement pstmt;
	//db연결관련변수
	private String driverClass = "oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521/xe";
	private String user = "c##mydb";
	private String userpw = "pwmydb";
	private	Scanner sc = new Scanner(System.in);
	
	public  BoardEx2() {
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
		System.out.println("--------------------------------------------------");
		System.out.printf("%-4s%-12s%-12s%-40s \n",".no","writer","date","title");
		System.out.println("--------------------------------------------------");
		
		try {
			String sql ="select *from board "+ " order by bno desc" ;
			pstmt = conn.prepareStatement(sql);
			ResultSet rs =pstmt.executeQuery();
			while(rs.next()) {
				Board bd = new Board();
				bd.setBno(rs.getInt("bno"));
				bd.setBwriter(rs.getString("bwriter"));
				bd.setBdate(rs.getDate("bdate"));
				bd.setBtitle(rs.getString("btitle"));
				bd.setBcontent(rs.getString("bcontent"));
				
				System.out.printf("%-4s%-12s%-12s%-40s \n",
						bd.getBno(),
						bd.getBwriter(),
						bd.getBdate(),
						bd.getBtitle(),
				        bd.getBcontent());			
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
		System.out.println("create메서드실행됨");
		list();
	}	
	public void Read() {
		System.out.println("read메서드실행됨");
		list();
	}
	public void Clear() {
		System.out.println("clear매서드실행됨");
		list();
	}
	public void Exit() {
		System.out.println("종료");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		BoardEx2 b1 = new BoardEx2();
		b1.list();
	}
}