package costant.enums;

public class SeasonT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season s1;
		s1 = Season.봄;
		
		switch(s1) {
		case 봄:
			s1 = Season.봄;
		break;
		case 여름:
			s1 = Season.여름;
		break;
		case 가을:
			s1 = Season.가을;
		break;
		case 겨울:
			s1 = Season.겨울;
		break;
		default:
			System.out.println("계절이 없습니다.");
			break;
		}
     System.out.println("현재 계절은."+s1);
	}

}
