package Banking;

import java.util.Scanner;

public class BankingT {

	public static void main(String[] args) {
		// 은행 업무 프로그램
		//1.예금 2.출금 3.잔액조회 4.종료

		//메뉴화면만들기
		
		Scanner sc =new Scanner(System.in);
		int balance = 1000; //잔고
		boolean run = true;
		while(run) {
			
		
		System.out.println("========================");
		System.out.println("1.예금 2.출금 3.잔고 4.종료");
		System.out.println("========================");
	    int selNum = sc.nextInt(); //메뉴 번호 입력
		int money =0;
	     switch(selNum) {
	     case 1:
	    	 System.out.println("예금액>");
	    	 balance += sc.nextInt();
	    	 balance +=money;
	    	 System.out.println("잔고"+balance);
	    	 break;
	     case 2:
	    	 System.out.println("출금액>");
	    	 balance -= sc.nextInt();
	    	 if(balance<0) {
    			 System.out.println("잔고가 부족합니다");
    		 }
	    	 
	     case 3:
	    	 System.out.println("잔고"+balance);
	    	 break;
	     case 4:
	    	 run=false;
	    	 break;
	    	 default:
	    		 System.out.println("지원하지 않는기능입니다");
	    		 
	     }
	     
	     
	     
		}
		System.out.println("종료");
	    sc.close();
	}

}
