package GeeksForGeeks;

class FindRepeatedChars {
	static final int NO_OF_CHARS = 256;
	static char count[] = new char[NO_OF_CHARS];

	/* calculate count of characters
	   in the passed string */
	static void getCharCountArray(String str)
	{
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
	}

	static int findRepeated(String str)
	{
		getCharCountArray(str);
		int sum = 0, i;

		for (i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] > 1) {
				sum++;
				break;
			}
		}

		return sum;
	}
}