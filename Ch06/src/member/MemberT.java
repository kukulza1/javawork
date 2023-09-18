package member;

public class MemberT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member member1 = new Member("123","SB");
		Member member2 = new Member("123","SB");
		
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		
		
		//문자열 일치하도록 equals()함수 재정의
		System.out.println(member1.equals(member2));
        
		//객체 정보 출력 -toString() 재정의
		System.out.println(member1);
		System.out.println(member2);
		
		//실제물리주소비교
		System.out.println();
		
	}

}
