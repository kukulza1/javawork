package collection.list.member;

public class Member {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
}
	public String getMemberName() {
		return memberName;
	}
	@Override
	public String toString() {
		return memberId+","+memberName;
	}
	@Override
	public int hashCode() {
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member){
			Member member = (Member)obj;
			if(memberId==member.memberId)
				
				return true;
		}
		
		return false;
	}
	
}