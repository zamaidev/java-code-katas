package leetcode;

public class FindFirstAndLast {

	class Solution {
		public int[] searchRange(int[] nums, int target) {
			int j = 0;
			int low = 0;
			int high = nums.length - 1;

			int[] list = new int[0];

			while (j < 2) {
				while (low <= high) {
					int mid = low + (high-low) / 2;

					if (nums[mid] == target) {
						high = mid -1; //array é cortado
					} else if (nums[mid] > target) {
						high = mid - 1;
					} else { // arr[mid] < target
						low = mid + 1;
					}
				}
			}
			return list;
		}
	}
}
