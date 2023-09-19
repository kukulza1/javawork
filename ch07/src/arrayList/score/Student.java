package arrayList.score;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectlist; //subject 객체를 저장할 배열
	
	public Student(int studentId,String studentName) {
		this.studentId = studentId;
		this.studentName=studentName;
		subjectlist = new ArrayList<>();
	}
	public void addsubject(String name,int score) {
		Subject subject = new Subject(name,score);
		subjectlist.add(subject);//어레이 리스트에 저장함0번부터
	}
      public void showStudentInfo() {
    	  int total = 0;
    	  double avg;
    	  for(int i=0; i<subjectlist.size();i++) {
    		  Subject s =subjectlist.get(i);
    		  total += s.getScorePoint();
    		  System.out.printf("학생%s의 %s과목의 점수는 %d점입니다.\n",studentName,
    				  s.getSubjectName(),s.getScorePoint());
    	  }
    	  avg=(double)total/subjectlist.size();
    	 System.out.printf("학생%s의 총점은%d점이고,평점은%.1f점 입니다.",studentName,total,avg);
      }
}
