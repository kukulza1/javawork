package seats;

import java.util.Scanner;

public class SeatAl1ocation {

	public static void main(String[] args) {
		// 자리 배치도
		//변수-customer입장객수, column(좌석열수) ,row(줄)
		
		Scanner sc = new Scanner(System.in);
         
		System.out.println("입장객 수");
		int customer = sc.nextInt();
		
		System.out.println("좌석 열수 ");
		int column =sc.nextInt();
		
		int row;
		
		if(customer/column ==0) {
			row= customer/column;
		}else {
			row= customer/column+1;
		}
	    
		for(int i=0;i<row; i++) {
			for(int j=1;j<=column; j++) {
				int seatNum =column*i+j;
				if(seatNum>customer)
					break;
				System.out.print("좌석"+seatNum+" ");
				//System.out.print(column*i+j+" ");
			}
	          System.out.println();
		}
	
	     sc.close();
	}
	
	

}
