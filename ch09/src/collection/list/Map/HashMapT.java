package collection.list.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


//컨트롤+쉬프트+O import 생성
public class HashMapT {

	public static void main(String[] args) {
		// 학생의 이름과 점수를 저장할 HashMap 객체 생성
		Map<String, Integer> map =new HashMap<>();
		
		map.put("이순신", 95);
		map.put("SB", 93);
		map.put("강감찬", 77);//key,value
		
		System.out.println(map.get("SB"));//특정객체 조회 이름->점수
		
		//객체삭제
		if(map.containsKey("강감찬")) {//객체가 map에 포함되어있다면
			map.remove("강감찬");//키삭제->값도 삭제
		}
		
		System.out.println("총객체수:"+map.size());
		
		
		
		//전체조회
		Set<String> keySet = map.keySet();//key값 객체를 생성
		Iterator<String> ir = keySet.iterator();//키값으로 반복할 반복자객체(ir)생성
		while(ir.hasNext()) {
			String key = ir.next();
			Integer value = map.get(key);
			System.out.println(key+":"+value);
					
		}
		//조회2
		for(String key: keySet) {
			System.out.println(key+","+map.get(key));
		}
		//객체 자체를 출력
		System.out.println(map);

	}

}
