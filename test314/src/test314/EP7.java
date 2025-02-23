package test314;

public class EP7 {

	// Q1. private 접근 제어자를 사용하여 정수형 변수 age를 선언하세요.
	private int age;

	// Q2. public 접근 제어자를 사용하여 문자열형 변수 name을 선언하세요.
	public String name;

	// Q3. age와 name을 매개변수로 받는 생성자를 작성하세요.
	public EP7(int age, String name) {
		this.age = age;
		this.name = name;
	}

	// Q4. age와 name을 출력하는 메소드를 작성하세요.
	public void printInfo() {
		System.out.println("Age: " + age + ", Name: " + name);
	}

	public static void main(String[] args) {
		// Q5. EP7 클래스의 인스턴스를 생성하고 printInfo 메소드를 호출하여 age와 name을 출력하세요.
		EP7 person = new EP7(25, "Alice");
		person.printInfo();

		// Q6. EP7 클래스의 또 다른 인스턴스를 생성하고 printInfo 메소드를 호출하여 age와 name을 출력하세요.
		EP7 person2 = new EP7(30, "Bob");
		person2.printInfo();
	}
}