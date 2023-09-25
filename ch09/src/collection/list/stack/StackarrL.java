package collection.list.stack;

import java.util.ArrayList;

//DAO-데이터 관리
public class StackarrL {
	
	private ArrayList<String> arrL; 
	
	//생성자
	public StackarrL() {
		arrL= new ArrayList<>();
	}
	//자료추가(저장)
	public void push(String data) {
		arrL.add(data);
	}
	//자료삭제(꺼내기)
	public String pop() {
		int size = arrL.size();
		if(size==0) {
			System.out.println("스택이 비엇습니다.");
			return null;
			
		}
		return arrL.remove(size-1); //배열의 인덱스 이므로 사이즈-1
				
	}

}
