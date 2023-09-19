package arrayList.score;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student(101,"SB");
		st1.addsubject("국어", 100);
		st1.addsubject("수학", 97);
		st1.addsubject("자바", 99);
		
		st1.showStudentInfo();

	}

}
