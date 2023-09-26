package collection.list.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapTest2 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		int idx = 0;
		
		//자료저장
		map.put("java", ++idx);
		map.put("파이선", ++idx);
		map.put("C", ++idx);
		map.put("파이선", ++idx);
		map.put("javascript", ++idx);
		
		Set<String> keys = map.keySet();
		
		//자료의 크기
		System.out.println("객체수"+map.size());
		System.out.println("엔트리의수"+keys.size());
		
		//key조회
        for(String key : keys) {
        	System.out.println(key+","+map.get(key));
        	
        	//자료존재유무
        	System.out.println(map.containsKey("C"));
        	
        	//자료삭제
        	if(map.containsKey("파이선")) {
       		 map.remove("파이선");
       	}
        	
        	//keys.forEach(key1 -> System.out.println(key1+","+map.get(key1)));
        	
        	
        	
        }
        //keys.forEach(key -> System.out.println(key+","+map.get(key)));
	}

}
