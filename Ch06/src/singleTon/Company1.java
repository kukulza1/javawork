package singleTon;

public class Company1 {
       //싱글톤 코딩 디자인 패턴사용
	   //맴버 변수가 객체 인스턴스
	//static을활용함 - new로 생성하지 않음
	//클래스 이름으로 직접접근
	private static Company1 instance;
	
	private Company1() {}//생성자 private사용
		
	public static Company1 getInstance(){
	   if(instance == null) {
		   instance = new Company1();
	   }
		return instance;

	 }
	}
	
