package forEx;

public class NestedFor01 {

	public static void main(String[] args) {
		// 중첩 for문
		//5행 5열에 '*'
		for(int i=1; i<=5; i++) {//행 가로
			for(int j=1; j<=6-i; j++) {//열 세로
				System.out.print('h');
		}
			System.out.println();//한줄띄움
		
	}
		for(int i=1; i<=5; i++) {//행 가로
			for(int j=5; j>=i; j--) {//열 세로
				System.out.println("i="+i+",j="+j);
				//System.out.print('h');
		}
			System.out.println();//한줄띄움
		
	}         
}
}