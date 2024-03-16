package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class AmazonSuggestion {
	/*
	 * Complete the 'searchSuggestions' function below.
	 *
	 * The function is expected to return a 2D_STRING_ARRAY.
	 * The function accepts following parameters:
	 *  1. STRING_ARRAY repository
	 *  2. STRING customerQuery
	 */

	public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {

		List<List<String>> suggestions = new ArrayList<>();

		for (int i = 0; i < customerQuery.length()-1; i++) {
			List<String> sugestoes = new ArrayList<>();
			for (int j = 0 ; j < repository.size(); j++) {
				if (repository.get(j).contains(customerQuery.substring(0, Math.min(i+2, customerQuery.length())))) {
					sugestoes.add(repository.get(j));
				}
			}

			//[1,2,3,4,5,6]
			sugestoes.sort((a,b) -> a.compareTo(b));
			if (sugestoes.size() > 3) {
				for (int l = 3; l < sugestoes.size() - 1; l++) {
					sugestoes.remove(l);
					sugestoes.remove(l-1);
				}
			}
			suggestions.add(sugestoes);


		}
		return suggestions;
	}
}
