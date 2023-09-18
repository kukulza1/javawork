package input;

import java.util.Scanner;

public class BonusPointT {

	public static void main(String[] args) {
		// 고객의 이름, 구매금액을 입력
		//이름과 구매포인트 출력
		//구매포인트=상품가격(price)*포인트적립율(bonusRatio)
		Scanner sc= new Scanner(System.in);
		
		System.out.print("성함을 입력하시오:");
		String customer =sc.nextLine();
		
		System.out.print("구매 금액을 입력하시오:");
		int price = sc.nextInt();//사용자-금액입력
		double bonusRatio=0.02;
		int bonusPoint = 0;
		
		//계산
		bonusPoint = (int)(price * bonusRatio); //정수형으로 형변환
		
		
		//출력
		System.out.println(customer+"님의 보너스 포인트는 "+bonusPoint+"점 입니다");
		
		sc.close();
	
	
	}

}
