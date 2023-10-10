package HackerRank;

public class CountingValleys {
	public static int countingValleys(int steps, String path) {
		int nivel = 0;
		int result = 0;

		for (int i=0; i<steps; i++) {
			if (path.charAt(i) == 'U') {
				if (nivel == -1) result++;
				nivel++;
			}
			if (path.charAt(i)=='D') {
				nivel--;
			}
		}
		return result;
	}
}
