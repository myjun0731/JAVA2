package EP1_9;

public class EP4 {
	public static void main(String[] args) {

		// Q1. 정수형 변수 score를 선언하고 85로 초기화하세요.
		int score = 85;

		// Q2. score가 70점 이상이면 "합격", 아니면 "불합격"을 출력하는 if-else 문을 작성하세요.
		if (score >= 70) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		// Q3. 문자열형 배열 fruits를 선언하고 "apple", "banana", "orange"로 초기화하세요.
		String[] fruits = { "apple", "banana", "orange" };

		// Q4. fruits의 모든 요소를 출력하는 for each 문을 작성하세요.
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// Q5. 정수형 변수 count를 선언하고 0으로 초기화하세요.
		int count = 0;

		// Q6. count가 10보다 작은 동안 count를 출력하고 1씩 증가시키는 while 문을 작성하세요.
		while (count < 10) {
			System.out.println(count);
			count++;
		}
	}
}