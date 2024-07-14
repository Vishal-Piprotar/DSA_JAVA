package Easy;
import java.util.Arrays;

public class secondLarge {
    public static int second(int arr[]) {

        // M1
        // Arrays.sort(arr);
        // return arr[arr.length-2];

        // M2
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        arr[index]=Integer.MIN_VALUE;
        int smax= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>smax){
                smax=arr[i];
            }
        }
        arr[index]=max;
        return smax;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 54, 87, 51, 2, 0 };
        // System.out.println(second(arr));
        System.out.println(second(arr));
    }
}
