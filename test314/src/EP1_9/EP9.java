package EP1_9;

public class EP9 {

	private int age;
	private String name;

	// Q1. age를 매개변수로 받는 생성자를 작성하세요.
	public EP9(int age) {
		this.age = age;
	}

	// Q2. age와 name을 매개변수로 받는 생성자를 작성하세요.
	// this()를 사용하여 첫 번째 생성자를 호출하도록 하세요.
	public EP9(int age, String name) {
		this(age);
		this.name = name;
	}

	// Q3. age와 name을 출력하는 메소드를 작성하세요.
	public void printInfo() {
		System.out.println("Age: " + age + ", Name: " + name);
	}

	public static void main(String[] args) {
		// Q4. EP9 클래스의 객체를 생성하고 printInfo 메소드를 호출하여 age와 name을 출력하세요.
		EP9 person = new EP9(20, "Charlie");
		person.printInfo();
	}
}