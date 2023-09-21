package collection.list.member;

import java.util.ArrayList;
//자료관리 클래스 -Data Access Object DAO
public class MemberArrL {
	//필드 - 자료구조 명시
	private ArrayList<Member> arrayList;
	
	public MemberArrL() {
		arrayList = new ArrayList<>();
	}
	public void addMember(Member mem) {
		arrayList.add(mem);
	}
	public void showAllMember() {
		for(int i=0; i<arrayList.size();i++) {
			Member mem = arrayList.get(i);
			System.out.println(mem);
		}
	}
	public int getSize() {
		return arrayList.size();
	}
	//이미 등록된 회원번호와 매개로 전달된 회원아이디를 비교해서 있을경우 삭제
	public boolean removeMember(int memberId) {
		for(int i=0; i<arrayList.size();i++) {
			int dbid= arrayList.get(i).getMemberId();
			if(dbid==memberId) {//외부 아이디랑 비교
				arrayList.remove(i);//객체삭제
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지않습니다");
		return false;
	}

}
