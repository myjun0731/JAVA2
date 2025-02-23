package test314;

public class EP2 {
	public static void main(String[] args) {

		// Q1. 정수형 변수 num을 선언하고 15로 초기화하세요.
		int num = 15;

		// Q2. num이 10보다 큰 경우 "num is greater than 10"을 출력하는 if문을 작성하세요.
		if (num > 10) {
			System.out.println("num is greater than 10");
		}

		// Q3. 1부터 5까지 숫자를 출력하는 for문을 작성하세요.
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		// Q4. 문자형 변수 grade를 선언하고 'B'로 초기화하세요.
		char grade = 'B';

		// Q5. grade가 'A'인 경우 "Excellent", 'B'인 경우 "Good", 'C'인 경우 "Average"를 출력하는
		// switch문을 작성하세요.
		switch (grade) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Average");
			break;
		}
	}
}