package switchEx;

public class SwitchCaseT2 {

	public static void main(String[] args) {
		// 메달 색상에따른 메달출력
		//변수 - medalColor
		//"Gold" "Silver" "Bronze"
		String medalColor ="silver";
		
		switch(medalColor) {
		case "Gold":
			System.out.println("금메달 입니다.");
			break;
		case "silver":
			System.out.println("은메달 입니다.");
			break;
		case "bronze":
			System.out.println("은메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
		}
		

	}

}
