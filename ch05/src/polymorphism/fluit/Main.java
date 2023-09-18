package polymorphism.fluit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.포도 | 2.바나나 | 3. 복숭아");
		System.out.println("선택>");
		
		
		int selNum = Integer.parseInt(scanner.nextLine());
		
		Fluit fluit = null;
		if(selNum == 1) {
			fluit = new Grape();
			
		}else if(selNum ==2 ){
			fluit = new Banana();
		}else if(selNum == 3) {
			fluit = new Peach();
		}else
			System.out.println("지원하지않습니다.");
		
		fluit.showFluitInfo();
		
		
		scanner.close();
	}

}
