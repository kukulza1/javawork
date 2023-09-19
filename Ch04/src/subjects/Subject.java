package subjects;

//Subject 자료형 정의
public class Subject {
	//필드
	private String subjectName; //과목이름
	private int scorePoint; //과목점수
	
	//getter,setter
	//과목이름 입력
	public void setsubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	//과목이름 출력
	public String getSubjectName() {
		return subjectName;
	}
	
	
	//점수입력
	public void setsubjectName(int scorePoint) {
		this.scorePoint =scorePoint;
	}
	//점수출력
 	public int getScorePoint() {
		return scorePoint;
	}
	
		
	}


