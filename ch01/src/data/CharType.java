package data;

public class CharType {

	public static void main(String[] args) {
		// 문자 자료형 - char(한글자)'', string(문자열)""
		char alpha = 'A';
		System.out.println(alpha);
		System.out.println((int)alpha);// 복제-alt+ctrl+방향키(아래)// 65<-A의 아스키 코드값 ///형변환
		
		int alpha2 = 66;
		System.out.println(alpha2);
		System.out.println((char)alpha2); //B
		
		//유니코드=16bit=2byte
		char Unic1 ='한';
		System.out.println(Unic1);
		
		char Unic2='\uD55c';
				System.out.println(Unic2);
		char Unic3='\uAE00';
		  System.out.println(Unic3);
		
		

	}

}
