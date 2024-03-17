package hackerrank.lists;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
	public static List<Integer> rotateLeft(int d, List<Integer> arr) {

		List<Integer> answer = new ArrayList<>();
		for (int i = d; i < arr.size(); i++) {
			answer.add(arr.get(i));
		}
		for (int i = 0; i < d; i++) {
			answer.add(arr.get(i));
		}
		return answer;

	}
}
