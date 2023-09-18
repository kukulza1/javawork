package dog;

import java.util.ArrayList;

public class DogArrList {

	public static void main(String[] args) {
		//Dog 인스턴스를 저장할 리스트 생성
		ArrayList<Dog> dogL = new ArrayList<>();
		
		
		
		
		
		//객체 생성
		Dog d1 = new Dog("s","진돗개");
		Dog d2 = new Dog("백구2","진돗개2");
		Dog d3 = new Dog("백구3","진돗개3");
		
		//인스턴스 저장
		dogL.add(d1);
		dogL.add(d2);
		dogL.add(d3);
		
		//2인덱스 출력
		//System.out.println(dogL.get(2));
		
		//전체조회
		for(int i=0; i<dogL.size();i++) {
			Dog dog = dogL.get(i);
			System.out.println(dog);
		}

	}

}
