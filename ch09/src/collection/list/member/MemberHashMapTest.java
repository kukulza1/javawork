package collection.list.member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap ss1 = new MemberHashMap();
		
		ss1.addMember(new Member(101,"SB"));
		ss1.addMember(new Member(102,"KSB"));
		ss1.addMember(new Member(103,"GSB"));
		ss1.addMember(new Member(101,"SBjj"));//키는 중복불허,값은변경됨
		

		
		//회원삭제
		ss1.removeMember(103);
		ss1.removeMember(104);
		
		//회원수
		System.out.println("총회원수:"+ss1.getSize());
		
		//목록
		ss1.showAllMember();

	}

}
