package hackerrank;

import java.util.Arrays;

public class CesarCipher {

	public static String caesarCipher(String s, int k) {
		String decoded = null;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '-') {
				decoded = decode(s,k);
			}
		}
		return decoded;
	}

	public static String decode(String s, int k) {
		char[] decoded = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			decoded[i+k] = s.charAt(i);
			// if (decoded[i+1] == null) {

			// }
		}
		return Arrays.toString(decoded);
	}

	public static void main(String args[]) {
		String s = "middle-Outz";

		String decoded = caesarCipher(s, 3);

		System.out.println(decoded);
	}
}
