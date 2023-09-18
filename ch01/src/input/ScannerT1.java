package input;

import java.util.Scanner;

public class ScannerT1 {

	public static void main(String[] args) {
		// 입력처리 -scanner 클래스 사용
		//문자열 nextLine()
		//숫자 nextint()
		Scanner scanner =new Scanner(System.in);
		
		
		System.out.print("이름입력");
		String name = scanner.nextLine();
		
		
		System.out.println("나이입력");
		int age= scanner.nextInt();
		
		System.out.println("이름은"+name+"나이:"+age);
		
		scanner.close(); //닫기
	}

}
