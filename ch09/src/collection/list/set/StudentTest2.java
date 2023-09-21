package collection.list.set;

import java.util.HashMap;
import java.util.Map;

public class StudentTest2 {

	public static void main(String[] args) {
		Map<String,Student> map = new HashMap<>();
		
		Student st1= new Student("SB",101);
		Student st2= new Student("KSB",102);
		Student st3= new Student("GSB",103);
		Student st4= new Student("KSB",102);
		
		//객체추가
		map.put("SB", st1);
		map.put("KSB", st2);
		map.put("GSB", st3);
		map.put("KSB", st4);
		
		System.out.println(map);
	}

}
