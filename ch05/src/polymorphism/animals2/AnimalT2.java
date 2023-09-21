package polymorphism.animals2;



class Animal{
	public void move() {
		
		System.out.println("동물이 움직입니다,");
	}
}
class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 걷습니다");
	}
		public void readBook() {
			System.out.println("사람이 책을 읽습니다.");
		}
	}
class tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가뜁니다");
	}
	public void hunt() {
		System.out.println("호랑이의 사냥");
	}
	
}
public class AnimalT2{
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	
	
	public static void main(String[] args) {
		AnimalT2 aTest = new AnimalT2();
		
		
		//Animal(부모)타입으로 객체생성(다형성)-자동형변환
		System.out.println("==========자동형변환=====");
		Animal a1 = new Human();
		Animal a2 = new tiger();
		
		a1.move();
		a2.move();
		
		//강제형변환 instanceof 사용
		System.out.println("=============강제형변환============");
		if(a1 instanceof Human) {
			Human G2 = (Human)a1; //자식타입=(자식)부모타입
			 G2.readBook();
		}
				if(a2 instanceof tiger) {
					tiger G3 = (tiger)a2; 
					 G3.hunt();
	}
            //크기가 3인 Animal 인스턴스를 저장할 배열 생성
		/*AnimalT2 animals = new AnimalT2[2];
		
		animals[0]= new Human();
		animals[1]= new tiger();
		
		for(int i=0;i<animals.length;i++) {
			Animal animal =animals[i];
			if(animal instanceof Human) {
				Human G2 = (Human)animal;
				G2.readBook();
			}else if(animal instanceof tiger) {
				tiger G3 = (tiger)animal;
				G3.move();
			}else {
				System.out.println("미지원");
			}
		}*/
		
		
}
}  
	

