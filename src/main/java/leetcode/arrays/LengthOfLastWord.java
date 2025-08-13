package leetcode.arrays;

import java.util.Arrays;
import java.util.List;

public class LengthOfLastWord {

	public static void main(String[] args) {

	}

	public static int lengthOfLastWord(String s) {
		String regex = "[,\\.\\s]";
		String[] myArray = s.split(regex);

		List<String> list = Arrays.asList(myArray);

		return list.getLast().length();
	}
}
