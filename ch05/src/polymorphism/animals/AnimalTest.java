package polymorphism.animals;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 걷습니다.");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
}

public class AnimalTest {
	
	//moveAnimal()정의 -매개변수의 다형성
	public void moveAnimal(Animal animal) { //static시 moveAnimal(human); new-static없음 
		animal.move();
	}
   //자동형변환
	public static void main(String[] args) {
		//AnimalTest 객체생성
		AnimalTest aTest = new AnimalTest();
		
		//Animal타입으로 객체생성(다형성)
		Animal human = new Human();
		Animal eagle = new Eagle();
		
		
		aTest.moveAnimal(human);
		aTest.moveAnimal(eagle);
	}

}
