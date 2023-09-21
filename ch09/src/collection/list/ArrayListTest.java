package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// String 자료형으로 데이터 관리(CRUD)
		//순서가있고,중복데이타 저장가능
		List<String> vegeList = new ArrayList<>();
		
		//자료생성(추가-Create: add())
		vegeList.add("양파");//0번인덱스 저장
		vegeList.add("마늘");
		vegeList.add("감자");
		vegeList.add("감자");
		//리스트객체의 개수
		System.out.println("총객체수"+vegeList.size());
		
		//객체 수정(Update: set())
		vegeList.set(2, "dd");
		
		//객체삭제(Delete: remove())
		if(vegeList.contains("마늘")) 
		vegeList.remove("마늘");
		System.out.println("총객체수"+vegeList.size());
		//특정 자료 조회(Read: get())
		
		for(int i=0; i<vegeList.size();i++) {
			String vege = vegeList.get(i);
			System.out.println(vege);


	

	}
	}
}

