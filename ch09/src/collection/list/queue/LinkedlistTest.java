package collection.list.queue;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistTest {

	public static void main(String[] args) {
		// Queue 방식 - 선입선출(FiFO)
		List<String> mylist = new LinkedList<>();
		
		//자료추가
		mylist.add("A");//0번
		mylist.add("B");//1번
		mylist.add("C");//2번
		
		//객체출력
		System.out.println(mylist);
		
		//특정위치에 자료추가
		mylist.add(2, "D");
		System.out.println(mylist);
		
		//전체요소 출력
		for(String list : mylist) {
			System.out.print(list+" ");
		}

	}

}
