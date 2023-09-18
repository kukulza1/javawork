package array2D;

public class ArrAlphabet1 {
           
	public static void main(String[] args) {
	         //대문자 26자를 배열에 저장
	        //for문출력
		 char c = 'A';
		 System.out.println(c);
		System.out.println((int)c);
		
		char c2 =66;
		System.out.println(c2);
		
	      
		
		//일반for문으로 알파벳출력
		char c3;
		for( c3=65; c3<=90; c3++) {
	    	   System.out.print(c3+ " ");
	    	  
	       }
		 System.out.println("변수의마지막값"+(char)(c3-1));
		System.out.println("\n===알파벳을 배열에 저장하고 출력==");
		
		char[] alphabets =new char[26];
		char ch = 'A';
		
		alphabets[0]=ch;
		//System.out.println(alphabets[0]);
		   //자바 덧셈뺄셈연산시 int형으로 바뀜
		//ch++;
		//alphabets[1]= ch;
		//System.out.println(alphabets[1]);
		
		//알파벳을 배열에 저장 - 1증가
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] =ch;
			ch++;
			
		}
		//알파벳 출력
		for(int i=0; i<alphabets.length; i++) {
			System.out.print(alphabets[i]+" ");
		}
		
}
}