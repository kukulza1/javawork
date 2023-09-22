package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {
	public static void main(String[] args) {
		//ArrayList객체생성과동시에 저장
		List<String> list = Arrays.asList("lg","ss","현대");
		
		/*List<String> list =new ArrayList<>();
		list.add("lg");
		list.add("ss");
		list.add("현대");*/
		
		//comStream은 생성후 한번만 사용되고 재사용하려면 다시값을 저장한다.
		Stream<String> comStrm = list.stream();//list의 모든객체를 가져옴
		comStrm.forEach(com->System.out.println(com));//람다식으로 출력
		
		//for(),forEach()-객체를 각각출력할때 포이치
	}

}
