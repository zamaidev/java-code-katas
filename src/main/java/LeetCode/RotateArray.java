package LeetCode;

public class RotateArray {

    public static void main(String[] args) {
        int k = 2;
        int[] nums = {1,2,3,4,5,6,7};

        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        int n = nums.length;
        reverseNum(nums,0,n-1);
        reverseNum(nums,0,k-1);
        reverseNum(nums,k,n-1);
    }
    public static void reverseNum(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
