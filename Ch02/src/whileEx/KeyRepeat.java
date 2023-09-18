package whileEx;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// 'y'키 입력 -"출력 무한반복"
		//'n'키 입력 "반복 중단"
		//그 이외의 키 "지원하지않는 입력"
		
		//문자열 동등비교함수는 equals()
		Scanner sc = new Scanner(System.in);
		
		while(true) {
             System.out.println("계속 반복할까요?(y/n):");
             String key =sc.nextLine();
             //equals() - 문자가 일치하는 비교
             if(key.equals("y")||key.equals("Y")) { 
            	 System.out.println("반복합니다");
            	 
            	 
             }else if(key.equals("n")||key.equals("N")) {
            	 System.out.println("반복을 중단합니다");
            	 break;
             }else {
            	 System.out.println("키를 잘못눌렀습니다.");
             }
			
		}
                sc.close();
	}

}
