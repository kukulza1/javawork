package constant;

import java.util.Scanner;

public class KMtoMile {

	public static void main(String[] args) {
		// km을 입력받아서 마일로 출력하는 프로그램
		//상수 1mile-1.609344km
		//변수-kph mph
		
		Scanner sc =new Scanner(System.in);
		System.out.print("km값을 입력하세요:");
		//입력
		final double mile =1.609344;
		double kph =sc.nextDouble();
		double mph =kph*mile;
		
	
		
		//출력
		System.out.println(kph+"km는"+mph+"mile입니다.");
		sc.close();

	}

}
