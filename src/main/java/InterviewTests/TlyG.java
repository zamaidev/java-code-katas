package InterviewTests;

import java.util.Arrays;

class TlyG {

	public static void main(String[] args) {
		int[] A = {4, 35, 80, 123, 12345, 44, 8, 5,24,3};
		solution(A, 4);
	}


	public static void solution(int[] A, int K) {
		int maior = Arrays.stream(A).max().orElse(0);
		int num_hifens = String.valueOf(maior).length();
		int num_spaces = String.valueOf(maior).length();
		String hifens = "-".repeat(num_hifens);

		for (int i = 0; i < A.length; i += K) {
			for (int j = 0; j < K && i + j < A.length; j++) {
				System.out.print("+");
				System.out.print(hifens);
			}
			System.out.println("+");

			for (int j = 0; j < K && i + j < A.length; j++) {
				System.out.print("|");
				System.out.printf("%" + num_spaces + "d", A[i + j]);
			}
			for (int j = K - Math.min(K, A.length - i); j > 0; j--) {
				System.out.print("|" + " ".repeat(num_spaces));
			}
			System.out.println("|");
		}
		if (A.length % K != 0) {
			for (int j = 0; j < K - (A.length % K); j++) {
				System.out.print("+");
				System.out.print(hifens);
			}
			System.out.println("+");
		}
	}
}
