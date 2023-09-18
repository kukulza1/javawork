package classes.constructer;

//참조 자료형 - Person클래스 정의
//생성자 오버로딩 -이름이 같고 자료형이 다름
public class Person {
	String name;
	float height;
	float weight;
	
	//기본생성자
	public Person() {}
     
	
		
		//매개변수가 있는 생성자
		public Person(String n) {
			name = n;
			
		}
		//매개변수가 있는생성자(모든필드)
		public Person(String n, float h,float w){
			name= n; //외부에서 입력된 이름을 저장
			height=h;
			weight=w;
		}
		//메서드
		public void showPersonInfo() {
			System.out.printf("이름은 %s, 키는%.1f, 몸무게는%.1f",
					            name, height, weight);
			
		}
	}


