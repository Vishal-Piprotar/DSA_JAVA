import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    // Method to perform bucket sort
    public static void bucketSort(float[] arr) {
        // Step 1: Create buckets
        int n = arr.length;
        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }
        
        // Step 2: Distribute the elements into buckets
        for (float num : arr) {
            int bucketIndex = (int) (num * n);
            if (bucketIndex >= n) bucketIndex = n - 1; // Edge case handling
            buckets[bucketIndex].add(num);
        }
        
        // Step 3: Sort each bucket
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }
        
        // Step 4: Concatenate all buckets into the original array
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (float num : buckets[i]) {
                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = {0.78f, 0.17f, 0.39f, 0.26f, 0.72f, 0.94f, 0.21f, 0.12f};
        System.out.println("Original Array:");
        for (float num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        bucketSort(arr);
        
        System.out.println("Sorted Array:");
        for (float num : arr) {
            System.out.print(num + " ");
        }
    }
}
