package collection.list.member;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Member 클래스를 참조해서 회원생성,조회,삭제하는클래스
public class MemberHashMap {
	//HashMap 자료구조 객체생성
	private Map<Integer,Member> hashMap;
	
	//생성자
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	//회원추가
	public void addMember(Member member) {
		//key memberId,value -맴버객체
		hashMap.put(member.getMemberId(), member);
	}
	//회원 목록조회
	public void showAllMember() {
		//인덱싱 불가(순서가없음)-반복자(iterator)사용,keyset()-키집합
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {//객체수만큼 반복
			int key = ir.next();//key를 가져옴
			Member member = hashMap.get(key);//키를 매개로 맴버 객체를가져옴
			System.out.println(member);
		}
		
	}
	//회원삭제
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
		         return true;
		}
		System.out.println(memberId+"가존재하지않습니다");
		return false;
	
}
	//회원수 조회
	public int getSize() {
		return hashMap.size();
	}
	
	
}
