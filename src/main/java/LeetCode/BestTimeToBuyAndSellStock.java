package LeetCode;

public class BestTimeToBuyAndSellStock {
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};

		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		// achar o menor. achar o maior
		// se o maior vier antes do menor, retornar 0
		// se nao, subtrair e retornar

		int imenor = 0;
		int imaior = 0;

		int menor = prices[0];
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < menor) {
				menor = prices[i];
				imenor = i;
			}
		}
		System.out.println("Menor "+menor+ " imenor: "+imenor);

		int maior = prices[imenor];
		for (int ii = imenor; ii < prices.length; ii++) {
			if (prices[ii] > maior) {
				maior = prices[ii];
				imaior = ii;
			}
		}

		System.out.println("maior "+maior+ " imaior: "+imaior);

		if (imenor > imaior) {
			return 0;
		} else {
			return prices[imaior]-prices[imenor];
		}
	}
}
