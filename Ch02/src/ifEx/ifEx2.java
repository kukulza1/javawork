package ifEx;

import java.util.Scanner;


public class ifEx2 {

	public static void main(String[] args) {
		// 놀이공원 입장료계산
		//취학전 아동-1000, 초등-2000, 중,고등2500,성인3000
		//변수 age,입장료(fee)
      Scanner scan =new Scanner(System.in);
		
		System.out.println("나이입력");
		int age= scan.nextInt();
		int fee=0;
		
		if(age<8) {
			fee=1000;
			System.out.println("취학전아동입니다");
			
		}else if(age>=8 && age<14) {
				fee=2000;
				System.out.println("초등생입니다");
			
		}else if(age>=14 && age<20) {
				fee=2500;
				System.out.println("중.고등학생입니다");
		}else if(age>=21) {
			fee=3000;
			System.out.println("성인입니다");
		}
		
		System.out.println("입장료는"+fee+"원 입니다");
		scan.close();
	}

}
