package reals;

class Tly {

	public static void main(String[] args) {
		int[] A = {4, 35, 80, 123, 12345, 44, 8, 5,24,3};
		solution(A, 4);
	}


	public static void solution(int[] A, int K) {
		int maior = A[0];
		for (int k : A) {
			if (k > maior) maior = k;
		}
		int num_hifens = String.valueOf(maior).length();
		int num_spaces = String.valueOf(maior).length();
		String hifens = "-".repeat(num_hifens);

		for (int i = 0; i < A.length; i++) {
			var count = 0;
			System.out.print("+");
			for (int ii = 0; ii < K; ii++) {
				System.out.print(hifens+"+");
				count++;
				if (count == K ) System.out.println("");
			}
			var count2 = 0;
			System.out.print("|");
			for (int ii = 0; ii < K; ii++) {
				System.out.print(String.format("%"+(num_spaces)+"d|", A[i]));
				count2++;
				if (count2 == K ) System.out.println("");
			}
		}
	}
}
