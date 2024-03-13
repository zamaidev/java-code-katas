package LeetCode;

public class RotateArrayM {

    public static void main(String[] args) {
        int k = 2;
        int[] nums = {1,2,3,4,5,6,7};

        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < k; i++) { // i = 0
            // [1,2,3,4,5,6,7]
            for (int ii = 0; ii <= nums.length; ii++) {// ii = 6
                if (ii + 1 >= nums.length) { // nums[7] == null -> YES
                    temp2 = nums[temp1]; // temp2 = 1, temp1 = 0
                    nums[temp1] = nums[i]; // nums[0] = 7
                    // [7,2,3,4,5,6,7], temp1 = 0
                    for (int iii = temp1 + 1; iii < nums.length; iii++, temp1++) { // iii = 1, temp1 = 0
                        nums[iii] = temp2;
                        temp2 = nums[iii]+1;
                    }
                }
            }
        }
    }
}
