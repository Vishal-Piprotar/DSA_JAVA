import java.util.Arrays;

public class CountingSort {
    
    // Method to perform counting sort
    public void countingSort(int[] arr) {
        // Edge case: if the array is empty or has only one element
        if (arr == null || arr.length <= 1) {
            return;
        }

        // Find the maximum and minimum values in the array
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        
        // Calculate the range of the input values
        int range = max - min + 1;

        // Create and initialize the count array
        int[] count = new int[range];
        Arrays.fill(count, 0);

        // Create the output array
        int[] output = new int[arr.length];

        // Count the occurrences of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }

        // Compute the cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Place the elements in sorted order in the output array
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy the sorted elements back to the original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        CountingSort sorter = new CountingSort();
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        sorter.countingSort(arr);
        
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}
