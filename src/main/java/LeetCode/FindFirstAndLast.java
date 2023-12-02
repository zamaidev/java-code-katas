package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindFirstAndLast {

	class Solution {
		public int[] searchRange(int[] nums, int target) {
			int i = -1, j = 0;
			int low = 0;
			int high = nums.length - 1;

			int[] list = new int[0];

			while (j < 2) {
				int temp = 1;
				while (low <= high) {
					int mid = low + (high-low) / 2;

					if (nums[mid] == target) {
						i = mid;
						high = mid -1; //array é cortado
					} else if (nums[mid] > target) {
						high = mid - 1;
					} else { // arr[mid] < target
						low = mid + 1;
					}
				}
				//list.add(i[temp]);
				//nums.remove(i[temp]);
				temp++;
			}
			return list;
		}
	}
}
