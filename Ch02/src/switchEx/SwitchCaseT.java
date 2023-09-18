package switchEx;

public class SwitchCaseT {

	public static void main(String[] args) {
		// 랭킹에따른 메달
		//1.금 2.은 3.동
		//변수 rank
		
		int rank =1;
		
		switch(rank) {//switch(변수)
		 case 1 ://콜론으로 끝남
			 System.out.println("금메달 입니다.");
			 //break;
		 case 2:
			 System.out.println("은메달 입니다.");
			 break;
		 case 3:
			 System.out.println("동메달 입니다.");
			 break;
			 default://case에 없는경우 처리
				 System.out.println("메달이 없습니다");
				 break;
		}

	}

}
