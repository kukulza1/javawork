package banking.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.common.JDBCutil;

//Account를 생성,조회,수정,삭제하는 클래스(CRUD)
//DAO-Data Access Object
public class AccountDAO {
	Connection conn;//db연결객체
	PreparedStatement pstmt; //sql처리 객체
	ResultSet rs;
	Scanner sc = new Scanner(System.in);
	public void creatAccount() {
		System.out.println("----------------------------");
    	System.out.println("계좌 생성");
    	System.out.println("----------------------------");
    	
    	while(true) {
    	 System.out.print("계좌번호(형식00-00-000):");
    	 String ano = sc.nextLine();  	
    	 String regExp = "\\d{2}-\\d{2}-\\d{3}";
    	boolean ano2 = Pattern.matches(regExp, ano);	
    	if(ano2) {
    	//중복계좌 체크
    	if(findAccount(ano) != null) {//중복계좌가 있으면
    		System.out.println("중복 계좌입니다.");
    	}else { //중복 계좌가없으면
    	while(true) {
    		System.out.print("계좌주(한,영):");
        	String owner=sc.nextLine();
        	regExp="[a-zA-Z가-힣]+";//영어,한글만
        	ano2 = Pattern.matches(regExp, owner);
        	if(ano2) {
        		System.out.print("초기 입금액:");
        		
            	int balance = Integer.parseInt(sc.nextLine());
            	    
            	   //db작업
            	   try {
            		   conn=JDBCutil.getConnection();
                	   String sql ="INSERT INTO account(ano,owner,balance)" +" values(?,?,?)";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, ano);
					pstmt.setString(2, owner);
					pstmt.setInt(3, balance);
					//sql실행
					pstmt.executeUpdate();
					System.out.println("계좌가생성되었습니다.");
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					JDBCutil.close(conn, pstmt);
				}
            	   break;
        	}else {
        		System.out.println("계좌주는 한글과영문만입력가능합니다.");
        	}
    	}   //안쪽while끝
    	break;
    	}
    	}else {
    		System.out.println("계좌번호형식이 아닙니다 올바른형식으로 입력해 주세요");
    	}  	
    	}//바깥while끝
	}//createA끝	
	
	public void getAccountList() {
		System.out.println("======================");
    	System.out.println("계좌 목록");
    	System.out.println("======================");
    	List<Account> aList = new ArrayList<>();
    	//db작업
    	try {
    		conn=JDBCutil.getConnection();
        	String sql = "SELECT * FROM account";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			//검색처리
			while(rs.next()) {//다음데이터가 있으면 무한반복
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				Account ac = new Account(ano,owner,balance);
				aList.add(ac);								
			}
			for(int i=0;i<aList.size();i++) {
	    		Account ss = aList.get(i);
	    		System.out.println("계좌:"+ss.getAno()+"계좌주:"+ss.getOwner()+" 잔액:"+ss.getBalance());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.close(conn, pstmt, rs);
		}
    	}
	
	public void deposit() {
		System.out.println("======================");
    	System.out.println("입금");
    	System.out.println("======================");    	
    	System.out.print("계좌번호:");
    	String ano=sc.nextLine();   
    	System.out.print("입금액:");
        int money = Integer.parseInt(sc.nextLine());  
         
        if(findAccount(ano) != null){
        	Account account = findAccount(ano);
        	int balance = account.getBalance()+money;
        	try {
       		  conn=JDBCutil.getConnection();
       	 	   String sql = "update account set balance = ?  where ano =? ";
      		pstmt = conn.prepareStatement(sql);
      		pstmt.setInt(1, balance);
      		pstmt.setString(2, ano);
      		pstmt.executeUpdate();
      		
      		System.out.println("결과: 정상처리되었습니다.");
      	} catch (SQLException e) {
      		e.printStackTrace();
      	}finally {
      		System.out.println("계좌"+account.getAno()+"계좌주"+
					account.getOwner()+"잔고"+(account.getBalance()+money));
      		JDBCutil.close(conn, pstmt);
      	}
        }else {
        	System.out.println("결과: 계좌가 없습니다.");
        }
 	   
 	   
	}
	public void withdraw() {
		System.out.println("======================");
    	System.out.println("출금");
    	System.out.println("======================");
  	
    	while(true) {
    	System.out.println("계좌번호:");
    	String ano=sc.nextLine();
    	
    	if(findAccount(ano) != null){
        while(true) {
    	System.out.println("출금액:");
        int money = Integer.parseInt(sc.nextLine());      
        	Account account = findAccount(ano);
        	
        	if(0 == account.getBalance()) {//출금액이 잔고보다 많으면
        		System.out.println("잔액이없습니다.");
        		break;
        	}else if(money>account.getBalance()){
        		System.out.println("잔액이 부족합니다.다시입력하세요");
        		break;             	
        }else {
        	try {
        		int balance = account.getBalance()-money;
         		  conn=JDBCutil.getConnection();
         	 	   String sql = "update account set balance = ?  where ano =? ";
        		pstmt = conn.prepareStatement(sql);
        		pstmt.setInt(1, balance);
        		pstmt.setString(2, ano);
        		pstmt.executeUpdate();
        		System.out.println("계좌"+account.getAno()+"계좌주"+
    					account.getOwner()+"잔고"+(account.getBalance()-money));
        	} catch (SQLException e) {
        		e.printStackTrace();
        	}finally {
        		JDBCutil.close(conn, pstmt);
        	}
            	System.out.println("결과: 정상처리되었습니다.");
            	break;
        	}
        }break;
        }else {
        	System.out.println("결과: 계좌가 없습니다."); 	
        }   	
        }//while 끝	
	}
    public void removeAccount() {
	System.out.println("======================");
	System.out.println("계좌삭제");
	System.out.println("======================");
	
	
	while(true) {
		System.out.print("계좌번호:");
		String ano=sc.nextLine();
	    if(findAccount(ano) != null){
	    	
	    	System.out.println("1삭제, 다른키 삭제취소");
	    	String check1 = sc.nextLine();
	    	if(check1.equals("1")) {  
	    		
		 	   try {//db
		 		  conn=JDBCutil.getConnection();
			 	   String sql = "delete from account where ano =? ";
    				pstmt = conn.prepareStatement(sql);
    				pstmt.setString(1, ano);
    				pstmt.executeUpdate();
    			} catch (SQLException e) {
    				e.printStackTrace();
    			}finally {
    				JDBCutil.close(conn, pstmt);
    			}
		 	  System.out.println("계좌를삭제했습니다");
			}else {
				System.out.println("계좌삭제를 취소합니다.");
			}
			break;   
    	}else {
    	}
      }
    }
    
    public void searchAccount() {
    	System.out.println("======================");
    	System.out.println("검색할계좌를 입력하시오 00-00-000");
    	System.out.println("======================");
   // 	String ano = sc.nextLine();
    	while(true) {   	    
    		String ano = sc.nextLine();
    	    if(findAccount(ano) != null){ 	    	
    	    	Account ac = findAccount(ano);
    			System.out.println("계좌"+ac.getAno()+"계좌주"+
					ac.getOwner()+"잔고"+ac.getBalance());
			}else {
				System.out.println("찾으시는계좌가 없습니다.");
			}
			break;	
	}
    }   
	public Account findAccount(String ano) {	
		Account account =null;
		conn= JDBCutil.getConnection();
		String sql ="SELECT * FROM ACCOUNT WHERE ano =?";
		try {
			pstmt =conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			//1개 검색처리
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ano= rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				account = new Account(ano,owner,balance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCutil.close(conn, pstmt, rs);
		}
		return account;
	}	
}