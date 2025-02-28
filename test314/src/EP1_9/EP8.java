package EP1_9;

//Q1. Animal 클래스를 생성하고 sound() 메소드를 추가하세요.
class Animal {
	public void sound() {
		System.out.println("Animal makes a sound");
	}
}

//Q2. Dog 클래스가 Animal 클래스를 상속받도록 하세요.
class Dog extends Animal {
	// Q3. Dog 클래스에서 sound() 메소드를 오버라이딩하여 "Woof"를 출력하도록 하세요.
	@Override
	public void sound() {
		System.out.println("Woof");
	}
}

public class EP8 {
	public static void main(String[] args) {
		// Q4. Animal 클래스의 인스턴스를 생성하고 sound() 메소드를 호출하세요.
		Animal animal = new Animal();
		animal.sound();

		// Q5. Dog 클래스의 인스턴스를 생성하고 sound() 메소드를 호출하세요.
		Dog dog = new Dog();
		dog.sound();
	}
}