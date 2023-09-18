package scores;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {
		// 성적처리 프로그램
		//입력시 잘못된입력이 있는경우-예외처리 try~~catch구문사용
		Scanner sc =new Scanner(System.in);
		
		boolean sw = true;
		int studentC =0;
		int[] scores =null;
		
		
		while(sw) {
	try { 
				
		System.out.println("====================================");
		System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
		System.out.println("====================================");
	    //문자를 숫자로 변환(String,integer
		int menu= Integer.parseInt(sc.nextLine());
		
		if(menu ==1 ) {
			System.out.println("학생수>");
			studentC =Integer.parseInt(sc.nextLine());
			scores = new int[studentC];//배열의크기 =학생수
		
		
		}else if(menu==2) {//점수저장
			for(int i=0;i<scores.length; i++) { 
				System.out.print("점수["+i+"]>");
	      scores[i]=Integer.parseInt(sc.nextLine());
	   }
		
		
		}else if(menu==3) {
			for(int i=0;i<scores.length; i++){
				System.out.print("scores[" + i +"]="+scores[i]);
				scores[i]=Integer.parseInt(sc.nextLine());
		}
			
			
			
		
		}else if(menu==4) {
			int sumV = 0;
			double avg;
			int maxV=scores[0];
			
			for(int i=0;i<scores.length; i++){
				sumV +=scores[i];
				if(scores[i]>maxV)
					maxV=scores[i];
			}
		    avg=sumV/scores.length;
		    System.out.printf("평균:%f\n",avg);
		    System.out.println("최고점수"+maxV);
		}else if(menu==5) {
			sw = false;
		}else {
			System.out.println("지원하지 않는기능입니다.");
		}
	}catch(Exception e){
		System.out.println("올바른입력이 아닙니다 숫자를입력하세요");}
		
		
	    
	    
	    
	    
	    
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
		

}
