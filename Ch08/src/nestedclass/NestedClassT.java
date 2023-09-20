package nestedclass;

class A{
	A(){
		System.out.println("A객체생성");
	}
	
	//내부 인스턴스 맴버 클래스
	class B{
		  int field1;
		  // static int ff; 내부클래스에서 static변수가 생성안됨
			B(){System.out.println("B객체 생성");}
			void method() {}
			
				
		
			
	}
	//내부 정적 맴버 클래스
	static class C{
		int field1;
		static int field2;
		C(){System.out.println("C객체생성");}
		void method1() {}
		static void method2() {}
		}
	//매서드 내부 로컬클래스 사용
	void method() {
		class D{
			int field1;
			//static int field2;
			D(){System.out.println("D객체생성");}
			void method1() {};
		}
		//D객체생성
		D d = new D();
		d.field1 =11;
		d.method1();
	}
	
	}
public class NestedClassT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          A a = new A();
          
          //B객체 생성
          A.B b = a.new B();
          b.field1 = 3;
          b.method();
          
          A.C c = new A.C();
          c.field1=2;
          c.method1();
          A.C.field2 = 3;
          c.method2();
          
          //D 클래스의 메서드 호출
          a.method();
          
	}

}
