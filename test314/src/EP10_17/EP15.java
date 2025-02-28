package EP10_17;

import java.util.*;

public class EP15 {
	public static void main(String[] args) {
		// Q1. ArrayList에 정수 1, 2, 3을 추가하고 출력하세요.
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("List: " + list);

		// Q2. HashSet에 문자열 "apple", "banana", "apple"을 추가하고 출력하세요.
		Set<String> set = new HashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("apple");
		System.out.println("Set: " + set);

		// Q3. HashMap에 키 "one"에 값 1, 키 "two"에 값 2를 추가하고 출력하세요.
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		System.out.println("Map: " + map);

		// Q4. List의 첫 번째 요소를 가져와 출력하세요.
		System.out.println("First element of list: " + list.get(0));

		// Q5. Set에 "apple"이 있는지 확인하고 출력하세요.
		System.out.println("Set contains apple: " + set.contains("apple"));

		// Q6. Map에서 키 "two"의 값을 가져와 출력하세요.
		System.out.println("Value of key two: " + map.get("two"));
	}
}