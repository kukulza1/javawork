package methods;

public class MethodT01 {
	// 함수 정의(선언)와 호출(사용)
	

	public static void main(String[] args) {
		sayHello();//호출
		sayH("ㅀ");

	}
       //sayHello() 이름의 함수를정의 
	//void- 반환값이 없음(비어있다)
	public static void sayHello() {
		System.out.println("안녕~ㄹㄴ");
        	   
           }
//매개변수가(parameter)있는 함수정의
    public static void sayH(String name) {
    	System.out.println("hello"+name);
    }




}




