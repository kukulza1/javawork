package ifEx;

public class IfEx01 {

	public static void main(String[] args) {
		// if문
		//제한 속도(limit speed)50이면 속도제한
		/*
		 * /if(비교){비교문이 true이면 실행문이 작동함
		 *    실행문; }
		 */
		 
		int limitspeed=45;
		
		/*if(limitspeed >=50) {
			System.out.println("속도위반!");
		}
		
		System.out.println("시속"+limitspeed+"km입니다.");*/

		//if ~~ else 구문
		if(limitspeed >=50) {
			System.out.println("제한속도위반!!");
		}else {//limitspeed <50 생략되어있음
			System.out.println("안전속도 준수");
		}
		System.out.println("시속"+limitspeed+"입니다.");
	}

}
