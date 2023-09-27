package BankingArrList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.array.Account;

public class ArrLBank {
	
	//통장계좌를 저장할 자료 구조의 객체 생성
    static ArrayList<Account> aList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		 boolean sw = true;
		    
		    while(sw) {
		    	try {
		    	System.out.println("======================================");
		        System.out.println("1.계좌생성 |2.계좌목록 | 3.예금 |4.출금|5.종료");
		    	System.out.println("======================================");
		    	System.out.print("선택>");
		    	
		    	//메뉴선택
		    	int selNo = Integer.parseInt(sc.nextLine());
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

	}//main 끝
	
	private static void creatAccount() {
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
    	
    	System.out.print("계좌주:");
    	String owner=sc.nextLine();
    	
    	System.out.print("초기 입금액:");
    		
    	int balance = Integer.parseInt(sc.nextLine());
    	    
    	   //입력받은 내용을 매개변수로 계좌 생성함
    	   Account newAccount = new Account(ano,owner,balance);
    	   aList.add(newAccount);//리스트에 저장
    	   System.out.println("결과: 계좌가 개설되었습니다.");
    	   break;
    	}
    	}else {
    		System.out.println("계좌번호형식이 아닙니다 올바른형식으로 입력해 주세요");
    	}
    	
    	}//while끝
	}//createA끝
	
	private static void getAccountList() {
		System.out.println("======================");
    	System.out.println("계좌 목록");
    	System.out.println("======================");
    	
    	//계좌목록 조회
    	for(int i=0;i<aList.size();i++) {
    		Account ss = aList.get(i);
    		//System.out.println(aList.get(i));
    		System.out.println("계좌:"+ss.getAno()+"계좌주:"+ss.getOwner()+"잔액:"+ss.getBalance());
    	}
	}
	private static void deposit() {
		System.out.println("======================");
    	System.out.println("입금");
    	System.out.println("======================");
    	
    	System.out.print("계좌번호:");
    	String ano=sc.nextLine();
       
    	System.out.print("입금액:");
        int money = Integer.parseInt(sc.nextLine());
        
        if(findAccount(ano) != null){
        	Account account = findAccount(ano);
        	account.setBalance(account.getBalance()+money);
        	System.out.println("결과: 정상처리되었습니다.");
        }else {
        	System.out.println("결과: 계좌가 없습니다.");
        }
		
	}
	private static void withdraw() {
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
        		account.setBalance(account.getBalance()-money);
        		
            	System.out.println("결과: 정상처리되었습니다.");
            	break;
        	}
        }break;
        }else {
        	System.out.println("결과: 계좌가 없습니다.");
 	
        }
    	
        }//while 끝	
	}
	
	private static Account findAccount(String ano) {
		Account account =null;
		for(int i=0; i<aList.size();i++) {
			//이미등록된 계좌를 가져와서 외부에서 입력한 계좌와 일치하는지 비교함
			String dbano = aList.get(i).getAno();
			if(dbano.equals(ano)) {
				account = aList.get(i);//계좌 객체생성
				
				break;
				
			}
		}
		return account;
	}
		
	}
