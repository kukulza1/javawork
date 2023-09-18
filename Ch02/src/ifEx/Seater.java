package ifEx;

import java.util.Scanner;

public class Seater {

	public static void main(String[] args) {
		// 입장객 수에 따른 좌석의 줄(행)
		//변수 customer(고객수) ,column(열 수), row(줄 수)
		Scanner sc =new Scanner(System.in);
		
		System.out.println("입장객 수 입력");
		int customer =sc.nextInt();
		System.out.println("좌석열수입력");
		int column=sc.nextInt();
		int row=0;
		
		//연산처리(if~else문)
        if(customer%column==0) {
        	row = customer /column;
			
		}else {//나머지가있을경우
			row = customer/ column +1;
		}
		
		System.out.println(row+"줄이 필요합니다.");
		sc.close();

	}

}
