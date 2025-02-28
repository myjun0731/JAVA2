package EP10_17;

class Animal {

	public void sound() {

		System.out.println("Animal makes a sound");

	}

}

class Dog extends Animal {

// Q1. sound() 메소드를 오버라이딩하여 "Woof"를 출력하도록 하세요.

	@Override

	public void sound() {

		System.out.println("Woof");

	}

// Q2. sound(String type) 메소드를 오버로딩하여 type에 따라 다른 소리를 출력하도록 하세요.

	public void sound(String type) {

		if (type.equals("angry")) {

			System.out.println("Grrr");

		} else {

			System.out.println("Woof");

		}

	}

}

public class EP10 {
	public static void main(String[] args) {

// Q3. Animal 클래스의 인스턴스를 생성하고 sound() 메소드를 호출하세요.

		Animal animal = new Animal();

		animal.sound();

// Q4. Dog 클래스의 인스턴스를 생성하고 sound() 메소드를 호출하세요.

		Dog dog = new Dog();

		dog.sound();

// Q5. Dog 클래스의 인스턴스를 생성하고 sound("angry") 메소드를 호출하세요.

		dog.sound("angry");

	}

}