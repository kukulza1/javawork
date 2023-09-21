package nestedclass.student;

//중첩클래스는 클래스간 밀접한 관련이 있거나 다른클래스와 협력할일이 없는 경우에 사용한다.
class Student{
	String name;
	
	public Student(String name) {
		this.name = name;
	}
	//중첩 클래스(내부클래스)
	class Score{
		int eng;
		int math;
		
		void showInfo() {
			System.out.println("이름"+name);
			System.out.println("영어점수"+eng);
			System.out.println("수학점수"+math);
		}
	}
}



public class StudentT {

	public static void main(String[] args) {
		//외부 클래스의 객체 생성
		Student s1 = new Student("KSB");
		
		//내부 클래스의 인스턴스 생성
		//외부클래스.내부클래스 인스턴스 =내부인스턴스.new 내부클래스();
		Student.Score score = s1.new Score();
		
		score.eng =88;
		score.math = 99;
		score.showInfo();

	}

}
