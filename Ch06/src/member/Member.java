package member;

public class Member {
	private String memId;
	private String name;
	
	public Member(String memId, String name) {
		this.memId = memId;
		this.name = name;
		
	}
    //hashcode재정의
	@Override
	public int hashCode() {//맴버이름.해시코드()를 반환함
		
		return memId.hashCode();
	}
	//equals()재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member =(Member)obj;//Member형으로 다운캐스팅
			if(this.memId.equals(member.memId)) {
				return true;//외부 입력된 회원아이디와 이미 생성된 회원아디가 일치하면
			}
		}
		return false;
	}
	//객체의 문자열 정보
	@Override
	public String toString() {
		return memId+", "+name;
	}
	 
  
}
