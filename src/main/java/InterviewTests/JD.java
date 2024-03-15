package InterviewTests;

class JD {
	static int firstNonRepeating(String str) {
		char[] count = new char[80];

		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;

		int index = -1;

		for (int i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 1) {
				index = i + 1;
				break;
			}
		}

		return index;
	}
}
