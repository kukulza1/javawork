package dog;

public class DogArray {

	public static void main(String[] args) {
		// Dog 인스턴스 4개를 생성하여 배열에 저장하고
		//출력하세요
		Dog[] dogs = new Dog[4];
		
		//배열에 저장(입력)
		dogs[0]= new Dog("GG","잡종");
		dogs[1]= new Dog("SG","도베르만");
		dogs[2]= new Dog("WG","웰시코기");
		dogs[3]= new Dog("YG","시추");
		
		//전체출력
		
		for(int i=0; i<dogs.length; i++) {
			System.out.println(dogs[i].getName()+ ","+
					dogs[i].getType());
			}
		System.out.println("=====================");
		//향상된 for문
		for(Dog dog: dogs) {
			System.out.println(dog.getName()+ ", " 
		    + dog.getType());
		}
	
	
	}
	
}
