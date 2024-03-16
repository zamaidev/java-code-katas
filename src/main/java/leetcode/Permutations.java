package leetcode;

import java.util.ArrayList;
import java.util.List;

class Permutations {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		backtrack(nums, 0, list);
		return list;
	}

	public void backtrack (int[] nums, int index, List<List<Integer>> list) {
		if (index == nums.length) {
			List<Integer> ds = new ArrayList<>();
			for (int i = 0; i < nums.length; i++) {
				ds.add(nums[i]);
			}
			list.add(ds);
			return;
		}

		for (int i = index; i < nums.length; i++) {
			int temp = nums[i];
			nums[i] = nums[index];
			nums[index] = temp;

			backtrack(nums, index+1, list);

			temp = nums[i];
			nums[i] = nums[index];
			nums[index] = temp;
		}
	}
}