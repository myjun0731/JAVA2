package EP10_17;

class Student {
	private String name;
	private int age;

	// Q1. name 필드의 값을 설정하는 setName() 메서드를 작성하세요.
	public void setName(String name) {
		this.name = name;
	}

	// Q2. name 필드의 값을 반환하는 getName() 메서드를 작성하세요.
	public String getName() {
		return name;
	}

	// Q3. age 필드의 값을 설정하는 setAge() 메서드를 작성하세요.
	public void setAge(int age) {
		this.age = age;
	}

	// Q4. age 필드의 값을 반환하는 getAge() 메서드를 작성하세요.
	public int getAge() {
		return age;
	}
}

public class EP13 {
	public static void main(String[] args) {
		// Q5. Student 클래스의 인스턴스를 생성하고 이름과 나이를 설정하고 출력하세요.
		Student student = new Student();
		student.setName("Alice");
		student.setAge(20);
		System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
	}
}