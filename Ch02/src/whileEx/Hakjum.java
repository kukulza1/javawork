package whileEx;

import java.util.Scanner;

public class Hakjum {

	public static void main(String[] args) {
		// 변수-점수score1,학점-grade
		//A-90~100 B-89~70 C-69~50 D49~30 F<30
		Scanner sc = new Scanner(System.in);
		
		//입력
		char grade = 'A';
		System.out.println("점수를입력하세요");
		int score1 = sc.nextInt();
		
		//연산
		if(score1>=90 && score1 <=100) {//true && true
		 grade = 'A';
			System.out.println(grade+"학점입니다.");
		}else if(score1<90 && score1>=70 ) {
			grade='B';
			System.out.println(grade+"학점입니다.");
		}else if(score1<70 && score1>=50) {
			grade='c';
			System.out.println(grade+"학점입니다.");
		}else if(score1<50 && score1>=30) {
			grade='D';
			System.out.println(grade+"학점입니다.");
					
		}else {
			grade='F';
			System.out.println(grade+"학점입니다.");
		}
		sc.close();
		
		

	  }

     }
 
