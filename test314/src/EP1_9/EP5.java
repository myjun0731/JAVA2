package EP1_9;

public class EP5 {
	public static void main(String[] args) {

		// Q1. 정수형 변수 score를 선언하고 75로 초기화하세요.
		int score = 75;

		// Q2. score가 90점 이상이면 "A", 80점 이상이면 "B", 70점 이상이면 "C", 아니면 "F"를 출력하는 if-else
		// if-else 문을 작성하세요.
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}

		// Q3. 문자열형 배열 colors를 선언하고 "red", "green", "blue"로 초기화하세요.
		String[] colors = { "red", "green", "blue" };

		// Q4. colors의 모든 요소를 출력하는 for each 문을 작성하세요.
		for (String color : colors) {
			System.out.println(color);
		}

		// Q5. 정수형 변수 num을 선언하고 10으로 초기화하세요.
		int num = 10;

		// Q6. num이 0보다 큰 동안 num을 출력하고 1씩 감소시키는 do-while 문을 작성하세요.
		do {
			System.out.println(num);
			num--;
		} while (num > 0);
	}
}