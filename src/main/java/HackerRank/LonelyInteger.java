package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class LonelyInteger {

	public static int lonelyInteger(List<Integer> a) {
		int[] count = new int[200];
		int valor = 0;

		for (int i = 0; i < a.size(); i++) {
			count[a.get(i)]++;
		}

		for (int j = 0; j < a.size(); j++) {
			if (count[a.get(j)] <= 1) {
				valor = a.get(j);
			}
		}

		return valor;

	}

	public static void main (String args[]) {
		List<Integer> a = new ArrayList<>();

		a.add(1);
		a.add(1);

		a.add(4);

		a.add(13);
		a.add(13);
		a.add(13);

		int r = lonelyInteger(a);

		System.out.println(r);
	}

}
