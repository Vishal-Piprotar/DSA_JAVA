public class MaxConsecutiveOnes {
    public static int findMax(int arr[]) {
        int count = 0;
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {

            // if 1 count inc
            if (arr[i] == 1) {
                count++;
                ans = Math.max(ans, count);
            } else {
                // if zero then count 0 to start
                count = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 1,1,1,1, 0, 1, 1, 1 };
        System.out.println(findMax(arr));
    }
}
