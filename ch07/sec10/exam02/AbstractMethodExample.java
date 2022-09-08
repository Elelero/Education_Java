package ch07.sec10.exam02;

public class AbstractMethodExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		//매개변수 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
		
	//animalSound 정적 메소드 선언
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
