package synchronizedmap;

import java.util.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SynchronizedMapEX {

	public static void main(String[] args) {
		//동기화된 맵 컬렉션 - 멀티스레드
		Map<Integer,String> map = Collections.synchronizedMap(new HashMap<>());
		//Map<Integer,String> map = new HashMap<>(); //싱글스레드
		
		Thread thr = new Thread() {
			public void run() {
				for(int i=1;i<=1000;i++) {
					map.put(i, "내용");
				}
			}
		};
		Thread thra = new Thread() {
			public void run() {
				for(int i=1001;i<=2000;i++) {
					map.put(i, "내용");
				}
			}
		};
		thr.start();//메인스레드가 호출하고 일시정지 상태로 들어감
		thra.start();
		
		try {
			thr.join();
			thra.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("총객체수:"+map.size());
		
		Set<Integer> keys = map.keySet();
		for(Integer key : keys)
			System.out.println(key+","+map.get(key));

	}

}
