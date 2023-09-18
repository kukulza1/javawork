package subjects.copy;

public class StudentMain {

	public static void main(String[] args) {
		/*Student std1 = new Student(101,"홍길동");
		Student std2 = new Student(101,"승범");
		
		//과목추가
         std1.koreanSubject("국어", 100);
         std1.MathSubject("수학", 100);
         std2.koreanSubject("국어", 100);
         std2.MathSubject("수학", 100);
         
         //학생정보 출력
         std1.showStudentInfo();
         std2.showStudentInfo();
	}*/
          //객체배열
		//객체생성
		Student[] students= {
				new Student(101,"홍길동"),
				new Student(102,"임꺽정"),
				new Student(103,"임상욱")
				
		};
		//점수저장
		students[0].koreanSubject("국어", 90);
		students[0].MathSubject("수학", 99);

		students[1].koreanSubject("국어", 98);
		students[1].MathSubject("수학", 100);
		
		students[2].koreanSubject("국어", 91);
		students[2].MathSubject("수학", 95);
		
		
		
		//전체출력

		students[0].showStudentInfo();
		for(int i=0; i<students.length; i++) {
			students[i].showStudentInfo();
		}
		System.out.println("=======================================");
		//향상 for
		for(Student student : students)
			student.showStudentInfo();
}
}
