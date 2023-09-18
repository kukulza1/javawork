package arrays;

public class Arraygugudan {

	public static void main(String[] args) {
		// 구구단3단 출력
		int dan = 3;
		
		for(int i=1; i<10; i++) {
			System.out.println(dan+"x"+i+"="+dan*i);
		}
          System.out.println("=====================");
          int[] gugu = new int[9];
         /* gugu[0] = dan*1;
          gugu[1] = dan*2;
          gugu[2] = dan*3;
          gugu[3] = dan*4;
          gugu[4] = dan*5;
          gugu[5] = dan*6;
          gugu[6] = dan*7;
          gugu[7] = dan*8;
          gugu[8] = dan*9;*/
          
          
          for(int i=0; i<gugu.length; i++) {
        	  
        	  gugu[i] = dan*(i+1);
        	  System.out.println((i+1)+"x"+dan +"="+gugu[i]);
        	  
          }
          System.out.println("=22222222222222222222222222");
          //배열복사
          int[] gugu2 = new int[9];
          //1.일반복사
          for(int i=0;i<gugu.length;i++) {
        	  gugu2[i]=gugu[i];
          }
          for(int i=0; i<gugu2.length;i++) {
        	  System.out.println(gugu2[i]);
          }
          System.out.println("===33333333333333333333333333333333333333333");
          //object 클래스의 clone()
          int[] gugu3 = gugu2.clone();
          for(int i=0;i<gugu3.length;i++) {
        	  System.out.println(gugu3[i]);
          }
          
	}

}
