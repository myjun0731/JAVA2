package EP10_17;

class Box<T> {
	private T item;

	// Q1. item 필드의 값을 설정하는 setItem() 메서드를 작성하세요.
	public void setItem(T item) {
		this.item = item;
	}

	// Q2. item 필드의 값을 반환하는 getItem() 메서드를 작성하세요.
	public T getItem() {
		return item;
	}
}

public class EP16 {
	public static void main(String[] args) {
		// Q3. Box<Integer> 인스턴스를 생성하고 정수 10을 설정하고 출력하세요.
		Box<Integer> intBox = new Box<>();
		intBox.setItem(10);
		System.out.println("Integer box: " + intBox.getItem());

		// Q4. Box<String> 인스턴스를 생성하고 문자열 "Hello"를 설정하고 출력하세요.
		Box<String> stringBox = new Box<>();
		stringBox.setItem("Hello");
		System.out.println("String box: " + stringBox.getItem());
	}
}