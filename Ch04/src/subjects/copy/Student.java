package subjects.copy;

import subjects.Subject;

public class Student {
	//필드
	int studentId; //학번
	String studentName; //이름
    Subject korean; //국어 과목(참조)
    Subject math;
    
    
    //생성자
    public Student(int studentId, String studentName) {
    	this.studentId = studentId;
    	this.studentName = studentName;
    	korean = new Subject();//korean 객체 생성
    	math = new Subject();
    	
    }
    //국어 과목 추가 메서드 정의
    public void koreanSubject(String name, int score) {
    	korean.setsubjectName(name);
    	korean.setsubjectName(score);
    }
    public void showStudentInfo() {
    	System.out.println(studentName+"의" +korean.getSubjectName() + 
    			"점수는" + korean.getScorePoint()+"점 입니다");
    }
    
    //수학과목 추가 메서드 정의
    public void MathSubject(String name, int score) {
    	math.setsubjectName(name);
    	math.setsubjectName(score);
    	
    	System.out.println(studentName+"의" +math.getSubjectName() + 
    			"점수는" + math.getScorePoint()+"점 입니다");
    }
    
    	
    }
    

