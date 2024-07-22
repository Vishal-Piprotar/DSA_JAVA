import java.util.Arrays;

public class MedianArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        Arrays.sort(array);
        int n = array.length;
        double median;
        
        if (n % 2 == 0) {
            median = (array[n / 2 - 1] + array[n / 2]) / 2.0;
        } else {
            median = array[n / 2];
        }
        
        System.out.println("Median of the array: " + median);
    }
}
