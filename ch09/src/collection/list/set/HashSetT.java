package collection.list.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetT {

	public static void main(String[] args) {
		//set 인터페이스를 구현한 hashSet 클래스의 객체생성
		//순서가 없고,중복을 허용하지않음
		Set<String> set = new HashSet<>();
		
		//객체생성
		set.add("java");
		set.add("java");
		set.add("jdbc");
		set.add("jsp");
		
		//객체수
		System.out.println("총 객체수"+set.size());
		
		//객체삭제
		if(set.contains("jsp")) {
			set.remove("jsp");
		}
		
		//전체목록 조회
		//순서가 없어서 인덱싱 불가
		Iterator<String> ir = set.iterator();
		while(ir.hasNext()) {
			String element = ir.next(); //다음 객체가 있으면 가져옴
			System.out.println(element);
		}
		System.out.println("=========================");
		//전체조회
		for(String element : set)
			System.out.println(element);
		
		System.out.println(set);

	}

}
