// import java.util.HashMap;

// public class CountSubarraySumEqualsK {

//     public static int countSubarrays(int arr[],int k){
//         int count=0;
//         int sum=0;
//         HashMap<Integer,Integer> map = new HashMap<>();
//         map.put(0,1);


//         for (int i : arr) {
//             sum+=i;
    
//             int currentSum= sum-k;
//             if(map.containsKey(currentSum)){
//                 count+=map.get(currentSum);
//             }

//             map.put(sum, map.getOrDefault(sum,0)+1);
//         }

//         return count;

//     }
//     public static void main(String[] args) {
//         int[] nums = {1, 1, 1};
//         int K = 2;
//         int result = countSubarrays(nums, K);
//         System.out.println("Number of subarrays with sum " + K + ": " + result);
//     }
// }


public class CountSubarraySumEqualsK {
    public static int countSubarrays(int[] nums, int K) {
        int count = 0;
    
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == K) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int K = 2;
        int result = countSubarrays(nums, K);
        System.out.println("Number of subarrays with sum " + K + ": " + result);
    }
}
