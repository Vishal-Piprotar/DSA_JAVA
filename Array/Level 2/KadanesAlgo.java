/*
 * KADANES ALGORITHM FOR SUBARRAY
 */

public class KadanesAlgo {
    public static int maxSubArraySum(int arr[]){
        int currentMax=arr[0];
        int globalMax=arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax=Math.max(arr[i],currentMax+arr[i]);
            globalMax=Math.max(currentMax, globalMax);
        }


        return globalMax;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};  
       System.out.println( maxSubArraySum(arr));

    }
}
