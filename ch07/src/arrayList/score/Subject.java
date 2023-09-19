package arrayList.score;

//Subject 자료형 정의
public class Subject {
	//필드
	private String subjectName; //과목이름
	private int scorePoint; //과목점수
	
	public Subject() {}
	
	//getter,setter
	//과목이름 입력
	public Subject(String subjectName,int scorePoint) {
		this.subjectName = subjectName;
		this.scorePoint =scorePoint;
	}
	
	public void setsubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	//과목이름 출력
	public String getSubjectName() {
		return subjectName;
	}
	
	
	//점수입력
	public void setScorePoint(int scorePoint) {
		this.scorePoint =scorePoint;
	}
	//점수출력
 	public int getScorePoint() {
		return scorePoint;
	}
	
		
	}


