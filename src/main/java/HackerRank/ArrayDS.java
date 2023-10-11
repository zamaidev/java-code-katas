package HackerRank;

import java.util.List;

public class ArrayDS {
	public static int hourglassSum(List<List<Integer>> arr) {

		int qtdLinhas = arr.size();
		int qtdColunas = arr.get(0).size();
		int total = 0;
		int max = Integer.MIN_VALUE;

		for (int linha = 0; linha < qtdLinhas; linha++) {
			for (int coluna = 0; coluna < qtdColunas; coluna++) {
				total = arr.get(linha).get(coluna) + arr.get(linha).get(coluna+1) + arr.get(linha).get(coluna+2);
				total += arr.get(linha+1).get(coluna+1);
				total += arr.get(linha+2).get(coluna) + arr.get(linha+2).get(coluna+1) + arr.get(linha+2).get(coluna+2);
				max = Math.max(total, max);
			}
		}
		return max;
	}
}
