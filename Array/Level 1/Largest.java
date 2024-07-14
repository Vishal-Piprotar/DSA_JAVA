package Easy;
import java.util.Arrays;

/**
 * Largest
 */
public class Largest {
    public static int findLargest(int arr[]) {

        // M1
        // int max=arr[0];

        // M2
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < arr.length; i++) {
        // if(arr[i]>max){
        // max=arr[i];
        // }
        // }
        // return max;

        // M3
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 54, 87, 51, 2, 0 };
        System.out.println(findLargest(arr));
    }
}