package absracts.animal;

public class Cat extends Animal{
	//부모 클래스 추상메서드가 있으면 반드시 구현해야함
	//unimplemented method
	public Cat() {
		this.kind ="고양이";
		System.out.println(kind);
	}

	@Override
	public void sound() {
		System.out.println("야~옹!");
		
	}

}
