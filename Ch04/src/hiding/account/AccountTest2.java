package hiding.account;


public class AccountTest2 {

	public static void main(String[] args) {
		//생성자를 통해 계좌정보 입력
		Account account = new 
				Account("111-222-3333","SB",10000);

	
	
	System.out.println("계좌번호:"+account.getAno());
	System.out.println("계좌주:"+account.getOwner());
	System.out.println("잔고:"+account.getBalance());
   
	}
}
