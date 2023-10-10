package HackerRank;

import java.util.Collections;
import java.util.List;

public class SalesByMatch {
	public static int sockMerchant(int n, List<Integer> ar) {
		int isPair = 0;
		Collections.sort(ar);

		for (int i = 0; i < n -1; i++) {
			if (ar.get(i) == ar.get(i+1)) {
				isPair++;
				i = i +1;
			}
		}
		return isPair;
	}
}
