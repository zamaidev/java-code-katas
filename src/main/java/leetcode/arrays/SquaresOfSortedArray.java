package leetcode.arrays;

import static leetcode.arrays.Solution.sortedSquares;
import java.util.Arrays;

public class SquaresOfSortedArray {
	public static void main(String[] args) {
		int[] nums = {-4,-1,0,3,10};
		System.out.println(Arrays.toString(sortedSquares(nums)));
	}
}

class Solution {
	public static int[] sortedSquares(int[] nums) {
		return Arrays.stream(nums).map(num -> num * num).sorted().toArray();
	}
}