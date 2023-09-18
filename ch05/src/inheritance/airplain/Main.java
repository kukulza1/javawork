package inheritance.airplain;

public class Main {

	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		
		sa.이륙하다();
		sa.비행하다();
		
		//모드변경- 클래스이름으로 직접접근
		sa.flymode = SuperSonicAirplane.SUPERSONIC;
		sa.비행하다();
		
		sa.flymode = SuperSonicAirplane.NORMAL;
		sa.비행하다();
		sa.착륙하다();

	}

}
