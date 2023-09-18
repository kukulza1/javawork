package data;

public class ByteTypeT {

	public static void main(String[] args) {
		// byte관련 자료형
		//정수 자료형- byte, short,int,long
		//byte의 범위 -128 ~127 
		//short의 범위 -32768~32767
		byte b=-128;
		System.out.println(b);
		
		//byte b2=128;//범위초과
	    //System.out.println(b2);
		
		short s =128;
		System.out.println(s);
		
		//10진수, 2진수,16진수 출력
		//객체의 이름과주소
		ByteTypeT test =new ByteTypeT();
        System.out.println(test);
        
        int num=10;     //10진수
        int bNum=0b1010;//2진수를 표기할때 접두어로0b를 붙임
        int hNum=0XA;   //16진수를 표기할때 0X를 붙힘
        System.out.println(num);
        System.out.println(bNum);
        System.out.println(hNum);
        
        //2진수 32bit로 5표기
        //-5를 2진수로 표기
        //음수만드는법 1.보수를 만듬 2.보수에(1)을더함
        int val1 =0B00000000000000000000000000000101;//5
        int val2 =0B11111111111111111111111111111010;//-6
        int val3 =0B11111111111111111111111111111011;//-6+1=-5
        System.out.println(val3);
        
	}

}
