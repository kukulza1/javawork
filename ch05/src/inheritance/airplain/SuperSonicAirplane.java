package inheritance.airplain;

public class SuperSonicAirplane extends Airplain{

	 //1-일반비행,2-초음속비행
	static final int NORMAL =1;
	static final int SUPERSONIC =2;
	
	
	  int flymode =NORMAL;
	  
	  @Override //매서드 재정의
	  public void 비행하다() {
		  if(flymode ==SUPERSONIC) {
			  System.out.println("비행기가 초음속비행합니다.");
			  
		  }else {
			  super.비행하다();//부모메서드 상속(super사용)
			  
		  }
		
	}
	

}
