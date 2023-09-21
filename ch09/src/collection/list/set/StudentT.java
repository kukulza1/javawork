package collection.list.set;

import java.util.HashSet;
import java.util.Set;

public class StudentT {

	public static void main(String[] args) {
		//hashSet 자료구조의 인스턴스 생성
		Set<Student> set=new HashSet<>();
		
		//학생 인스턴스 생성
		Student st1= new Student("SB",101);
		Student st2= new Student("KSB",102);
		Student st3= new Student("GKSB",103);
		Student st4= new Student("KSB",102);
		
		set.add(st1);
		set.add(st2);
		set.add(st3);
		set.add(st4);
		
		//자료출력 - 객체를출력하면 리스트 형태로 출력
		System.out.println(set);

	}

}
