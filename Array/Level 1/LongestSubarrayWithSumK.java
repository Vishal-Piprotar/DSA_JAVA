package Easy;
import java.util.HashMap;

public class LongestSubarrayWithSumK {

    // public static int lss(int arr[], int k) {
    //     int len = 0;
    //     int sum = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i; j < arr.length; j++) {
    //             sum += arr[j];
    //             if (sum == k) {
    //                 len = Math.max(len, j - i + 1);
    //             }
    //         }
    //     }
    //     return len;

    // }


    public static int lss(int arr[],int k){
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            if(sum==k){
                count=i+1;
            }

            int second = sum-k;
            if(map.containsKey(second)){
                count=Math.max(count, i-map.get(second));
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 9 };
        int k = 10;
        System.out.println(lss(arr, k));
    }
}
