package banking.bankDB;

import java.util.Scanner;
import banking.domain.AccountDAO;

public class Main {

	public static void main(String[] args) {
		AccountDAO DAO = new AccountDAO();
		 boolean sw = true;
		 Scanner sc = new Scanner(System.in);
		    while(sw) {
		    	try {
		    	System.out.println("===========================================================");
		        System.out.println("1.계좌생성 |2.계좌목록 | 3.예금 |4.출금|5.계좌삭제|6.계좌검색|7.종료");
		    	System.out.println("==========================================================");
		    	System.out.print("선택>");		    	
		    	//메뉴선택
		    	int selNo = Integer.parseInt(sc.nextLine());
		    	if(selNo == 1) {
		    		DAO.creatAccount();
		    	}else if(selNo == 2) {
		    		DAO.getAccountList();
		    	}else if(selNo == 3) {
		    		DAO.deposit();
		    	}else if(selNo == 4) {
		    		DAO.withdraw();
		    	}else if(selNo == 5) {
		    		DAO.removeAccount();    	   	
		    	}else if(selNo == 6) {
		    		DAO.searchAccount();
		    	}else if(selNo == 7) {
		    		sw = false;
		    	}else {
		    		System.out.println("미지원기능입니다 다시하세요.");
		    	}
		    	}catch(NumberFormatException e) {
	        		//e.printStackTrace();
		    		System.out.println("숫자를 입력하세요");
	        	}
		    }
		   System.out.println("프로그램을 종료합니다.");
		    sc.close();
	}
}