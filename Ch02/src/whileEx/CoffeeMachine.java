package whileEx;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		// 커피기계
		//커피 총갯수5개
		//커피가격500원 500원이상투입시 커피나옴
		//500원을 초과하면 거스름돈과 커피가 나옴
		//500원미만은 커피가 나오지않음
		//커피가 소진되면 판매중단
		Scanner sc = new Scanner(System.in);
		
		int coffee = 5;
		while(true) {
			System.out.println("돈을 투입해주세요:");
			int money = sc.nextInt();
			
			if(money ==500) {
				System.out.println("커피가 나옵니다");
			coffee -=1;
			}else if(money>500) {
				System.out.println((money-500)+"원을 돌려주고 커피가나옵니다");
				coffee -=1;
			}else if(money<500) {
				System.out.println("돈이부족합니다");
			}if(coffee==0) {
				System.out.println("커피가 소진되었습니다");
				break;
			}
			System.out.println("남은커피갯수는"+coffee+"개 입니다.");
		}
		
	}
	
}
