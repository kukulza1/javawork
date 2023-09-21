package collection.list.member;

public class MemberArrLT {

	public static void main(String[] args) {
		//memberArrl클래스 객체생성
		MemberArrL ar1 = new MemberArrL();
		
		//member객체생성
		Member mem1 = new Member(101,"SB");
		Member mem2 = new Member(102,"KSB");
		Member mem3 = new Member(103,"GSB");
		Member mem4 = new Member(103,"GSB");
		
		//회원추가 메서드 호출
		ar1.addMember(mem1);
		ar1.addMember(mem2);
		ar1.addMember(mem3);
		ar1.addMember(mem4);
		
		ar1.removeMember(102);
		ar1.removeMember(104);
	
		
		System.out.println("총객체수:"+ar1.getSize());
       
		ar1.showAllMember();
		
	}

}
