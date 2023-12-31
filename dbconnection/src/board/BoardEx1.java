package board;

import java.sql.Connection;

import java.sql.DriverManager;
import java.util.Scanner;

public class BoardEx1 {
	 String driverClass = "oracle.jdbc.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521/xe";
	 String user = "c##mydb";
	 String userpw = "pwmydb";
		Scanner sc = new Scanner(System.in);
	public  BoardEx1() {
		Connection conn;
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
		System.out.printf("%-4s%-12s%-12s%-40s \n",
				             "1","today12","2023/10/17","가입인사.");
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
		BoardEx1 b1 = new BoardEx1();
		b1.list();
	}
}
