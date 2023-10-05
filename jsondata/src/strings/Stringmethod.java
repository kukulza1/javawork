package strings;

import java.util.Scanner;

public class Stringmethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//주민등록번호
		System.out.println("주민번호를 입력하세요.");
		String pid = sc.nextLine();
		String yyyymmdd = pid.substring(0,6);
		System.out.println(pid.length());
		
		System.out.println("생년월일은:"+yyyymmdd);
		
		String secondnum= pid.substring(7);
		System.out.println("뒷자리는"+secondnum);
		
		char gen = pid.charAt(7);
		if(pid.length()==14) {
		
		if(gen=='1'||gen=='3') {
			System.out.println("남성");
		}
		if(gen=='2'||gen=='4') {
			System.out.println("여성");	
		}
	}else {
		System.out.println("잘못된형식입니다.");
	}

	}

}
