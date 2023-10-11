package GeeksForGeeks;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
	{
		int i = 0, j = 0;
		ArrayList<Integer> auxList = new ArrayList<>();

		while (i < n)
		{
			int soma = arr[i];

			if (soma == s) { //deu certo
				auxList.add(i+1); //retorna a 1 pos
				auxList.add(j+1); //retorna a ultima pos
				return auxList;
			}
			j = i + 1;
			while (j < n) {
				soma += arr[j];
				if (soma == s) {
					auxList.add(i+1);
					auxList.add(j+1);
					return auxList;
				}
				if (soma > s) {
					break;
				}
				j++;
			}
			i++;
		}
		auxList.add(-1);
		return auxList;
	}
}
