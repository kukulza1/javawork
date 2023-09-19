package generic;

import java.util.ArrayList;

public class GenericT {

	public static void main(String[] args) {
		// generic(일반화) 이전의 코드 작성
		ArrayList cartlist = new ArrayList();
		
		cartlist.add("egg");
		cartlist.add("egg2");
		
		//강제형변환 필요
		String item = (String)cartlist.get(0);
		System.out.println(item);
		
		//generic을 이용한 코드 작성 -자바 1.5버전 이후 
		//제네릭 프로그래밍 -어떤 값이 하나의 자료형이 아닌 여러 자료형을 사용할수 있도록 프로그래밍하는것을 말함
		
		ArrayList<String> list = new ArrayList();
		list.add("egg");
		list.add("egg2");
		
		String item2=list.get(0);
		System.out.println(item2);

	}

}
