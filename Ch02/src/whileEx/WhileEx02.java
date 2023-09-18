package whileEx;

public class WhileEx02 {

	public static void main(String[] args) {
		// 1부터10까지의 합계
		
		/*n +=1; //0+1=1
		 * n +=2;// 1+2=3
		 */
		
		
		
		
		int n =0;
		int sum = 0;
		while(n<10){
			n++;
			//sum=sum+n;
			sum +=n;
			System.out.println("n="+n+"sum="+sum);
		}
            System.out.println("1~10합계:"+sum);
	}

}
