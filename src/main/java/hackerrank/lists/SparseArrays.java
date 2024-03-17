package hackerrank.lists;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
	public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {

		List<Integer> answer = new ArrayList<>();
		for (int i = 0; i < queries.size(); i++) {
			int sum = 0;
			for (String x : stringList) {
				if (x.equals(queries.get(i))) {
					sum++;
				}
			}
			answer.add(sum);
		}
		return answer;
	}
}
