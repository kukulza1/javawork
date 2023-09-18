package subjects2;

import subjects.Subject;

public class Student {
	//필드
       private int studentId;  //int studentId=0
       private String studentName;
       private Subject[] subjects;
       
       public Student(int studentId, String studentName) {
    	   this.studentId = studentId;
    	   this.studentName = studentName;
    	   subjects = new Subject[10]; //과목을 저장할 배열의 크기 10개 생성
    	   
       }
       //과목추가
       public void addSubject(String name, int score) {
    	   Subject subject = new Subject();
    	   subject.setsubjectName(name);
    	   subject.setScorePoint(score);
    	   
    	   //과목을 배열에 저장
    	   //subjects[0]= subject; //1개저장
    	   for(int i=0; i<subjects.length;i++) {
    		   if(subjects[i] == null) { //배열의 요소가 비어있을때
	    		   subjects[i] = subject;//배열객체를 저장
	    		   break;//빠져나옴
    		   }
    	   }
    	  
    	   
       }
       //학생정보 출력
       public void showStudentsInfo() {
    	   int total = 0; //총점
    	   double average;
    	   int count =0;
    	   for(int i=0; i<subjects.length; i++) {
    		   if(subjects[i] != null) {  //배열의 요소 차 있을때(비어있지않을때
	    		   count++;
	    		   total += subjects[i].getScorePoint();
	    		   System.out.println(studentId+"번 학생"+studentName+"의"+ 
	    		   subjects[i].getSubjectName()+
    			   "점수는"+subjects[i].getScorePoint()+"입니다.");
	    	   }
	    	}
    	   average = (double)total/count;
    	   System.out.printf("총점은%d점이고, 평균은%.1f입니다.\n",total,average);
    	  
       }
}
