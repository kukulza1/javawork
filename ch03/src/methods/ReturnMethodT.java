package methods;

public class ReturnMethodT {

	 //return이 있는함수(반환 자료형)-int,String
	//호출한 곳으로 반환값을 보냄
	 
	public static void main(String[] args) {
		
	 int n1 =10, n2=20; //지역변수
	 //더하기 함수 호출
	int result = add(n1,n2);
	System.out.println(result);
	//제곱수 호출
         int res2= square(n1);
         System.out.println(res2);
	 //
         String msg= messege();
          System.out.println(msg);

	}  //return이 있고, 매개변수가 2개인 함수이름 add()
           public static int add(int a,int b) {
        	   return a+b;
           }
           //매개변수가 1개인 함수
           public static int square(int x){
        	   return  x*x;   
           }
             //return이 있고 매개변수가 없는함수
           public static String messege() {
        	   return "good luck";
           }
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
}
