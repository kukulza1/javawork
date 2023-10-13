package banking.array;

import java.util.Scanner;

import banking.domain.Account;

public class BankMain {

	static Account[] accounts = new Account[100]; 
	 static Scanner scanner = new Scanner(System.in); 
	
	public static void main(String[] args) {
	    boolean sw = true;
	    
	    while(sw) {
	    	System.out.println("======================================");
	        System.out.println("1.계좌생성 |2.계좌목록 | 3.예금 |4.출금|5.종료");
	    	System.out.println("======================================");
	    	System.out.println("선택>");
	    	
	    	//메뉴선택
	    	int selNo = Integer.parseInt(scanner.nextLine());
	    	//int selNo = scanner.nextInt();
	    	if(selNo == 1) {
	    		creatAccount();
	    	}else if(selNo == 2){
	    		getAccountList();
	    	}else if(selNo == 3) {
	    		deposit();
	    	}else if(selNo == 4) {
	    		withdraw();
	    	}else if(selNo == 5) {
	    	   	sw = false;
	    	}
	    }
	    System.out.println("프로그램을 종료합니다.");
	    scanner.close();
	    }
        private static void creatAccount() {
        	System.out.println("----------------------------");
        	System.out.println("계좌 생성");
        	System.out.println("----------------------------");
        	
        	System.out.println("계좌번호:");
        	String ano=scanner.nextLine();
        	
        	System.out.println("계좌주:");
        	String owner=scanner.nextLine();
        	
        	System.out.println("초기 입금액");
        	int balance = Integer.parseInt(scanner.nextLine());
        	
        	//accounts[0]= new Account(ano,owner,balance);
        	for(int i=0; i<accounts.length; i++) {
        		if(accounts[i]==null) {
        			accounts[i]=new Account(ano,owner,balance);
        			System.out.println("결과: 계좌가 개설되었습니다.");
        			break;
        		}
        	}
        }
        private static void getAccountList() {
        	System.out.println("======================");
        	System.out.println("계좌 목록");
        	System.out.println("======================");
        	for(int i=0; i<accounts.length; i++) {
        		if(accounts[i] != null) {
        			System.out.print("계좌번호:"+accounts[i].getAno()+"\t");
                	System.out.print("계좌주:"+accounts[i].getOwner()+"\t");
                	System.out.print("잔고:"+accounts[i].getBalance()+"\t");
        		}
        	}
        }
        			
        		private static void deposit() {
        			System.out.println("======================");
                	System.out.println("입금");
                	System.out.println("======================");
                	
                	System.out.println("계좌번호:");
                	String ano=scanner.nextLine();
                   
                	System.out.println("입금액:");
    	            int money = Integer.parseInt(scanner.nextLine());
    	            
    	            if(findAccount(ano) != null){
    	            	Account account = findAccount(ano);
    	            	account.setBalance(account.getBalance()+money);
    	            	System.out.println("결과: 정상처리되었습니다.");
    	            }else {
    	            	System.out.println("결과: 계좌가 없습니다.");
    	            }
        		   //Account account = findAccount(ano);
        		
        		}
        		private static void withdraw() {
        			System.out.println("======================");
                	System.out.println("출금");
                	System.out.println("======================");
                	System.out.println("계좌번호:");
                	String ano=scanner.nextLine();
                   
                	System.out.println("출금액:");
    	            int money = Integer.parseInt(scanner.nextLine());
    	            
    	            if(findAccount(ano) != null){
    	            	Account account = findAccount(ano);
    	            	account.setBalance(account.getBalance()-money);
    	            	System.out.println("결과: 정상처리되었습니다.");
    	            }else {
    	            	System.out.println("결과: 계좌가 없습니다.");
    	            }
        		}
           
        	
        	
   
        	private static Account findAccount(String ano) {
        		Account account = null;//찾을계좌를 저장할 객체변수 선언
        		
        		for(int i=0; i<accounts.length; i++) {
        			if(accounts[i] != null) {
        				String dbAno = accounts[i].getAno();
        				if(dbAno.equals(ano)) {
        					account = accounts[i];
        					break;
        			
        			}
        			
        				}
        				
        			
        		}
        		
        		return account;
        	}
  
}


