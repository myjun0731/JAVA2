package EP10_17;

public class EP17 {
	public static void main(String[] args) {
		// Q1. Runnable 람다 표현식을 사용하여 "Running thread"를 출력하는 쓰레드를 생성하고 실행하세요.
		Runnable runnable = () -> System.out.println("Running thread");
		Thread thread = new Thread(runnable);
		thread.start();

		// Q2. Runnable 람다 표현식을 사용하여 1부터 5까지 숫자를 출력하는 쓰레드를 생성하고 실행하세요.
		Runnable numberRunnable = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
			}
		};
		Thread numberThread = new Thread(numberRunnable);
		numberThread.start();

		// Q3. 람다 표현식을 사용하여 두 정수의 합을 반환하는 함수형 인터페이스를 정의하고 사용하세요.
		interface IntegerMath {
			int operation(int a, int b);
		}

		IntegerMath addition = (a, b) -> a + b;
		System.out.println("Addition: " + addition.operation(5, 3));

		// Q4. 람다 표현식을 사용하여 문자열 리스트의 각 문자열 길이를 출력하세요.
		java.util.List<String> stringList = java.util.Arrays.asList("apple", "banana", "cherry");
		stringList.forEach(s -> System.out.println("Length of " + s + ": " + s.length()));

		// Q5. 쓰레드 풀을 사용하여 1부터 10까지 숫자를 출력하는 여러 쓰레드를 실행하세요.
		java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(5);
		for (int i = 1; i <= 10; i++) {
			final int number = i;
			executor.submit(
					() -> System.out.println("Thread " + Thread.currentThread().getName() + " prints: " + number));
		}
		executor.shutdown();
	}
}