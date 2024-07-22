import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Arrays.sort(nums);
        int n = nums.length;
        int maxProduct = Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 1] * nums[n - 2] * nums[n - 3]);

        System.out.println("Maximum product of three numbers is: " + maxProduct);
    }
}
