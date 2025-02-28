package EP1_9;

public class EP3 {
	public static void main(String[] args) {

		// Q1. 정수형 배열 arr을 선언하고 1, 2, 3, 4, 5로 초기화하세요.
		int[] arr = { 1, 2, 3, 4, 5 };

		// Q2. arr의 모든 요소를 출력하는 for문을 작성하세요.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// Q3. arr의 요소 중 3보다 큰 수를 출력하는 if문을 for문 안에 작성하세요.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 3) {
				System.out.println(arr[i]);
			}
		}

		// Q4. 문자형 변수 day를 선언하고 "Monday"로 초기화하세요.
		String day = "Monday";

		// Q5. day가 "Monday"인 경우 "월요일", "Tuesday"인 경우 "화요일"을 출력하는 switch-case 문을 작성하세요.
		switch (day) {
		case "Monday":
			System.out.println("월요일");
			break;
		case "Tuesday":
			System.out.println("화요일");
			break;
		}
	}
}