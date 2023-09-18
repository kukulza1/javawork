package hiding.account;

public class AccountTest {

	public static void main(String[] args) {
		// Account 인스턴스 생성
		Account account = new Account();
          
		//맴버에 직접 접근하지 못하도록 제한을 둠
		//account.ano = "111-222-3333";
		//맴버 매서드에 접근가능
		account.setAno("111-222-3333");
		account.setOwner("SB");
		account.setBalance(10000);
		
		account.getAno();
		System.out.println("계좌번호:"+account.getAno());
		System.out.println("계좌주:"+account.getOwner());
		System.out.println("잔고:"+account.getBalance());
		
		//System.out.println(account.ano);

	}

}
