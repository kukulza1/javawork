package banking.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

//Account를 생성,조회,수정,삭제하는 클래스(CRUD)
//DAO-Data Access Object
public class AccountDAO {
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
    	//계좌목록 조회
    	for(int i=0;i<aList.size();i++) {
    		Account ss = aList.get(i);
    		//System.out.println(aList.get(i));
    		System.out.println("계좌:"+ss.getAno()+"계좌주:"+ss.getOwner()+" 잔액:"+ss.getBalance());
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
        	account.setBalance(account.getBalance()+money);
        	System.out.println("결과: 정상처리되었습니다.");
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
    public void removeAccount() {
	System.out.println("======================");
	System.out.println("계좌삭제");
	System.out.println("======================");
	System.out.print("계좌번호:");
	String ano=sc.nextLine();
	while(true) {
    if(findAccount(ano) != null){
    	//db
				System.out.println("계좌를삭제했습니다");
				break;   	
    
    
   
	}
    }
    }
    public void searchAccount() {
    	System.out.println("======================");
    	System.out.println("계좌 검색");
    	System.out.println("======================");
    	String ano = sc.nextLine();
    	while(true) {   	    
    	    if(findAccount(ano) != null){ 	
    	//db
    	break;
			}else {
				System.out.println("찾으시는계좌가 없습니다.");
			}
			break;	
	}
    }   
	public Account findAccount(String ano) {
		
		Account account =null;
		//db
		return account;
	}	
}