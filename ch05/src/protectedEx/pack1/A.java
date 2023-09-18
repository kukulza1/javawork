package protectedEx.pack1;

public class A {
      //protected-다른패키지는 접근불가 같은패키지내에서만 가능
	  //다른패키지는 상속관계(extends)에서 가능
	
	protected String field;
      
       
	protected A(){} //default
       
	protected void method() {}
}
