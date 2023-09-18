package subjects2;



public class StudentTset {

	public static void main(String[] args) {
		Student kim = new Student(101,"SB");
		Student park = new Student(102,"SG");
		
		kim.addSubject("국어",90);
		kim.addSubject("수학",100);
		kim.addSubject("과학",91);
		kim.addSubject("영어",93);
		kim.showStudentsInfo();
		System.out.println("=============================");
		park.addSubject("국어",90);
		park.addSubject("수학",100);
		park.addSubject("과학",91);
		park.addSubject("영어",93);
		park.showStudentsInfo();

	}

}
