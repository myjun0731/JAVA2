package EP10_17;

public class EP14 {
	// Q1. 0으로 나누는 예외를 처리하는 divide() 메서드를 작성하세요.
	public static int divide(int a, int b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
			return 0;
		}
	}

	// Q2. 음수 값을 입력받는 경우 예외를 던지는 processPositiveNumber() 메서드를 작성하세요.
	public static void processPositiveNumber(int number) throws IllegalArgumentException {
		if (number < 0) {
			throw new IllegalArgumentException("Number must be positive");
		}
		System.out.println("Number: " + number);
	}

	public static void main(String[] args) {
		// Q3. divide() 메서드를 호출하고 결과를 출력하세요.
		System.out.println("Result: " + divide(10, 2));
		System.out.println("Result: " + divide(10, 0));

		// Q4. processPositiveNumber() 메서드를 호출하고 예외를 처리하세요.
		try {
			processPositiveNumber(5);
			processPositiveNumber(-5);
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}