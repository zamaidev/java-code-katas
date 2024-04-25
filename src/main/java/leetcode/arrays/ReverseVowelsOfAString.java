package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowelsOfAString {

    public static void main(String[] args) {

    }

    public static String reverseVowels(String s) {
        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));

		for (String s : list) {
			if (s.contains("a") || s.contains("e") || s.contains("i")
				|| s.contains("o") || s.contains("u")) {
				
			}
		}
		return null;
    }
}
