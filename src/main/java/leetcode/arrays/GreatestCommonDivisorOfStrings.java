package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestCommonDivisorOfStrings {
	public static void main(String[] args) {
		
	}

	public static String gcdOfStrings(String str1, String str2) {
        
        /*
        se existe na string (em ordem), atribui o restante a um List
        se nao existe, retorna ""
        */

        List<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
		List<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));

		int count = 0;
		for (int i = 0; i <= list1.size(); i++) {
			if (list1.get(i).equals(list2.get(i))) {
				count++;
				list1.add(i,"");
			}
		}
		list1.removeIf(filter -> filter.equals(""));
		if (count < list2.size()) return "";
		return list1.toString();
    }
}
